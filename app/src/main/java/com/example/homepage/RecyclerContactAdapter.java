package com.example.homepage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homepage.MainActivity;
import com.example.homepage.R;
import com.example.homepage.ui.ItemModel;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ItemModel> arrItem;

    Animation animation;
    RecyclerContactAdapter(MainActivity context, ArrayList<ItemModel> arrItem){
        this.context = (Context) context;
        this.arrItem = arrItem;
    }
//    private void setAnimation(View viewToAnimation,int position){
//        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
//        viewToAnimation.setAnimation(animation);
//    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.itemrow,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemimg.setImageResource(arrItem.get(position).itemimg);
        holder.itemname.setText(arrItem.get(position).itemname);
        holder.itemprice.setText(arrItem.get(position).itemprice);

//        setAnimation(holder.itemView,position);
    }

    @Override
    public int getItemCount() {
        return arrItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView itemname, itemprice;
        ImageView itemimg;
        public ViewHolder(View itemView){
            super(itemView);

            itemname = itemView.findViewById(R.id.itemname);
            itemprice = itemView.findViewById(R.id.itemprice);
            itemimg = itemView.findViewById(R.id.itemimg);

        }

    }
}

