package com.example.handymama;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class View3Adapter extends RecyclerView.Adapter<View3Adapter.MyViewHolder> {
    private ArrayList<View3Data> view3Data;
    View3Adapter(ArrayList<View3Data> view3Data1){
        this.view3Data = view3Data1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view3_card,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        View3Data objData = view3Data.get(position);
        holder.imageView.setImageDrawable(holder.imageView.getContext().getResources().getDrawable(objData.image));
        holder.textView.setText(objData.title);
    }
    @Override
    public int getItemCount() {
        return view3Data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView32);
            textView = itemView.findViewById(R.id.textTitle);

        }
    }
}
