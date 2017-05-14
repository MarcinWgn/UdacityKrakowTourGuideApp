package com.example.marcin.wegrzyn.krakowtourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import static com.example.marcin.wegrzyn.krakowtourguideapp.R.id.viewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager pager = (ViewPager) findViewById(viewPager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this,getSupportFragmentManager());
        pager.setAdapter(categoryAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

    }
}
