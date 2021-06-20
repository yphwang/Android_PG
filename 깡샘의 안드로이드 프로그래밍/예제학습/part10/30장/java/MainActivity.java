package com.example.part10_30;


import android.arch.lifecycle.ViewModelProviders;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.part10_30.adapter.MyListAdapter;
import com.example.part10_30.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyListAdapter(getApplicationContext());

        //add~~~~~~~~~~~~~~~~~~~~~~
        
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    }

    @BindingAdapter("bind:publishedAt")
    public static void publishedAt(TextView view, String date) {
        view.setText(AppUtils.getDate(date) + " at " + AppUtils.getTime(date));
    }

    @BindingAdapter("bind:urlToImage")
    public static void urlToImage(ImageView view, String url) {
        Glide.with(MyApplication.context).load(url).override(250, 200).into(view);
    }
}