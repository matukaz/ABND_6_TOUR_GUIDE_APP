package com.teddydev.abnd_6_tour_guide.MainView;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.teddydev.abnd_6_tour_guide.R;

public class MainActivity extends AppCompatActivity {

    private CategoryAdapter pagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     * https://loodusegakoos.ee/kuhuminna/voimaluste-otsing?element_holder%5Bobject_type%5D%5B%5D=Telkimisala&search=1&search_type=Puhkeala&element%5Btitle%5D=#tulemus
     */
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        pagerAdapter = new CategoryAdapter(getSupportFragmentManager(), this);

        // Set up the ViewPager with the sections adapter.
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
