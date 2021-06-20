package com.example.part10_29.model;



import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

//add~~~~~~~~~~~~~~~~~

public class ItemModel {
    //add~~~~~~~~~~~~~~~~~~~

    public long id;
    public String author;
    public String title;
    public String description;
    public String urlToImage;
    public String publishedAt;
}
