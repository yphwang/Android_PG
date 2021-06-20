package com.example.part2_3;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.part2_3.databinding.ActivityLab33Binding;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener {

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lab33);

        trueBtn=findViewById(R.id.btn_visible_true);
        targetTextView=findViewById(R.id.text_visible_target);
        falseBtn=findViewById(R.id.btn_visible_false);

        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

            @Override
            public void onClick(View v) {

                if(v==trueBtn) {
                    targetTextView.setVisibility(View.VISIBLE);
                }else if(v==falseBtn) {
                    targetTextView.setVisibility(View.INVISIBLE);

                }
            }



}