package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewedUpdateAdaptor extends RecyclerView.Adapter<ViewedUpdateAdaptor.MyViewHolder> {


    public ViewedUpdateAdaptor(StatusFragment chatsFragment) {
    }

    @NonNull
    @Override
    public ViewedUpdateAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewed_updates_recyclerview, parent, false);
        return new ViewedUpdateAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewedUpdateAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    {
    }
}