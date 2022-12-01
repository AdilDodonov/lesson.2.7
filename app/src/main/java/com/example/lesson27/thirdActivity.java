package com.example.lesson27;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {
TextView result, result2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        String policy = intent.getStringExtra("policy");
        String productCategoru = intent.getStringExtra("productCategoru");
        String Orginal = intent.getStringExtra("Orginal");
        String polbrandicy = intent.getStringExtra("polbrandicy");
        result = findViewById(R.id.result);
        result2 = findViewById(R.id.result2);
        result.setText(policy);
        result.setText(polbrandicy);




    }
}