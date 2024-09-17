package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    EditText Etext1, Etext2;
    Button btn1;
    TextView Tviewcreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity3);

        Etext1 = findViewById(R.id.Etext1);
        Etext2 = findViewById(R.id.Etext2);
        btn1 = findViewById(R.id.btn1);
        Tviewcreate = findViewById(R.id.Tviewcreate);

        Tviewcreate.setOnClickListener(view -> {
            Intent intent = new Intent(Activity3.this, Activity3_1.class);
            startActivity(intent);
        });

        btn1.setOnClickListener(view -> {
            String username = Etext1.getText().toString().trim();
            String password = Etext2.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(Activity3.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Activity3.this, "Logged in!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}