package com.example.part7_21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Lab21_3Activity extends AppCompatActivity {
    ImageView gifView;
    ImageView networkView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab21_3);
        gifView=findViewById(R.id.lab3_gif);
        networkView=findViewById(R.id.lab3_network);

        
        
    }
}
