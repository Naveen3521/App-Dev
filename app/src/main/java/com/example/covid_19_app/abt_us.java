package com.example.covid_19_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class abt_us extends AppCompatActivity {
    Button abt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt_us);

        abt = findViewById(R.id.abt_us);

        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(abt_us.this, dev_info.class);
                startActivity(intent);
            }
        });
    }
}