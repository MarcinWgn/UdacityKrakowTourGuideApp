package com.example.marcin.wegrzyn.krakowtourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marcin on 13.05.2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place>{
    public PlaceAdapter(@NonNull Context context, @NonNull ArrayList<Place> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        Place place = getItem(position);

        TextView title = (TextView) view.findViewById(R.id.TitleItem);
        title.setText(place.getName());

        TextView description = (TextView) view.findViewById(R.id.DescItem);
        description.setText(place.getDescription());

        ImageView imageView = (ImageView) view.findViewById(R.id.ImageView);

        if(place.hasImage()){
            imageView.setImageResource(place.getImageResource());
        }else {
            imageView.setVisibility(View.GONE);
        }

        return view;
    }
}
