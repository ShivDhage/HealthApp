package com.example.shiv.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class activity_3 extends AppCompatActivity {

    int calories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Intent intent2 = getIntent();
        calories = intent2.getIntExtra("CALORIE_AMOUNT", 0);

        TextView txtView = (TextView) findViewById(R.id.calorieText);
        txtView.setText("" + calories);

        TextView txtView2 = (TextView) findViewById(R.id.lessOrMoreText);
        txtView2.setText("less");

    }
}
