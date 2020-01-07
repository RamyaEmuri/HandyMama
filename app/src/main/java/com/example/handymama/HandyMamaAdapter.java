package com.example.handymama;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HandyMamaAdapter extends RecyclerView.Adapter<HandyMamaAdapter.MyViewHolder> {

    private ArrayList<HandyMamaData> handyMamaData;
    HandyMamaAdapter(HandyMamaSelectingScreen handyMamaSelectingScreen, ArrayList<HandyMamaData> mamaData, ArrayList<HandyMamaData> handyMamaData){
        this.handyMamaData = handyMamaData;
    }
    Context context;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.handymama_card,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final HandyMamaAdapter.MyViewHolder holder, final int position) {
        HandyMamaData objData = handyMamaData.get(position);
//        holder.imageView.setImageDrawable(holder.imageView.getContext().getResources().getDrawable(objData.image));
        Glide.with(holder.itemView).load(objData.image).into(holder.imageView);
        holder.textView.setText(objData.name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            context = view.getContext();
                Intent intent = new Intent(context, BookingService.class);
//                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation((Activity)context , holder.imageView, "imageShare");
                intent.putExtra(BookingService.EXTRA_MESSAGE, handyMamaData.get(holder.getAdapterPosition()).name);
                intent.putExtra(BookingService.EXTRA_POSTER,handyMamaData.get(holder.getAdapterPosition()).image);
                context.startActivity(intent);
//                context.startActivity(intent, optionsCompat.toBundle());
            }
        });

    }


    @Override
    public int getItemCount() {
        return handyMamaData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            textView = itemView.findViewById(R.id.textView3);
        }
    }
}

