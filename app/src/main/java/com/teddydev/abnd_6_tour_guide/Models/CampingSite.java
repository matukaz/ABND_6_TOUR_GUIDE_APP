package com.teddydev.abnd_6_tour_guide.Models;

/**
 * Created by Matu on 07.02.2017.
 */

public class CampingSite implements Place {

    private String name;
    private String description;
    private int photo = EMPTY_PICTURE;
    private static final int EMPTY_PICTURE = 0;

    public CampingSite(String name, String description, int photo) {
        this.name = name;
        this.description = description;
        this.photo = photo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescriptions() {
        return description;
    }

    @Override
    public int getPhoto() {
        return photo;
    }
}
