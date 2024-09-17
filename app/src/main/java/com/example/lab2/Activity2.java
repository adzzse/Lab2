package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    //khai bao
    Button btn4, btn5, btn6, btn7;
    EditText Enum1, Enum2;
    TextView TAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity2);

        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        Enum1 = findViewById(R.id.Enum1);
        Enum2 = findViewById(R.id.Enum2);
        TAnswer = findViewById(R.id.TAnswer);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Enum1.getText().toString());
                int num2 = Integer.parseInt(Enum2.getText().toString());

                int cal = num1 - num2;
                String result = String.valueOf(cal);
                System.out.println(result);
                TAnswer.setText(result);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Enum1.getText().toString());
                int num2 = Integer.parseInt(Enum2.getText().toString());
                int cal = num1 * num2;
                String result = String.valueOf(cal);
                System.out.println(result);
                TAnswer.setText(result);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Enum1.getText().toString());
                int num2 = Integer.parseInt(Enum2.getText().toString());
                int cal = num1 + num2; //  cong
                String result = String.valueOf(cal);
                System.out.println(result);
                TAnswer.setText(result);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(Enum1.getText().toString());
                int num2 = Integer.parseInt(Enum2.getText().toString());

                double cal = 0;
                if (num2 > 0) {
                    cal = (double)num1 / (double)num2;
                }
                String result = String.valueOf(cal);
                System.out.println(result);
                TAnswer.setText(result);
            }
        });

    }
}