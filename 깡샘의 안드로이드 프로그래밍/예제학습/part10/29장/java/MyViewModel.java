package com.example.part10_29;



import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import com.example.part10_29.model.ItemModel;
import com.example.part10_29.model.PageListModel;
import com.example.part10_29.retrofit.RetrofitFactory;
import com.example.part10_29.retrofit.RetrofitService;
import com.example.part10_29.room.AppDatabase;
import com.example.part10_29.room.ArticleDAO;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyViewModel extends ViewModel {

    private static final String QUERY = "travel";
    private static final String API_KEY = "~~~~~~~~~~~~~~~";
    RetrofitService networkService = RetrofitFactory.create();
    //add~~~~~~~~~~~~~~~~~~~~~~`

    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    private MutableLiveData<List<ItemModel>> getNewsFromNetwork(){
        Log.d("kkang","getNewsFromNetwork......");
        MutableLiveData<List<ItemModel>> liveData=new MutableLiveData<>();
        networkService.getList(QUERY, API_KEY, 1, 10)
                .enqueue(new Callback<PageListModel>() {
                    @Override
                    public void onResponse(Call<PageListModel> call, Response<PageListModel> response) {
                        if (response.isSuccessful()) {
                            liveData.postValue(response.body().articles);
                            //add~~~~~~~~~~~~~~~~~
                            
                            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                        }
                    }

                    @Override
                    public void onFailure(Call<PageListModel> call, Throwable t) {

                    }
                });
        return liveData;
    }

    //add~~~~~~~~~~~~~~~~~~~~

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~

}
