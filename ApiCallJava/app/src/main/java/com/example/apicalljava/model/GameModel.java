package com.example.apicalljava.model;


import com.google.gson.annotations.SerializedName;

public class GameModel {
    private int id;
    private String title;
    @SerializedName("thumbnail")
    private String thumbnailUrl;
    @SerializedName("short_description")
    private String shortDescription;

    public GameModel(int id, String title, String thumbnailUrl, String shortDescription) {
        this.id = id;
        this.title = title;
        this.thumbnailUrl = thumbnailUrl;
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
