package com.example.lesson27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActiviti extends AppCompatActivity {
    private EditText policy, productCategoru, Orginal, brand;
    private Button Export;
    private String first,second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiti);
        policy = findViewById(R.id.tv_Policy);
        productCategoru = findViewById(R.id.tv_Product);
        Orginal = findViewById(R.id.tv_orgin);
        brand = findViewById(R.id.tv_brand);
        Export = findViewById(R.id.btn_export);

        Export.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (policy.getText().toString().isEmpty() &&
                        productCategoru.getText().toString().isEmpty()&&
                        Orginal.getText().toString().isEmpty()&&brand.getText().toString().isEmpty()){

                    Toast.makeText(SecondActiviti.this,"error",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(SecondActiviti.this,thirdActivity.class);
                    intent.putExtra("policy",policy.getText().toString());
                    intent.putExtra("productCategoru",productCategoru.getText().toString());
                    intent.putExtra("Orginal",Orginal.getText().toString());
                    intent.putExtra("polbrandicy",brand.getText().toString());
                    startActivity(intent);
                    //
                }

            }

        });

    }}