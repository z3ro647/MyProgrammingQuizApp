package com.example.myprogrammingquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    Intent intent;

    public void simpleQuizStartMenu(View v) {
        intent = new Intent(this, SimpleQuizMenu.class);
        startActivity(intent);
    }
}