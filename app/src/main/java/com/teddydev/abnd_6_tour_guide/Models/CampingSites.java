package com.teddydev.abnd_6_tour_guide.Models;

/**
 * Created by Matu on 07.02.2017.
 */

public class CampingSites implements Place {

    private String name;
    private String location;
    private int photo = EMPTY_PICTURE;
    private static final int EMPTY_PICTURE = 0;

    public CampingSites(String name, String location, int photo) {
        this.name = name;
        this.location = location;
        this.photo = photo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescriptions() {
        return location;
    }

    @Override
    public int getPhoto() {
        return photo;
    }
}
