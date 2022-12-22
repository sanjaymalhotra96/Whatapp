package com.example.whatsapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MyAdaptor2 extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;


    public MyAdaptor2(MainActivity mainActivity, FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);
        myContext = mainActivity;
        this.totalTabs = tabCount;

    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                CommunityFragment communityFragment = new CommunityFragment();
                return communityFragment;
            case 1:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;
            case 2:
                StatusFragment statusFragment = new StatusFragment();
                return statusFragment;
            case 3:
                CallsFragment callsFragment = new CallsFragment();
                return callsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
