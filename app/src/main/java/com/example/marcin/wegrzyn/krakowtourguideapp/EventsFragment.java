package com.example.marcin.wegrzyn.krakowtourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list,container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.airshow,R.string.airshow_desc,R.drawable.airshow));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) view.findViewById(R.id.PlaceList);
        listView.setAdapter(placeAdapter);


        return view;
    }

}
