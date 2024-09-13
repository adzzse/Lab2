
package com.example.lab2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtData;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtData =(TextView) findViewById(R.id.txtViewNumber);
        btnClick = (Button) findViewById(R.id.rbutton);

        btnClick.setOnClickListener(view -> {
            Random rand = new Random();
            int num = rand.nextInt(100);
            txtData.setText(num+"");
        });

    }
}