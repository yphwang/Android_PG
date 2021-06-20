package com.example.test2_6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    TextView bellTextView;
    TextView labelTextVeiw;
    CheckBox repeatCheckView;
    CheckBox vibrateCheckView;
    Switch switchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bellTextView = findViewById(R.id.bell_name);
        labelTextVeiw=findViewById(R.id.label);
        repeatCheckView=findViewById(R.id.repeatCheck);
        vibrateCheckView=findViewById(R.id.vibrate);
        switchView=findViewById(R.id.onOff);


    }



    private void showToast(String message){
        Toast toast=Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    
}
