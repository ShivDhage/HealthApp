package com.example.shiv.healthapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;


public class activity_2 extends AppCompatActivity {

    private static final String LOG_TAG = "Button";

    String loseOrGain = "";
    int pounds;
    Double BMR;

    EditText poundsInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        BMR = intent.getDoubleExtra("BMR", 0);

        TextView txtView = (TextView) findViewById(R.id.BMRNum);
        txtView.setText("" + BMR);


        poundsInput = (EditText) findViewById(R.id.poundsInput);

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

    public void launchThirdActivity(View view) {
        Log.d(LOG_TAG, "Suggestion Button clicked");
        pounds = Integer.valueOf(poundsInput.getText().toString());

        int passedCalories = pounds * 500;

        Intent intentTwo = new Intent(this, activity_3.class);
        intentTwo.putExtra("CALORIE_AMOUNT", passedCalories);
        startActivity(intentTwo);
    }
}
