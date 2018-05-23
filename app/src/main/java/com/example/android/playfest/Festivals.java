package com.example.android.playfest;

import java.util.ArrayList;

//This class contains an array of Festivals that can be access with static methods.

public class Festivals {
    private static ArrayList<Festival> mFestivals;

    public Festivals(ArrayList<Festival> festivals) {
        mFestivals = festivals;
    }

    public static ArrayList<Festival> getFestivals() {
        return mFestivals;
    }

    public static void setFestivals(ArrayList<Festival> mFestivals) {
        Festivals.mFestivals = mFestivals;
    }
}
