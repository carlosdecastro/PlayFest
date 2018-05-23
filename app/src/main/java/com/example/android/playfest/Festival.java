package com.example.android.playfest;


/**
 * This class define the festival methods and attributes
 */

public class Festival {

    private String mName;
    private Artist[] mArtists;
    private static Festival currentFestival;

    public Festival(String name, Artist[] artists) {
        mName = name;
        mArtists = artists;
        currentFestival = this;
    }

    public String getName() {
        return mName;
    }

    public Artist[] getnArtists() {
        return mArtists;
    }

    public static Festival getCurrentFestival() {
        return currentFestival;
    }

    public static void setCurrentFestival(Festival currentFestival) {
        Festival.currentFestival = currentFestival;
    }
}
