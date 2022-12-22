package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatAdaptor extends RecyclerView.Adapter<ChatAdaptor.MyViewHolder> {


    public ChatAdaptor(ChatsFragment chatsFragment) {
    }

    @NonNull
    @Override
    public ChatAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chats_recyclerview, parent, false);
        return new ChatAdaptor.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    {
    }
}
