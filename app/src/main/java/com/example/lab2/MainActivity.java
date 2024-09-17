package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button clk1,clk2,clk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clk1 = findViewById(R.id.clk1);
        clk2 = findViewById(R.id.clk2);
        clk3 = findViewById(R.id.clk3);

        clk1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent);
        });
        clk2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });
        clk3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });


    }
}