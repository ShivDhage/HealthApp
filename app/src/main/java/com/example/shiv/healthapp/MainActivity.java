package com.example.shiv.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    /** Default logging tag for messages from the main activity. */
    private static final String LOG_TAG = "Button";

    int age, weight, height;
    String gender = "";
    String activityLevel = "";

    EditText ageInput;
    EditText weightInput;
    EditText heightInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ageInput = (EditText) findViewById(R.id.ageInput);
        weightInput = (EditText) findViewById(R.id.weightInput);
        heightInput = (EditText) findViewById(R.id.heightInput);

        final ToggleButton GenderButton = findViewById(R.id.genderButton);
        GenderButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                gender = "male";
                Log.d(LOG_TAG, "Male Chosen");
            } else {
                gender = "female";
                Log.d(LOG_TAG, "Female Chosen");
            }
        });

        final Button BMRButton = findViewById(R.id.BMRButton);


    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "BMR Gender Button Clicked");
        age = Integer.valueOf(ageInput.getText().toString());
        weight = Integer.valueOf(weightInput.getText().toString());
        height = Integer.valueOf(heightInput.getText().toString());

        Intent intent = new Intent(this, activity_2.class);
        startActivity(intent);

    }
}
