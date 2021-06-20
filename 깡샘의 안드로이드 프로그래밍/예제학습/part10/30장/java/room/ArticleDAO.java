package com.example.part10_30.room;


import android.arch.paging.DataSource;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;


import com.example.part10_30.model.ItemModel;

@Dao
public interface ArticleDAO {

    //add~~~~~~~~~~~~~~~~~~~~~~


    @Insert
    void insertAll(ItemModel... users);

    @Query("DELETE FROM article")
    void deleteAll();
}
