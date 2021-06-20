package com.example.part10_30.room;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.part10_30.model.ItemModel;


@Database(entities = {ItemModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ArticleDAO articleDao();
}
