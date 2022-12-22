package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CallsFragment  extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    CallAdaptor callAdaptor;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calls_fragment, container, false);
        recyclerView=view.findViewById(R.id.recent_recyclerview);

        callAdaptor=new CallAdaptor(CallsFragment.this);
        linearLayoutManager=new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(callAdaptor);


        return view;
    }
}
