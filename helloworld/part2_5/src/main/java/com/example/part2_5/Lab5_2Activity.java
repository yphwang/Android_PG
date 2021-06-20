package com.example.part2_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Lab5_2Activity extends AppCompatActivity implements View.OnClickListener {
    Button alerBtn;
    Button listBtn;
    Button dateBtn;
    Button timeBtn;
    Button cusromDialogBtn;

    AlertDialog customDialog;
    AlertDialog listDialog;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab52);

        alerBtn=findViewById(R.id.btn_alert);
        listBtn=findViewById(R.id.btn_list);
        dateBtn=findViewById(R.id.btn_date);
        timeBtn=findViewById(R.id.btn_time);
        cusromDialogBtn=findViewById(R.id.btn_custom);

        alerBtn.setOnClickListener(this);
        listBtn.setOnClickListener(this);
        dateBtn.setOnClickListener(this);
        timeBtn.setOnClickListener(this);
        cusromDialogBtn.setOnClickListener(this);

    }

    private void showToast(String message) {
        Toast toast=Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    DialogInterface.OnClickListener dislogListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            if(dialog==customDialog && which == DialogInterface.BUTTON_POSITIVE) {
                showToast("custom dialog 확인 click....");
            } else if(dialog==listDialog) {
                String[] datas=getResources().getStringArray(R.array.dialog_array);
                showToast(datas[which]+" 선택하셨습니다.");
            } else if(dialog==alertDialog && which==DialogInterface.BUTTON_POSITIVE) {
                showToast("alert dialog ok click....");
            }
        }
    };

    @Override
    public void onClick(View v) {

        if(v==alerBtn) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setIcon(android.R.drawable.ic_dialog_alert);
            builder.setTitle("알림");
            builder.setMessage("정말로 종료 하시겠습니까 ?");
            builder.setPositiveButton("OK", dislogListener);
            builder.setNegativeButton("NO", null);

            alertDialog=builder.create();
            alertDialog.show();

        } else if (v==listBtn) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("알림 벨소리");
            builder.setSingleChoiceItems(R.array.dialog_array, 0, dislogListener);
            builder.setPositiveButton("확인", null);
            builder.setNegativeButton("취소", null);

            listDialog=builder.create();
            listDialog.show();

        } else if(v==dateBtn) {

            Calendar c=Calendar.getInstance();
            int year=c.get(Calendar.YEAR);
            int month=c.get(Calendar.MONTH);
            int day=c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dateDialog=new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            showToast(year+":"+(month+1)+":"+dayOfMonth);
                        }
                    }, year, month, day);
            dateDialog.show();
        } else if(v==timeBtn) {

            Calendar c=Calendar.getInstance();
            int hour=c.get(Calendar.HOUR_OF_DAY);
            int minute=c.get(Calendar.MINUTE);

            TimePickerDialog timeDialog=new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            showToast(hourOfDay+":"+minute);
                        }
                    }, hour, minute, false);
            timeDialog.show();

        } else if(v==cusromDialogBtn) {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);

            LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.dialog_layout, null);
            builder.setView(view);

            builder.setPositiveButton("확인", dislogListener);
            builder.setNegativeButton("취소", null);

            customDialog=builder.create();
            customDialog.show();

        }

    }
}