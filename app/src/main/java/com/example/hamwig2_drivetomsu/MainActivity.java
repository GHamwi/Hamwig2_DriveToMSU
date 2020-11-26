package com.example.hamwig2_drivetomsu;

/**************** Created by George B. Hamwi Homework 4 *******************/

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* This is the code that starts up google maps and routes to MSU*/

    public void startImplicitIntent(View view) {

        /* This intent is to route to MSU in google maps when the DRIVE TO MSU button is clicked */

        Intent newIntent = new Intent(Intent.ACTION_VIEW);
        newIntent.setData(Uri.parse("geo:0,0?q=Montclair+State+University\n" + "+New Jersey+USA"));
        startActivity(newIntent);
}}