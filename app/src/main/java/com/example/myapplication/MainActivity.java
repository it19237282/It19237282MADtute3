package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNum1;
    EditText etNum2;
    private Intent packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = findViewById(R.id.editTextNumber3);
        etNum2 = findViewById(R.id.editTextNumber4);
    }

    public void openSecond(View view){

        Intent intent = new Intent(this,SecondActivity.class);
        String name;
        intent.putExtra("n1",etNum1.getText().toString());
        intent.putExtra("n2",etNum2.getText().toString());

        //Toast.makeText(this, "opening the calculator..", Toast.LENGTH_SHORT).show();


        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();




        startActivity(intent);
    }
}