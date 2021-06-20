package com.example.part7_19;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Lab19_2Activity extends AppCompatActivity implements View.OnClickListener{
    Button basicBtn;
    Button bigPictureBtn;
    Button bigTextBtn;
    Button inboxBtn;
    Button progressBtn;
    Button headsupBtn;
    Button messageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab19_2);

        basicBtn=findViewById(R.id.lab2_basic);
        bigPictureBtn=findViewById(R.id.lab2_bigpicture);
        bigTextBtn=findViewById(R.id.lab2_bigtext);
        inboxBtn=findViewById(R.id.lab2_inbox);
        progressBtn=findViewById(R.id.lab2_progress);
        headsupBtn=findViewById(R.id.lab2_headsup);
        messageBtn=findViewById(R.id.lab2_message);

        basicBtn.setOnClickListener(this);
        bigPictureBtn.setOnClickListener(this);
        bigTextBtn.setOnClickListener(this);
        inboxBtn.setOnClickListener(this);
        progressBtn.setOnClickListener(this);
        headsupBtn.setOnClickListener(this);
        messageBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        
    }
}
