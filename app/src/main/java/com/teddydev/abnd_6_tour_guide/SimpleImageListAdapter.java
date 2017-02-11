package com.teddydev.abnd_6_tour_guide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.teddydev.abnd_6_tour_guide.Models.Place;

import java.util.ArrayList;

/**
 * Created by Matu on 07.02.2017.
 */

public class SimpleImageListAdapter extends ArrayAdapter<Place> {
    public SimpleImageListAdapter(Context context, ArrayList<Place> arrayList) {
        super(context, 0, arrayList);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place place = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        TextView location = (TextView) listItemView.findViewById(R.id.description);
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        title.setText(place.getName());
        location.setText(place.getDescriptions());
        if(place.getPhoto() != 0) {
            image.setVisibility(View.VISIBLE);
            image.setImageResource(place.getPhoto());
        }

        return listItemView;
    }
}
