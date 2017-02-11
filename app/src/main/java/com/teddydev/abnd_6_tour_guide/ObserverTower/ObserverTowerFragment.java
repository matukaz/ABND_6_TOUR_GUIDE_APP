package com.teddydev.abnd_6_tour_guide.ObserverTower;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.teddydev.abnd_6_tour_guide.Models.ObserverTower;
import com.teddydev.abnd_6_tour_guide.Models.Place;
import com.teddydev.abnd_6_tour_guide.R;
import com.teddydev.abnd_6_tour_guide.SimpleImageListAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * https://loodusegakoos.ee/where-to-go/search-options?element_holder%5Bobject_type%5D%5B%5D=Observation+Tower&search=1&search_type=Puhkeala&element%5Btitle%5D=#tulemus
 */
public class ObserverTowerFragment extends Fragment {

    private ArrayList<Place> observerTowerList = new ArrayList<>();

    public ObserverTowerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        observerTowerList.add(new ObserverTower("Aluoja observation platform","Northern Shore of Lake Peipus Recreation Area"));
        observerTowerList.add(new ObserverTower("Harimägi observation tower and campfire site","Otepää Nature Park"));
        observerTowerList.add(new ObserverTower("Iisaku observation tower","Northern Shore of Lake Peipus Recreation Area"));
        observerTowerList.add(new ObserverTower("Keemu observation tower","Matsalu National Park"));

        SimpleImageListAdapter wordAdapter = new SimpleImageListAdapter(getContext(), observerTowerList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        observerTowerList.clear();
    }
}
