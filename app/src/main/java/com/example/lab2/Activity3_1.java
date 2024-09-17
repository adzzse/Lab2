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

    EditText Etext1, Etext2, Etext3;
    Button btn1;
    TextView Tviewcreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity3_1);

        Etext1 = findViewById(R.id.Etext1);
        Etext2 = findViewById(R.id.Etext2);
        Etext3 = findViewById(R.id.Etext3);
        btn1 = findViewById(R.id.btn1);
        Tviewcreate = findViewById(R.id.Tviewcreate);

        Tviewcreate.setOnClickListener(view -> {
            Intent intent = new Intent(Activity3_1.this, Activity3.class);
            startActivity(intent);
        });

        btn1.setOnClickListener(view -> {
            String username = Etext1.getText().toString().trim();
            String password = Etext2.getText().toString().trim();
            String confirmPassword = Etext3.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(Activity3_1.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(Activity3_1.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Activity3_1.this, "Account created!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}