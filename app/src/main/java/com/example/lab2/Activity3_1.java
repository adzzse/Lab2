package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3_1 extends AppCompatActivity {

    //khai bao
    EditText Etext1, Etext2, Etext3;
    Button btn1;
    TextView Tviewcreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity3_1);

        // anh xa
        Etext1 = findViewById(R.id.Etext1); // User name field
        Etext2 = findViewById(R.id.Etext2); // Password field
        Etext3 = findViewById(R.id.Etext3); // Confirm Password field
        btn1 = findViewById(R.id.btn1); // Button sign up
        Tviewcreate = findViewById(R.id.Tviewcreate); // Text view use to click create

        Tviewcreate.setOnClickListener(view -> {
            Intent intent = new Intent(Activity3_1.this, Activity3.class);
            startActivity(intent);
        });

        btn1.setOnClickListener(view -> {
            String username = Etext1.getText().toString().trim(); // lay du lieu username
            String password = Etext2.getText().toString().trim(); // lay du lieu password
            String confirmPassword = Etext3.getText().toString().trim(); // lay du lieu Confirm password

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) { // check du lieu rong
                Toast.makeText(Activity3_1.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(Activity3_1.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Activity3_1.this, "Account created!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}