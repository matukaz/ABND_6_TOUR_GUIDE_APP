package com.teddydev.abnd_6_tour_guide.Models;

/**
 * Created by Matu on 07.02.2017.
 */

public class RestStop implements Place {

    private String name;
    private String description;
    private int photo = EMPTY_PICTURE;
    private static final int EMPTY_PICTURE = 0;

    public RestStop(String name, String location) {
        this.name = name;
        this.description = location;
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
