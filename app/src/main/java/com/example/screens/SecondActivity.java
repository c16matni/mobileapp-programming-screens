package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = findViewById(R.id.getname);
        age = findViewById(R.id.getage);

        Intent intent = getIntent();
        String nameS = intent.getStringExtra("Namn");
        String ageS = intent.getStringExtra("Ålder");

        name.setText(nameS);
        age.setText(ageS);

    }


}