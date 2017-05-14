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
public class TopPlacesFragment extends Fragment {


    public TopPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.place_list,container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.main_market,R.string.main_market_desc,R.drawable.rynek));
        places.add(new Place(R.string.sukiennice,R.string.sukiennice_desc,R.drawable.sukiennice));
        places.add(new Place(R.string.mariacki,R.string.mariacki_desc,R.drawable.mariacki));
        places.add(new Place(R.string.wawel_katedra,R.string.wawel_katedra_desc,R.drawable.katedra_wawel));
        places.add(new Place(R.string.wawel_zamek,R.string.wawel_zamek_desc,R.drawable.wawel_zamek));
        places.add(new Place(R.string.brama_florianska,R.string.brama_florianska_desc,R.drawable.florianska));
        places.add(new Place(R.string.barbakan,R.string.barbakan_desc,R.drawable.barbakan));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) view.findViewById(R.id.PlaceList);
        listView.setAdapter(placeAdapter);


        return view;
    }

}
