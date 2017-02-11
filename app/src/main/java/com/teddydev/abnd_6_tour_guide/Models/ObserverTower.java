package com.teddydev.abnd_6_tour_guide.Models;

/**
 * Created by Matu on 07.02.2017.
 */

public class ObserverTower implements Place {

    private String name;
    private String description;
    private int photo = EMPTY_PICTURE;
    private static final int EMPTY_PICTURE = 0;

    public ObserverTower(String name, String description) {
        this.name = name;
        this.description = description;
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
