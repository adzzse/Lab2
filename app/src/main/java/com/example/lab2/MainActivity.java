package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);

        bt1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        });
        bt2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });
        bt3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });


    }
}