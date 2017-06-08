package com.example.mbmbmb.nationaltechnologymobiletask;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.mbmbmb.nationaltechnologymobiletask.VolleySingletonClass.AppController;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ALLRecipes extends AppCompatActivity implements  TextWatcher,Postionclick {
    EditText sreachtext;
    ImageButton imagesreach;
    RecyclerView recyclerView;
    Recipelist relistadpter;
    List<Recipes> recipesll;
    Button refresh;
    private RecyclerView.LayoutManager Layoutmanger;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allrecipes);
        sreachtext = (EditText) findViewById(R.id.search);
        sreachtext.addTextChangedListener(this);
        imagesreach = (ImageButton) findViewById(R.id.searchimage);
        Layoutmanger = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.items);
        recyclerView.setLayoutManager(Layoutmanger);
       CustomItemDuration decoration = new CustomItemDuration(15, 1);
        recyclerView.addItemDecoration(decoration);

        imagesreach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sreachtext.length() > 0 && checkInternetConenction())
                    APIOven(1);
                else if (sreachtext.length() < 1 && checkInternetConenction())
                    APIOven(0);
                else
                    Toast.makeText(getApplicationContext(), "No Internet Connection .. ", Toast.LENGTH_LONG).show();
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    @Override
    protected void onResume() {
        super.onResume();

        if (checkInternetConenction())
            APIOven(0);
        else
            Toast.makeText(getApplicationContext(), "No Internet Connection .. ", Toast.LENGTH_LONG).show();
    }

    private void viewrecipes(List<Recipes> recipes) {
        relistadpter = new Recipelist(getApplicationContext(), recipes, this);
        recyclerView.setAdapter(relistadpter);
    }

    @Override
    public boolean supportRequestWindowFeature(int featureId) {
        return super.supportRequestWindowFeature(featureId);
    }


       public void josn(String ovenurl) {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, ovenurl, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {


                recipesll = new ArrayList<>();
                try {
                    JSONArray array = response.getJSONArray("Results");
                    if (array.length() < 1 && sreachtext.length() > 0) {
                        Toast.makeText(getApplicationContext(), "No found !! ", Toast.LENGTH_LONG).show();
                    } else {
                        for (int i = 0; i < array.length(); i++) {
                            Gson gson = new Gson();
                            Recipes recipe = gson.fromJson(array.getJSONObject(i).toString(), Recipes.class);
                            recipesll.add(recipe);
                        }
                        viewrecipes(recipesll);
                    }
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

        AppController.getInstance().addToRequestQueue(jsonObjectRequest);


    }

    String RecipesAPI = "https://api2.bigoven.com/recipes";
    String RecipesKey = "?api_key=axV15293h59oU9Z853fw48CmI1H1Js";
 //
    String searchAPI = "http://api2.bigoven.com/recipes?pg=1&rpp=25&title_kw=";
    String searchKey = "&api_key=axV15293h59oU9Z853fw48CmI1H1Js";

    public void APIOven(int handle) {
        if (handle == 0)
            josn(RecipesAPI + RecipesKey);
        else
            josn(searchAPI+ sreachtext.getText() + searchKey);
    }

    @Override
    public void clickitem(int position) {
        Intent intent = new Intent(getApplicationContext(), Details.class);
        //  getSerializableExtra
        intent.putExtra("recipe_id",recipesll.get(position));
        startActivity(intent);
    }


    private boolean checkInternetConenction() {
        // get Connectivity Manager object to check connection
        ConnectivityManager connec
                = (ConnectivityManager) getSystemService(getBaseContext().CONNECTIVITY_SERVICE);

        // Check for network connections
        if (connec.getNetworkInfo(0).getState() ==
                NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() ==
                        NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() ==
                        NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED) {
            Toast.makeText(this, " Connected ", Toast.LENGTH_LONG).show();
            return true;
        } else if (
                connec.getNetworkInfo(0).getState() ==
                        NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() ==
                                NetworkInfo.State.DISCONNECTED) {
            Toast.makeText(this, " Not Connected ", Toast.LENGTH_LONG).show();
            return false;
        }
        return false;
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override

        public void onTextChanged (CharSequence s,int start, int before, int count){
            final String query = s.toString().toLowerCase().trim();
            final ArrayList<Recipes> newlist = new ArrayList<>();
if(s.length()<1)
{

}
        if(s.length()>1)
        {
            for (int i = 0; i < recipesll.size(); i++) {
                final String text = recipesll.get(i).getTitle().toLowerCase();
                if (text.contains(query)) {
                    newlist.add(recipesll.get(i));
                }
            }

        }
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            recipesll = newlist;
            relistadpter = new Recipelist(getApplicationContext(), recipesll, this);
            recyclerView.setAdapter(relistadpter);

        }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public void onStart() {
        super.onStart();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "ALLRecipes Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.mbmbmb.nationaltechnologymobiletask/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "ALLRecipes Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.mbmbmb.nationaltechnologymobiletask/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

}

