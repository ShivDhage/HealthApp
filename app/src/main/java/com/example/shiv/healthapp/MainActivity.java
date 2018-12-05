package com.example.shiv.healthapp;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "Button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton GenderButton = findViewById(R.id.GenderButton);
        GenderButton.setOnClickListener(v -> {
            Log.d("Toggle Button", "Gender Button Clicked");

        });

        final Button BMRButton = findViewById(R.id.BMRButton);
        BMRButton.setOnClickListener(v -> {
            Log.d("Button", "BMR Calculation Button Clicked");

        });

        final TextView Gender = findViewById(R.id.Gender);
        Gender.setOnClickListener(v -> {
            Log.d("TextView", "Gender Text clicked");

        });

        final TextView Weight = findViewById(R.id.Weight);
        Gender.setOnClickListener(v -> {
            Log.d("TextView", "Weight Text clicked");

        });

        final TextView Age = findViewById(R.id.Age);
        Gender.setOnClickListener(v -> {
            Log.d("TextView", "Age Text clicked");

        });

        final TextView Height = findViewById(R.id.Height);
        Height.setOnClickListener(v -> {
            Log.d("TextView", "Height Text clicked");

        });

        final TextView ActivityLevel = findViewById(R.id.ActivityLevel);
        ActivityLevel.setOnClickListener(v -> {
            Log.d("TextView", "ActivityLevel Text clicked");

        });

        final TextView ActivityLevelExp = findViewById(R.id.ActivityLevelExp);
        ActivityLevelExp.setOnClickListener(v -> {
            Log.d("TextView", "ActivityLevelExp Text clicked");

        });

        final TextView BMRText = findViewById(R.id.BMRText);
        BMRText.setOnClickListener(v -> {
            Log.d("TextView", "BMR Text clicked");

        });

        Spinner mySpinner = (Spinner) findViewById(R.id.Activity_dropdown);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}
