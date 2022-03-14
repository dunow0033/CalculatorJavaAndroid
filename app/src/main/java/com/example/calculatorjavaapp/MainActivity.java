package com.example.calculatorjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextFirstValue = findViewById(R.id.first_number);
        EditText editTextSecondValue = findViewById(R.id.second_number);
        Button button = findViewById(R.id.btn_add);
        TextView textViewSolution = findViewById(R.id.txt_solution);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstValue = editTextFirstValue.getText().toString();
                String secondValue = editTextSecondValue.getText().toString();
                int solution = Integer.valueOf(firstValue) + Integer.valueOf(secondValue);
                textViewSolution.setText(String.valueOf(solution));
            }
        });
    }
}