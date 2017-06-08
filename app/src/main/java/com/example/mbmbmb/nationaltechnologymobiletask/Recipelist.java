package com.example.mbmbmb.nationaltechnologymobiletask;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mbmbmb on 6/6/2017.
 */
public class Recipelist extends RecyclerView.Adapter<Recipelist.ViewHolder> {
    ImageView image;
    TextView title;
    TextView category;
    RatingBar Rating;
    Context c;

    List<Recipes>rl;

    CardView CVV;
    Recipes v;
    private Postionclick clickpostion;

    public Recipelist(Context c, List<Recipes> rl, Postionclick clickpostion) {
        this.c = c;
        this.rl = rl;
        this.clickpostion = clickpostion;
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipesitems, parent, false);
        return new ViewHolder (view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.bb(rl.get(position));
    }
    @Override
    public int getItemCount() {
        return rl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            image = (ImageView) view.findViewById(R.id.recipe_image);
            title = (TextView) view.findViewById(R.id.recipe_title);
            category = (TextView) view.findViewById(R.id.recipe_category);
           Rating = (RatingBar)view.findViewById(R.id.recipe_Rating);

        }
        /*
        public void upDateEntries( List<Recipes>rll) {
            rl = rll;
            notifyDataSetChanged();
        }
        */
        @Override
        public void onClick(View view) {
            clickpostion.clickitem(getLayoutPosition());
        }


        public void bb(Recipes re) {
            Picasso.with(c).load(Uri.parse(re.getPhotoUrl())).into(image);
            title.setText(re.getTitle());
            category.setText(re.getCategory());
            double dd = re.getStarRating().intValue();

            Rating.setRating((float) dd / 2);




        }

    }
  }
