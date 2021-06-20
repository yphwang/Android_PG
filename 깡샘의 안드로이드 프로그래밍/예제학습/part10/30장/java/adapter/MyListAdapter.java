package com.example.part10_30.adapter;


import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.part10_30.databinding.ItemMainBinding;
import com.example.part10_30.model.ItemModel;


public class MyListAdapter  {

    //add~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        ItemMainBinding binding = ItemMainBinding.inflate(layoutInflater, parent, false);
        return new ItemViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        //add~~~~~~~~~~~~~~~~~~~~~~~~
        
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public ItemMainBinding binding;
        public ItemViewHolder(ItemMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
