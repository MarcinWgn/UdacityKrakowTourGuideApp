package com.example.marcin.wegrzyn.krakowtourguideapp;

/**
 * Created by Marcin on 13.05.2017.
 */

public class Place {

    private static final int NO_IMAGE = -1;

    private int name;
    private int description;
    private int imageResource;


    public Place(int name, int description) {
        this.name = name;
        this.description = description;
        imageResource = NO_IMAGE;
    }

    public Place(int name, int description, int imageResource) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public boolean hasImage(){
        return imageResource != NO_IMAGE;
    }
}
