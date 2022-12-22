package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton floatingActionButton;
    FloatingActionButton floatingActionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton2=findViewById(R.id.floatingActionButton2);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_baseline_people_alt_24));
        tabLayout.addTab(tabLayout.newTab().setText("CHATS"));
        tabLayout.addTab(tabLayout.newTab().setText("STATUS"));
        tabLayout.addTab(tabLayout.newTab().setText("CALLS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        LinearLayout layout = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
        layoutParams.weight = 0.4f; // e.g. 0.5f
        layout.setLayoutParams(layoutParams);

        final MyAdaptor2 adapter = new MyAdaptor2(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.whatapp);

                //tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.black);
                // tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        floatingActionButton.hide();
                        floatingActionButton2.hide();
                        break;
                    case 1:
                        floatingActionButton.show();
                        floatingActionButton2.hide();
                        floatingActionButton.setImageResource(R.drawable.ic_baseline_message_24);
                        break;
                    case 2:
                        floatingActionButton.show();
                        floatingActionButton2.show();
                        floatingActionButton.setImageResource(R.drawable.ic_baseline_photo_camera_24);
                        break;
                    case 3:
                        floatingActionButton2.hide();
                        floatingActionButton.show();
                        floatingActionButton.setImageResource(R.drawable.ic_baseline_add_ic_call_24);
                        break;
                    default:
                        floatingActionButton2.hide();
                        floatingActionButton.hide();
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }


}