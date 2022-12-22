package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecentUpdateAdaptor extends RecyclerView.Adapter<RecentUpdateAdaptor.MyViewHolder> {


    public RecentUpdateAdaptor(StatusFragment chatsFragment) {
    }

    @NonNull
    @Override
    public RecentUpdateAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_update_recyclerview, parent, false);
        return new RecentUpdateAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentUpdateAdaptor.MyViewHolder holder, int position) {

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