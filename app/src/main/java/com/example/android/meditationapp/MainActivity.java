package com.example.android.meditationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows rain category
        TextView rain = (TextView) findViewById(R.id.rain);

        // Set a click listener on that View
        rain.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RainActivity}
                Intent rainIntent = new Intent(MainActivity.this, RainActivity.class);
                // Start the new activity
                startActivity(rainIntent);
            }
        });


        // Find the View that shows forest category
        TextView forest = (TextView) findViewById(R.id.forest);

        // Set a click listener on that View
        forest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ForestActivity}
                Intent forestIntent = new Intent(MainActivity.this, ForestActivity.class);
                // Start the new activity
                startActivity(forestIntent);
            }
        });


        // Find the View that shows birds category
        TextView birds = (TextView) findViewById(R.id.birds);

        // Set a click listener on that View
        birds.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BirdsActivity}
                Intent birdsIntent = new Intent(MainActivity.this, BirdsActivity.class);
                // Start the new activity
                startActivity(birdsIntent);
            }
        });


        // Find the View that shows ocean category
        TextView ocean = (TextView) findViewById(R.id.ocean);

        // Set a click listener on that View
        ocean.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OceanActivity}
                Intent oceanIntent = new Intent(MainActivity.this, OceanActivity.class);
                // Start the new activity
                startActivity(oceanIntent);
            }
        });


        // Find the View that shows om category
        TextView om = (TextView) findViewById(R.id.om);

        // Set a click listener on that View
        om.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OmActivity}
                Intent omIntent = new Intent(MainActivity.this, OmActivity.class);
                // Start the new activity
                startActivity(omIntent);
            }
        });
    }
}
