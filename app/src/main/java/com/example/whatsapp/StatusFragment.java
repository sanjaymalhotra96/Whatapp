package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StatusFragment extends Fragment {

    RecyclerView recyclerView,recyclerView1;
    LinearLayoutManager linearLayoutManager,linearLayoutManager1;
    RecentUpdateAdaptor recentUpdateAdaptor;
    ViewedUpdateAdaptor viewedUpdateAdaptor;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.status_fragment, container, false);
        recyclerView=view.findViewById(R.id.recent_update_recyclerview);
       recyclerView1=view.findViewById(R.id.Viewed_update_recyclerview);

        recentUpdateAdaptor=new RecentUpdateAdaptor(StatusFragment.this);
        linearLayoutManager=new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recentUpdateAdaptor);

        viewedUpdateAdaptor=new ViewedUpdateAdaptor(StatusFragment.this);
        linearLayoutManager1=new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(viewedUpdateAdaptor);

        return view;
    }
}
