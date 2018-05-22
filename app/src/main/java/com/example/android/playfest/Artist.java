package com.example.android.playfest;


import java.io.Serializable;

/**
 * This class define the an artist methods and attributes
 */

public class Artist implements Serializable{

    private String mName;
    private Song[] mSongs;
    private int mImageResourceId;


    public Artist (String name, Song[] songs, int imageResourceId) {

        mName = name;
        mSongs = songs;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }
    public Song[] getSongs() { return mSongs;}
    public int getImageResourceId() { return mImageResourceId;}
}
