package com.teddydev.abnd_6_tour_guide.MainView;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.teddydev.abnd_6_tour_guide.Drinks.DrinkFragment;
import com.teddydev.abnd_6_tour_guide.Food.CampsFragment;
import com.teddydev.abnd_6_tour_guide.R;
import com.teddydev.abnd_6_tour_guide.Services.ServiceFragment;
import com.teddydev.abnd_6_tour_guide.Shops.ShopsFragment;

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
                return new DrinkFragment();
            case 2:
                return new ShopsFragment();
            case 3:
                return new ServiceFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.food_title);
            case 1:
                return context.getString(R.string.drink_title);
            case 2:
                return context.getString(R.string.shops_title);
            case 3:
                return context.getString(R.string.Service_title);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
