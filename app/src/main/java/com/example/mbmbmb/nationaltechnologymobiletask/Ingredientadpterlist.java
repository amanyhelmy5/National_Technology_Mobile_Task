package com.example.mbmbmb.nationaltechnologymobiletask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by mbmbmb on 6/6/2017.
 */
public  class Ingredientadpterlist extends RecyclerView.Adapter<Ingredientadpterlist.ViewHolder> {
    Context cc;
    List<Ingredient> ingredientll;

    public Ingredientadpterlist(Context cc, List<Ingredient> ingredientll) {
        this.cc = cc;
        this.ingredientll = ingredientll;
    }
    @Override
    public int getItemCount() {
        return ingredientll.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ingredients, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bb(ingredientll.get(position));

    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView  Ingredientname;
        ViewHolder(View view) {

            super(view);
            Ingredientname = (TextView) view.findViewById(R.id.Ingredient_name);
        }
            public void bb(Ingredient intIngredient) {
            Ingredientname.setText(intIngredient.getName());
            }
    }
}
