package com.example.shiv.healthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ToggleButton;


public class activity_2 extends AppCompatActivity {

    private static final String LOG_TAG = "Button";

    String loseOrGain = "";
    int pounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final ToggleButton loseGainButton = findViewById(R.id.loseGainButton);
        loseGainButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                loseOrGain = "gain";
                Log.d(LOG_TAG, "Gain Chosen");
            } else {
                loseOrGain = "lose";
                Log.d(LOG_TAG, "Lose Chosen");
            }
        });


        final Button suggestionButton = findViewById(R.id.suggestionButton);

    }
}
