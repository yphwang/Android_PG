package com.example.part10_30.datasource;


import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.part10_30.MyApplication;
import com.example.part10_30.model.ItemModel;
import com.example.part10_30.model.PageListModel;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MyDataSource  {

    private static final String QUERY = "travel";
    private static final String API_KEY = "~~~~~~~~~~~~~";

   

    class InsertDataThread extends Thread {
        List<ItemModel> articles;
        public InsertDataThread(List<ItemModel> articles){
            this.articles=articles;
        }
        @Override
        public void run() {
            MyApplication.dao.deleteAll();
            MyApplication.dao.insertAll(articles.toArray(new ItemModel[articles.size()]));
        }
    }
}
