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

        trailsList.add(new Trail("Alatskivi hiking trail (4.5 km)", "The 4.5 km hiking trail runs around Lake Lossijärv next to the famous Alatskivi Manor, and with its alternating terrain, various sights and diverse biota offers wonderful experiences in all seasons."));
        trailsList.add(new Trail("Allika hiking trail (1.2 km)", "Lake Prästviigi in the centre of the Vormsi Island is a former lagoon overgrown in reeds. The lake’s bird population is abundant and diverse, and on silent spring nights you might hear the calling of Eurasian bittern. In the northern part of the lake are numerous springs, the largest of which is Suurallikas (“great spring”) or Ohvriallikas (“sacrificial spring”). The hiking trail leads to the observation tower on the northern shore of Lake Prästviigi."));
        trailsList.add(new Trail("Apteekrimägi hiking trail (4 km)", "Apteekrimägi forest trail is a 4 km loop trail with varied terrain and is excellent for jogging or walking. The trail starts and ends in Mäe street, Otepää, in front of Otepää Sports School. There are 4 large boards with the map of the trail and 2 training sites with logs for log lifting."));
        trailsList.add(new Trail("Audaku hiking trail (2.8 km)", "Viidumäe Nature Reserve is located in the western part of Saaremaa, in the vicinity of the ancient Antsülusjärve escarpment. This is the oldest and highest part of the Saaremaa island, with its top height 59 metres over the sea level. On the escarpment a number of biotopes characteristic of western Saaremaa can be found. The hiking trail starts and ends at the parking area near the office of Viidumäe Nature Reserve. "));
        trailsList.add(new Trail("Härämäe hiking trail (3.4 km)", "The hiking trail is 3.4 km long, starts on the Hallimägi hill and passes through varied landscape as typical to the Haanja area. The trail descends to the valley, where beavers have created their kingdom. Before the trail gets to the Härämägi hill it is possible to explore different forest types. On Härämägi a view opens on the water-bodies that form the spawning area for the northern crested newt. Other attractions include the Sapas’ arboretum, Härämäe village landscape and architecture. The trail is equipped with wooden signs and information boards."));
        trailsList.add(new Trail("Harilaiu hiking trail (11 km or 13 km)", "Diverse and deserted coastal nature. Low and vast horizon, wind, golden sand and mighty waves. Interesting dune landscape, trees and bushes subjected to wind, seal and bird sounds, military objects and Kiipsaare lighthouse in the sea."));
        trailsList.add(new Trail("Huitberg hiking trail (3 km-2 km)", "One of the most captivating places on the Vormsi Island is the Huitberg limestone outcrop in the middle of a spruce forest, in the centre of the island. This more than 400 million years old coral reef smoothed by glacial abrasion has formed from calcareous exoskeletons of animals living in the shallow tropical seas during the Ordovician. On the outcrop, where it is not covered with moss, you can admire fossils or rare protected ferns growing in limestone cavities."));
        trailsList.add(new Trail("Ilmatsalu–Kärevere Linnutee hiking trail (3,5 km)", "The 3,5 km long “Bird’s Way” hiking trail links the most interesting bird-watching sites in the Tartu area—the Ilmatsalu fish ponds, Kärevere and Alam-Pedja Nature Reserves. The Bird’s Way hiking trail offers visitors exciting experiences throughout the year. The Ilmatsalu fish ponds and the surrounding area are the most popular bird-watching sites among ornithology enthusiasts in the Tartu area. More than 200 species of birds have been spotted on the ponds and in the close surroundings. Several endangered species can be seen in Kärevere Nature Reserve."));
        trailsList.add(new Trail("Jalase nature trail (2.6 km)", ""));
        trailsList.add(new Trail("Jõemõisa hiking trail (0.5 km)", "The 0.5 km forest path offers a fascinating walk for visitors of the recreation area. Those who wish to continue their hike can walk the 3 km Tammeluha hiking trail."));
        trailsList.add(new Trail("Käkisilma–Vilsandi hiking trail (5 km)", "Hiking trail goes through the low coastal sea from islet to islet to Vilsandi Island."));

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
