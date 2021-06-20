package com.example.part10_27;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.part10_27.databinding.ActivityMainBinding;
import com.example.part10_27.databinding.ItemMainBinding;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String QUERY = "movies";
    private static final String API_KEY = "~~~~~~~~~~~~~~";

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //add~~~~~~~~~~~~~~~`


        
        //~~~~~~~~~~~~~~~~~

        RetrofitService networkService = RetrofitFactory.create();

        networkService.getList(QUERY, API_KEY, 1, 10)
                .enqueue(new Callback<PageListModel>() {
                    @Override
                    public void onResponse(Call<PageListModel> call, Response<PageListModel> response) {
                        if (response.isSuccessful()) {
                            //add~~~~~~~~~~~~~~~~

                            //~~~~~~~~~~~~~~~~~~~~~~~
                        }
                    }

                    @Override
                    public void onFailure(Call<PageListModel> call, Throwable t) {

                    }
                });

    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        //add~~~~~~~~~~~~~~~~~~

        //~~~~~~~~~~~~~~~~~~~~~~
    }

    class MyAdapter extends RecyclerView.Adapter<ItemViewHolder> {
        List<ItemModel> articles;

        public MyAdapter(List<ItemModel> articles) {
            this.articles = articles;
        }

        @Override
        public int getItemCount() {
            return articles.size();
        }
        //add~~~~~~~~~~~~~~~~~~~~~~
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }
    //add~~~~~~~~~~~~~~~~~~~~~
    
    //~~~~~~~~~~~~~~~~~~~~~~~
}


