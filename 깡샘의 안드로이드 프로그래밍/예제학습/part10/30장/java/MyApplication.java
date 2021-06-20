package com.example.part10_30;


import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.part10_30.retrofit.RetrofitFactory;
import com.example.part10_30.retrofit.RetrofitService;
import com.example.part10_30.room.AppDatabase;
import com.example.part10_30.room.ArticleDAO;

public class MyApplication extends Application {

    public static Context context;
    public static ArticleDAO dao;
    public static RetrofitService networkService;
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        AppDatabase db = Room.databaseBuilder(context, AppDatabase.class, "database-name").build();
        dao = db.articleDao();
        networkService = RetrofitFactory.create();
    }
}
