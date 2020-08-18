package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    String number1;
    String number2;
    TextView lblsum;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNum1 = findViewById(R.id.editTextNumber);
        etNum2 = findViewById(R.id.editTextNumber2);
        lblsum = findViewById(R.id.lblsum);

        Intent intent = getIntent();

        number1 =intent.getStringExtra("n1");
        number2 =intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);


    }


    public void add(View view){

        lblsum.setText(number1 + "+" + number2 + "=" + (n1+n2));

    }

    public void substract(View view){

        lblsum.setText(number1 + "-" + number2 + "=" + (n1-n2));

    }

    public void multiply(View view){

        lblsum.setText(number1 + "x" + number2 + "=" + (n1*n2));

    }

    public void devide(View view){

        lblsum.setText(number1 + "/" + number2 + "=" + (n1/n2));

    }






}