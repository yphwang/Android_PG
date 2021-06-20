package com.example.part10_30.model;



import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "article")
public class ItemModel {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String author;
    public String title;
    public String description;
    public String urlToImage;
    public String publishedAt;
}
