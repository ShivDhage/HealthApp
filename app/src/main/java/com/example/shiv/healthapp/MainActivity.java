package com.example.shiv.healthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    /** Default logging tag for messages from the main activity. */
    private static final String TAG = "Button";

    int age, weight, height;

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
        GenderButton.setOnClickListener(v -> {
            Log.d("Toggle Button: ", "Gender Button Clicked");
        });

        final Button BMRButton = findViewById(R.id.BMRButton);
        BMRButton.setOnClickListener(v -> {
            Log.d(" ", "Gender Button Clicked");
            age = Integer.valueOf(ageInput.getText().toString());
            weight = Integer.valueOf(weightInput.getText().toString());
            height = Integer.valueOf(heightInput.getText().toString());
            Log.d("Button", "Age: " + age + " / Weight: " + weight + " / height: " + height);

        });

        final TextView Gender = findViewById(R.id.gender);
        Gender.setOnClickListener(v -> {
            Log.d("TextView", "Gender Text clicked");

        });

        final TextView Weight = findViewById(R.id.weight);
        Weight.setOnClickListener(v -> {
            Log.d("TextView", "Weight Text clicked");

        });

        final TextView Age = findViewById(R.id.age);
        Age.setOnClickListener(v -> {
            Log.d("TextView", "Age Text clicked");

        });

        final TextView Height = findViewById(R.id.height);
        Height.setOnClickListener(v -> {
            Log.d("TextView", "Height Text clicked");

        });

        final TextView ActivityLevel = findViewById(R.id.activityLevel);
        ActivityLevel.setOnClickListener(v -> {
            Log.d("TextView", "ActivityLevel Text clicked");

        });

        final TextView ActivityLevelExp = findViewById(R.id.activityLevelExp);
        ActivityLevelExp.setOnClickListener(v -> {
            Log.d("TextView", "ActivityLevelExp Text clicked");

        });

        final TextView BMRText = findViewById(R.id.BMRText);
        BMRText.setOnClickListener(v -> {
            Log.d("TextView", "BMR Text clicked");

        });

        Spinner mySpinner = (Spinner) findViewById(R.id.activityDropdown);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}
