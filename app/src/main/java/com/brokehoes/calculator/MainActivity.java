package com.brokehoes.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber, editTextNumber2;
    TextView textView;
    Button btAdd, btSub, btMul, btDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView);
        btAdd = findViewById(R.id.btAdd);
        btSub = findViewById(R.id.btSub);
        btMul = findViewById(R.id.btMul);
        btDiv = findViewById(R.id.btDiv);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(editTextNumber.getText().toString());
                secondValue = Integer.parseInt(editTextNumber2.getText().toString());
                ans = firstValue + secondValue;

                textView.setText("Answer: "+ans);
            }
        });
        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(editTextNumber.getText().toString());
                secondValue = Integer.parseInt(editTextNumber2.getText().toString());
                ans = firstValue - secondValue;

                textView.setText("Answer: "+ans);
            }
        });
        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(editTextNumber.getText().toString());
                secondValue = Integer.parseInt(editTextNumber2.getText().toString());
                ans = firstValue * secondValue;

                textView.setText("Answer: "+ans);
            }
        });
        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue, secondValue, ans;

                firstValue = Integer.parseInt(editTextNumber.getText().toString());
                secondValue = Integer.parseInt(editTextNumber2.getText().toString());
                ans = firstValue / secondValue;

                textView.setText("Answer: "+ans);
            }
        });
    }
}