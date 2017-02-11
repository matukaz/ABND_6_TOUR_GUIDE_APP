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

        campingSites.add(new CampingSite("Krapi campsite", "The campsite is situated in the shade of old coastal pines on the ca 2 km stretch of the seashore.", R.drawable.krapi));
        campingSites.add(new CampingSite("Lake Rae campsite", "The campsite is situated at Lake Rae and is a nice place for a forest recreation, swimming, fishing or hiking on Lake Rae hiking trail. The Kopra tare–Ikla section (74 km) of RMK Hiking Route passes the campsite.", R.drawable.lemme_telkimisala));
        campingSites.add(new CampingSite("Lemme campsite", "Lemme campsite has been a popular holiday destination among domestic and foreign tourists for dozens of years. The campsite is situated on the seashore in the shade of pine trees and is surrounded by fence. The RMK Hiking Route section Kopra tare–Ikla (74 km) passes the campsite.", R.drawable.matsiranna_telkimisala));
        campingSites.add(new CampingSite("Matsiranna campsite", "The seaside campsite is an attractive place for swimming and camping in the summer months.", R.drawable.lemme_telkimisala));
        campingSites.add(new CampingSite("Soontagana campsite", "The campsite is situated in Avaste Nature Reserve. On the Soontagana bog island you can see the ruins of two farmsteads, the history of which can be traced back 22 generations. The first defence structures of the Soontagana hill fort date from the 7th to 8th century. The campsite boasts a rich historical and cultural legacy—old farm sites, stone walls, cellars.", R.drawable.sootagana_telkimisala));

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
