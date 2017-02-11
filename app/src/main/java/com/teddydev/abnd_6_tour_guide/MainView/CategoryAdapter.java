package com.teddydev.abnd_6_tour_guide.MainView;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.teddydev.abnd_6_tour_guide.Camps.CampsFragment;
import com.teddydev.abnd_6_tour_guide.ObserverTower.ObserverTowerFragment;
import com.teddydev.abnd_6_tour_guide.R;
import com.teddydev.abnd_6_tour_guide.RestStops.RestStopsFragment;
import com.teddydev.abnd_6_tour_guide.Trails.TrailsFragment;

/**
 * Created by Matu on 07.02.2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CampsFragment();
            case 1:
                return new TrailsFragment();
            case 2:
                return new RestStopsFragment();
            case 3:
                return new ObserverTowerFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.campsite_title);
            case 1:
                return context.getString(R.string.trails_title);
            case 2:
                return context.getString(R.string.rest_stops_title);
            case 3:
                return context.getString(R.string.observer_tower_title);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
