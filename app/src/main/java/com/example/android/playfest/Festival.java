package com.example.android.playfest;

/**
 * This class define the a festival methods and attributes
 */

public class Festival {

    private String mName;
    private Artist[] mArtists;

    public Festival(String name, Artist[] artists) {
        mName = name;
        mArtists = artists;
    }

    public String getName() {
        return mName;
    }

    public Artist[] getnArtists() {
        return mArtists;
    }
}
