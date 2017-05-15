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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list,container,false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.string.food_stylowa,R.string.food_stylowa_desc));
        places.add(new Place(R.string.food_pod_aniolami,R.string.food_pod_aniloami_desc));
        places.add(new Place(R.string.food_starka,R.string.food_starka_desc));
        places.add(new Place(R.string.food_cyrano,R.string.food_cyrano_desc));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) view.findViewById(R.id.PlaceList);
        listView.setAdapter(placeAdapter);


        return view;
    }

}
