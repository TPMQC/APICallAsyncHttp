package com.example.logan.demoapicall.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


public class Movie {

    private int id;
    private String posterPath;
    private String title;
    private String overView;
    private double rating;
    private String localImageLocation;


    public Movie(@NonNull int id, @NonNull String posterPath, @NonNull String title, @Nullable String overView, @Nullable double rating) {
        this.id = id;
        this.posterPath = posterPath;
        this.title = title;
        this.overView = overView;
        this.rating = rating;
    }
    //getters
    public int getId() {
        return id;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getTitle() {
        return title;
    }

    public String getOverView() {
        return overView;
    }

    public double getRating() {
        return rating;
    }


    public String getLocalImageLocation() {
        return localImageLocation;
    }

    public void setLocalImageLocation(String localImageLocation) {
        this.localImageLocation = localImageLocation;
    }
}
