package com.example.mbmbmb.nationaltechnologymobiletask;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.mbmbmb.nationaltechnologymobiletask.VolleySingletonClass.AppController;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity {


    String DetailsAPI= "https://api2.bigoven.com/recipe/";
    String DetailsKey = "?api_key=axV15293h59oU9Z853fw48CmI1H1Js";
    Ingredientadpterlist ingredientsAdapter;
    List<Ingredient> ingredientList;
    Recipes recipes;

    TextView Title;
    TextView category;
    TextView subcategory;
    RatingBar Rating;
    TextView description;
    RecyclerView recycler;
    ImageView Photo;
    TextView Instructions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ingredientList = new ArrayList<>();
        Intent intent = getIntent();

        Title = (TextView)findViewById(R.id.title);
        category = (TextView)findViewById(R.id.category);
        subcategory = (TextView)findViewById(R.id.subcategory);
        Rating = (RatingBar)findViewById(R.id.rating);
        description = (TextView)findViewById(R.id.description);
        Instructions = (TextView)findViewById(R.id.instructions);
        recycler = (RecyclerView)findViewById(R.id.Ingredients_recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        Photo = (ImageView)findViewById(R.id.image);


       recipes = (Recipes) intent.getSerializableExtra("recipe_id");

        String id = recipes.getRecipeID().toString();
        String url = getRecipesDetailsAPI(id);

        if(checkInternetConenction()) {
            Josn(url);
        }
        else
            Toast.makeText(getApplicationContext(),"No Internet Connection .. ",Toast.LENGTH_LONG).show();

    }


    private boolean checkInternetConenction() {
        // get Connectivity Manager object to check connection
        ConnectivityManager connec
                =(ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);

        // Check for network connections
        if ( connec.getNetworkInfo(0).getState() ==
                android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() ==
                        android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() ==
                        android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED ) {
            Toast.makeText(this, " Connected ", Toast.LENGTH_LONG).show();
            return true;
        }else if (
                connec.getNetworkInfo(0).getState() ==
                        android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() ==
                                android.net.NetworkInfo.State.DISCONNECTED  ) {
            Toast.makeText(this, " Not Connected ", Toast.LENGTH_LONG).show();
            return false;
        }
        return false;
    }

    public  void Josn(String ovenurl) {
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,ovenurl,null,new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                try {
                    Title.setText("Title" + jsonObject.getString("Title"));
                    description.setText("Description : " + jsonObject.getString("Description"));

                    category.setText("Category :" + jsonObject.getString("Category"));

                    subcategory.setText("Subcategory : " + jsonObject.getString("Subcategory"));
                   double dd = (int)jsonObject.getDouble("StarRating");

                    Rating.setRating((float) dd / 2);
                    Picasso.with(getApplicationContext()).load(Uri.parse(jsonObject.getString("ImageURL").toString())).into(Photo);
                    Instructions.setText(jsonObject.getString("Instructions").toString());
                    JSONArray array = jsonObject.getJSONArray("Ingredients");
                    for (int i = 0; i < array.length(); i++) {
                        Gson gson = new Gson();
                        Ingredient ingredient = gson.fromJson(array.getJSONObject(i).toString(), Ingredient.class);
                        ingredientList.add(ingredient);
                    }
                    viewlist(ingredientList);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.e("Volly Error", volleyError.toString());
            }
        });
        AppController.getInstance().addToRequestQueue(request);
    }


    private void viewlist(List<Ingredient> listr){
        ingredientsAdapter = new Ingredientadpterlist(getApplicationContext(),listr);
        recycler.setAdapter(ingredientsAdapter);
    }
    public String getRecipesDetailsAPI(String id){

        return DetailsAPI + id + DetailsKey;
    }
}
