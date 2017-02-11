package com.teddydev.abnd_6_tour_guide.Trails;


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

        restStopsList.add(new RestStop("Ähijärve rest stop","The recreation site is situated in the yard of the visitor centre of Karula National Park. The recreation site has a table and benches and an outdoor shower with fresh drinking water. A good picnic site. The parking area of the visitor centre is next to the recreation site"));
        restStopsList.add(new RestStop("Diby rest stop",""));
        restStopsList.add(new RestStop("Esku rest stop","At Esku recreation site you can enjoy the beauty of the forest and listen to the birds sing. In autumn it is a good place to pick mushrooms"));
        restStopsList.add(new RestStop("Harilaiu rest stop","A stopping point for discovering the most north-west peninsula of Saaremaa. At the Harilaiu peninsula you can view rapid natural processes where the sea is in constant battle with the land."));
        restStopsList.add(new RestStop("Hülkari rest stop","The recreation site offers a magnificent view on Tallinna Bay and Tallinn City. The site is located in the midst of wide and clean sand dunes. The sea by the recreation site is suitable for swimming."));
        restStopsList.add(new RestStop("Ilumetsa rest stop (Meteorite Craters)","Ilumetsa recreation site is situated near meteorite craters in Orava municipality, Põlva County.\n" +
                "There is a tourist information cabin, boardwalk, parking area and dry toilet at the recreation site. Camping with tents is not allowed. The site leads to a fascinating walk to the largest meteorite crater here, called Põrguhaud or “Grave of hell”. Wheelchair accessibility."));
        restStopsList.add(new RestStop("Isabella rest stop",""));
        restStopsList.add(new RestStop("Järve rest stop","Long beach with golden sands, interesting protected plant species can be found under the pine trees. "));

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
