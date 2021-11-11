package com.example.labcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNum0, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9,
            btnAC, btnPlusMinus, btnPercent, btnDivide, btnTimes, btnPlus, btnMinus, btnComma;
    TextView textViewInputResult;
    String process;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNum0=findViewById(R.id.btnNum0);
        btnNum1=findViewById(R.id.btnNum1);
        btnNum2=findViewById(R.id.btnNum2);
        btnNum3=findViewById(R.id.btnNum3);
        btnNum4=findViewById(R.id.btnNum4);
        btnNum5=findViewById(R.id.btnNum5);
        btnNum6=findViewById(R.id.btnNum6);
        btnNum7=findViewById(R.id.btnNum7);
        btnNum8=findViewById(R.id.btnNum8);
        btnNum9=findViewById(R.id.btnNum9);

        btnAC=findViewById(R.id.btnAC);
        btnPlusMinus=findViewById(R.id.btnPlusMinus);
        btnPercent=findViewById(R.id.btnPercent);
        btnDivide=findViewById(R.id.btnDivide);
        btnTimes=findViewById(R.id.btnTimes);
        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnComma=findViewById(R.id.btnComma);

        textViewInputResult=findViewById(R.id.textViewInputResult);


        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputResult.setText("");
            }
        });

        btnNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"0");
            }
        });

        btnNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"1");
            }
        });

        btnNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"2");
            }
        });

        btnNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"3");
            }
        });

        btnNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"4");
            }
        });

        btnNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"5");
            }
        });

        btnNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"6");
            }
        });

        btnNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"7");
            }
        });

        btnNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"8");
            }
        });

        btnNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=textViewInputResult.getText().toString();
                textViewInputResult.setText(process+"9");
            }
        });






























    }
}