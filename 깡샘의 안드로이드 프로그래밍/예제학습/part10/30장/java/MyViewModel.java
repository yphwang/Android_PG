package com.example.part10_30;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.DataSource;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;


import com.example.part10_30.datasource.MyDataFactory;
import com.example.part10_30.model.ItemModel;


public class MyViewModel extends ViewModel {
    //add~~~~~~~~~~~
    
    public MyViewModel(){
        //add~~~~~~~~~~~~
        
    }

    public LiveData<PagedList<ItemModel>> getNews() {

        ConnectivityManager connectivityManager = (ConnectivityManager) MyApplication.context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null) {
            //add~~~~~~~~~~~~~~~~~~~~~~
            
        } else {
            //add~~~~~~~~~~~~~~~~~~
           
        }
    }

}
