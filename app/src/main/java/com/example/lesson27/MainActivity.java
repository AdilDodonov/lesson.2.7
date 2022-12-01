package com.example.lesson27;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvSum;

    boolean New = true;
    String oldNamber;
    String operator;
    /*Button btnOne, btnTwo, btnPlas, btnEqual;
    Integer firstValue = 0, secondValue = 0;
    Integer sum;*/

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSum = findViewById(R.id.tv_namber);


    }

   /* private void linkVal() {
        tvSum = findViewById(R.id.tv_namber);
        btnOne = findViewById(R.id.btn_one);
        btnTwo = findViewById(R.id.btn_two);
        btnPlas = findViewById(R.id.btn_plas);
        btnEqual = findViewById(R.id.btn_equally);
    }*/

   // private void funPlas() {
       /* btnPlas.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                sum = firstValue + secondValue;
                Toast.makeText(MainActivity.this, sum.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (sum != null){
                    tvSum.setText(sum.toString());
                }else {
                    Toast.makeText(MainActivity.this, "Пуст", Toast.LENGTH_SHORT).show();
                }


            }
        });*/

       /* btnOne.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                firstValue = 1;
                tvSum.setText(firstValue.toString());
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                secondValue = 2;
                tvSum.setText(secondValue.toString());
            }
        });*/
    //}

    @SuppressLint("NonConstantResourceId")
    public void clikNumber(View view) {
        if (New)
            tvSum.setText("");
        New = false;
        String namber = tvSum.getText().toString();
        switch (view.getId()) {
            case R.id.btn_one:
                namber = namber + "1";
                break;
            case R.id.btn_two:
                namber = namber + "2";
                break;
            case R.id.tree:
                namber = namber + "3";
                break;
            case R.id.btn_foot:
                namber = namber + "4";
                break;
            case R.id.btn_five:
                namber = namber + "5";
                break;
            case R.id.six:
                namber = namber + "6";
                break;
            case R.id.btn_seven:
                namber = namber + "7";
                break;
            case R.id.btn_eiqht:
                namber = namber + "8";
                break;
            case R.id.nine:
                namber = namber + "9";
                break;
            case R.id.btn_zero:
                namber = namber + "0";
                break;
            case R.id.point:
                namber = namber + ".";
                break;
        }
        tvSum.setText(namber);
    }

    @SuppressLint("NonConstantResourceId")
    public void operation(View view) {

        New = true;
        oldNamber = tvSum.getText().toString();
        switch (view.getId()) {
            case R.id.btn_plas:
                operator = "+"
                ;
                break;
            case R.id.btn_minus:
                operator = "-"
                ;
                break;
            case R.id.btn_division:
                operator = "/"
                ;
                break;
            case R.id.btn_multiplications:
                operator = "*"
                ;
                break;
        }

    }

    @SuppressLint("SetTextI18n")
    public void clikEqual(View view) {
        String newNamber = tvSum.getText().toString();
        double resuit = 0.0;
        switch (operator) {
            case "+": resuit = Double.parseDouble(oldNamber) + Double.parseDouble(newNamber);break;
            case "-": resuit = Double.parseDouble(oldNamber) - Double.parseDouble(newNamber);break;
            case "/": resuit = Double.parseDouble(oldNamber) / Double.parseDouble(newNamber);break;
            case "*": resuit = Double.parseDouble(oldNamber) * Double.parseDouble(newNamber);break;
        }
        tvSum.setText(resuit+"");

    }

    public void acClik(View view) {
        tvSum.setText("0");
        New = true;

    }

}