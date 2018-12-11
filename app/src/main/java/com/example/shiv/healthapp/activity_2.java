package com.example.shiv.healthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Spinner mySpinner = (Spinner) findViewById(R.id.loseGainInput);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(activity_2.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.loseORgain));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner2 = (Spinner) findViewById(R.id.weightToLoseInput);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(activity_2.this, android.R.layout.simple_list_item_2, getResources().getStringArray(R.array.weighttolose));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

    }
}
