package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CallAdaptor extends RecyclerView.Adapter<CallAdaptor.MyViewHolder> {


    public CallAdaptor(CallsFragment chatsFragment) {
    }

    @NonNull
    @Override
    public CallAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calls_recyclerview, parent, false);
        return new CallAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    {
    }
}
