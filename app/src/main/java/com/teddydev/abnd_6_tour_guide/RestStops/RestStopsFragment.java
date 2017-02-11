package com.teddydev.abnd_6_tour_guide.RestStops;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.teddydev.abnd_6_tour_guide.Models.Place;
import com.teddydev.abnd_6_tour_guide.Models.RestStop;
import com.teddydev.abnd_6_tour_guide.R;
import com.teddydev.abnd_6_tour_guide.SimpleImageListAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * https://loodusegakoos.ee/where-to-go/search-options?element_holder%5Bobject_type%5D%5B%5D=Rest+Stop&search=1&search_type=Puhkeala&element%5Btitle%5D=#tulemus
 */
public class RestStopsFragment extends Fragment {

    private ArrayList<Place> restStopsList = new ArrayList<>();

    public RestStopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        setRetainInstance(true);

        restStopsList.add(new RestStop(getString(R.string.ahijarve_rest_stop),getString(R.string.ahijarve_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.diby_rest_stop),getString(R.string.diby_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.esku_rest_stop),getString(R.string.esku_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.harilaiu_rest_stop),getString(R.string.harilaiu_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.hulkari_rest_stop),getString(R.string.hulkari_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.ilumetsa_rest_stop),getString(R.string.ilumetsa_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.isabella_rest_stop),getString(R.string.isabella_rest_stop_description)));
        restStopsList.add(new RestStop(getString(R.string.jarve_rest_stop),getString(R.string.jarve_rest_stop_description)));

        SimpleImageListAdapter wordAdapter = new SimpleImageListAdapter(getContext(), restStopsList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        restStopsList.clear();
    }
}
