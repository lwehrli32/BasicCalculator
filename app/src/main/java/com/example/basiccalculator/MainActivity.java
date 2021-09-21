    package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

    public class MainActivity extends AppCompatActivity {

    public void add(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        int num1 = Integer.parseInt(number1.getText().toString());

        EditText number2 = (EditText) findViewById(R.id.number2);
        int num2 = Integer.parseInt(number2.getText().toString());

        int total = num1 + num2;
        goToActivity2(total);
    }

    public void subtract(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        int num1 = Integer.parseInt(number1.getText().toString());
        EditText number2 = (EditText) findViewById(R.id.number2);
        int num2 = Integer.parseInt(number2.getText().toString());
        int total = num1 - num2;
        goToActivity2(total);
    }

    public void multiply(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        int num1 = Integer.parseInt(number1.getText().toString());

        EditText number2 = (EditText) findViewById(R.id.number2);
        int num2 = Integer.parseInt(number2.getText().toString());

        int total = num1 * num2;
        goToActivity2(total);
    }

    public void divide(View view){
        EditText number1 = (EditText) findViewById(R.id.number1);
        int num1 = Integer.parseInt(number1.getText().toString());

        EditText number2 = (EditText) findViewById(R.id.number2);
        int num2 = Integer.parseInt(number2.getText().toString());

        int total = num1 / num2;
        goToActivity2(total);
    }

    public void goToActivity2(int total){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", String.valueOf(total));
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}