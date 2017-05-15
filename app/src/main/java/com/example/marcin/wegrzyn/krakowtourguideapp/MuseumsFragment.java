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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.place_list,container,false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.string.museum_cathedral_wawel,R.string.museum_cathedral_wawel_desc,R.drawable.katedra_wawel));
        places.add(new Place(R.string.museum_wawel,R.string.museum_wawel_desc,R.drawable.wawel_zamek));
        places.add(new Place(R.string.museum_main_square_underground,R.string.museum_main_square_underground_desc));
        places.add(new Place(R.string.museum_colegium_maius,R.string.museum_colegium_maius_desc));
        places.add(new Place(R.string.museum_pharmacy,R.string.museum_pharmacy_desc));
        places.add(new Place(R.string.museum_czartoryski,R.string.museum_czartoryski_desc));

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) view.findViewById(R.id.PlaceList);
        listView.setAdapter(placeAdapter);


        return view;
    }

}
