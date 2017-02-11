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

    static class ViewHolder {
        private TextView title;
        private TextView location;
        private ImageView image;
    }

    @NonNull
    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        ViewHolder holder;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.title = (TextView) listItemView.findViewById(R.id.title);
            holder.location = (TextView) listItemView.findViewById(R.id.description);
            holder.image = (ImageView) listItemView.findViewById(R.id.image);
            listItemView.setTag(holder);
        } else {
            holder = (ViewHolder) listItemView.getTag();
        }

        Place place = getItem(position);
        holder.title.setText(place.getName());
        holder.location.setText(place.getDescriptions());
        if (place.getPhoto() != 0) {
            holder.image.setVisibility(View.VISIBLE);
            holder.image.setImageResource(place.getPhoto());
        }

        return listItemView;
    }
}
