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
        places.add(new Place(R.string.event_museum_night,R.string.event_museum_night_desc));
        places.add(new Place(R.string.event_street_theatre,R.string.event_museum_night_desc));
        places.add(new Place(R.string.event_film_festival,R.string.event_film_festival_desc));
        places.add(new Place(R.string.event_jazz_festiwal,R.string.event_jazz_festiwal_desc));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) view.findViewById(R.id.PlaceList);
        listView.setAdapter(placeAdapter);


        return view;
    }

}
