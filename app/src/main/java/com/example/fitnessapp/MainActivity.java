package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i=new Intent(this,registration.class);
        startActivity(i);
    }
    public void bClick(View view) {
        Intent i=new Intent(this,home.class);
        startActivity(i);
    }

    public void btClick(View view) {
        Intent i=new Intent(this,home.class);
        startActivity(i);
    }
}