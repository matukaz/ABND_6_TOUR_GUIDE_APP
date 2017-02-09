package com.teddydev.abnd_6_tour_guide.Food;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.teddydev.abnd_6_tour_guide.Models.CampingSites;
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
        ;

        campingSites.add(new CampingSites("Krapi telkimisala", "Telkimisala asub vanade rannamändide all piki rannikut ca 2 km ulatuses.", R.drawable.krapi));
        campingSites.add(new CampingSites("Lemme telkimisala", "Populaarne puhkuse veetmise koht juba aastakümneid, nii kodu- kui ka välismaalaste hulgas. Telkimisala asub mere kaldal, männimetsa all ja on piiratud aiaga.", R.drawable.lemme_telkimisala));
        campingSites.add(new CampingSites("Matsiranna telkimisala", "Telkimisala paikneb mererannal ja on suvekuudel atraktiivne koht ujumiseks ning telkimiseks. ", R.drawable.matsiranna_telkimisala));
        campingSites.add(new CampingSites("Rae järve telkimisala", "Telkimisala asub Rae järve ääres, hea võimalus veeta metsapuhkust, ujuda, kalastada või teha väike retk Rae järve matkarajal. Telkimisala on heaks peatuskohaks RMK Oandu- Ikla matkateel liikujatele.", R.drawable.lemme_telkimisala));
        campingSites.add(new CampingSites("Soontagana telkimisala", "Telkimisala paikneb Avaste looduskaitsealal. Soontagana rabasaarel on kahe talu varemed, millel teatakse olevat ajalugu 22 inimpõlve. Soontagana maalinna esimesed kaitserajatised pärinevad VII-VIII sajandist. Telkimisala teeb atraktiivseks rikkalik ajaloo- ja kultuuripärand: vanad talukohad, kiviaiad, keldrid.", R.drawable.sootagana_telkimisala));

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
