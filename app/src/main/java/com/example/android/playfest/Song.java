package com.example.android.playfest;

import java.io.Serializable;

/** This class define a song whith his methods and attributes **/

public class Song implements Serializable{

    private String nName;
    private String nAlbum;
    private int nReleaseDate;
    private int mImageResourceId;

    public Song(String name, String album, int releaseDate, int imageResourceId) {

        nName = name;
        nAlbum = album;
        nReleaseDate = releaseDate;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return nName;
    }

    public String getAlbum() {
        return nAlbum;
    }

    public int getReleaseDate() {
        return nReleaseDate;
    }

    public int getImageResourceId() { return mImageResourceId; }
}
