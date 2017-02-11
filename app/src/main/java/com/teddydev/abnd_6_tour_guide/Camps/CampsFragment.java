package com.teddydev.abnd_6_tour_guide.Camps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.teddydev.abnd_6_tour_guide.Models.CampingSite;
import com.teddydev.abnd_6_tour_guide.Models.Place;
import com.teddydev.abnd_6_tour_guide.R;
import com.teddydev.abnd_6_tour_guide.SimpleImageListAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CampsFragment extends Fragment {

    private ArrayList<Place> campingSites = new ArrayList<>();


    public CampsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        setRetainInstance(true);

        campingSites.add(new CampingSite(getString(R.string.krapi_campsite), getString(R.string.krapi_campsite_description), R.drawable.krapi));
        campingSites.add(new CampingSite(getString(R.string.lake_rae_campsite), getString(R.string.lake_rae_campsite_description), R.drawable.lemme_telkimisala));
        campingSites.add(new CampingSite(getString(R.string.lemme_campsite), getString(R.string.lemme_campsite_description), R.drawable.matsiranna_telkimisala));
        campingSites.add(new CampingSite(getString(R.string.matsiranna_campsite), getString(R.string.matsiranna_campsite_description), R.drawable.lemme_telkimisala));
        campingSites.add(new CampingSite(getString(R.string.sootagana_campsite), getString(R.string.sootagana_campsite_description), R.drawable.sootagana_telkimisala));

        SimpleImageListAdapter wordAdapter = new SimpleImageListAdapter(getContext(), campingSites);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        campingSites.clear();
    }
}
