package com.example.marcin.wegrzyn.krakowtourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Marcin on 13.05.2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mcontext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) return new TopPlacesFragment();
        else if (position == 1)return new MuseumsFragment();
        else if (position == 2)return new EventsFragment();
        else return new FoodFragment();
    }

    @Override
    public CharSequence getPageTitle(int position) {


        if(position == 0) return mcontext.getString(R.string.top_places);
        else if (position == 1)return mcontext.getString(R.string.museums);
        else if (position == 2)return mcontext.getString(R.string.events);
        else return mcontext.getString(R.string.food);

    }

    @Override
    public int getCount() {
        return 4;
    }
}
