package com.example.calculatordemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1;
    EditText number2;
    Button btnAdd, btnMultiply, btnSub, btnDiv;


    float result_num;
    float num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        btnAdd = findViewById(R.id.btnAdd);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDiv = findViewById(R.id.btnDiv);
        btnSub = findViewById(R.id.btnSub);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(number1.getText().toString());
                num2 = Float.parseFloat(number2.getText().toString());
                if (num2 != 0) {
                    result_num = num1 / num2;
                } else {
                    result_num = Float.NaN;
                    Toast.makeText(MainActivity.this, "Number 2 can not be 0", Toast.LENGTH_SHORT).show();
                }
                result.setText(String.valueOf(result_num));
            }
        });
    }
}
