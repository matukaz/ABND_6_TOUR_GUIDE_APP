package com.teddydev.abnd_6_tour_guide.Trails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.teddydev.abnd_6_tour_guide.Models.Place;
import com.teddydev.abnd_6_tour_guide.Models.Trail;
import com.teddydev.abnd_6_tour_guide.R;
import com.teddydev.abnd_6_tour_guide.SimpleImageListAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * https://loodusegakoos.ee/where-to-go/search-options?element_holder%5Bobject_type%5D%5B%5D=Hiking+trail&search=1&search_type=Puhkeala&element%5Btitle%5D=#tulemus
 */
public class TrailsFragment extends Fragment {

    private ArrayList<Place> trailsList = new ArrayList<>();

    public TrailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        setRetainInstance(true);

        trailsList.add(new Trail(getString(R.string.alatskivi_hiking_trail), getString(R.string.alatskivi_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.allika_hiking_trail), getString(R.string.allika_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.apteekrimagi_hiking_trail), getString(R.string.apteekrimagi_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.audaku_hiking_trail), getString(R.string.audaku_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.haramae_hiking_trail), getString(R.string.haramae_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.harilaiu_hiking_trail), getString(R.string.harilaiu_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.huitberg_hiking_trail), getString(R.string.huitberg_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.ilmatsalu_karevere_linnutee_hiking_trail), getString(R.string.ilmatsalu_karevere_linnutee_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.jalase_hiking_trail), getString(R.string.jalase_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.joemoisa_hiking_trail), getString(R.string.joemoisa_hiking_trail_description)));
        trailsList.add(new Trail(getString(R.string.kakisilma_vilsandi_hiking_trail), getString(R.string.kakisilma_vilsandi_hiking_trail_description)));

        SimpleImageListAdapter wordAdapter = new SimpleImageListAdapter(getContext(), trailsList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        return rootView;
    }



    @Override
    public void onStop() {
        super.onStop();
        trailsList.clear();
    }
}
