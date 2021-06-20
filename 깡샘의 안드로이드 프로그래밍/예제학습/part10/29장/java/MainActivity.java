package com.example.part10_29;


import android.arch.lifecycle.ViewModelProviders;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.part10_29.databinding.ActivityMainBinding;
import com.example.part10_29.databinding.ItemMainBinding;
import com.example.part10_29.model.ItemModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //add~~~~~~~~~~~~~~~~~~~~~~~~~
        MyViewModel viewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        viewModel.getNews().observe(this, news -> {
            MyAdapter adapter = new MyAdapter(news);
            binding.recyclerView.setAdapter(adapter);
        });
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        ItemMainBinding binding;

        public ItemViewHolder(ItemMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
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
        @NonNull
        @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            ItemMainBinding binding = ItemMainBinding.
                    inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new ItemViewHolder(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
            ItemModel model = articles.get(position);
            holder.binding.setData(model);
        }
    }
    @BindingAdapter("bind:publishedAt")
    public static void publishedAt(TextView view, String date) {
        view.setText(AppUtils.getDate(date) + " at " + AppUtils.getTime(date));
    }

    @BindingAdapter("bind:urlToImage")
    public static void urlToImage(ImageView view, String url) {
        Glide.with(MyApplication.getAppContext()).load(url).override(250, 200).into(view);
    }
}