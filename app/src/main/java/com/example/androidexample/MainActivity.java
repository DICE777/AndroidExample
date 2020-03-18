package com.example.androidexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PRACTICE :: Service
        Button serviceButton = findViewById(R.id.button_service);
        serviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ServiceActivity.class);
                startActivity(intent);
            }
        });

        // PRACTICE :: Adapter
        Button adapterButton = findViewById(R.id.button_adapter);
        adapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdapterActivity.class);
                startActivity(intent);
            }
        });

        // PRACTICE :: Adapter2
        Button adapterButton2 = findViewById(R.id.button_adapter2);
        adapterButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AdapterActivity2.class);
                startActivity(intent);
            }
        });


        // PRACTICE :: MVVM
        Button mvvmButton = findViewById(R.id.button_mvvm);
        mvvmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MvvmActivity.class);
                startActivity(intent);
            }
        });
    }
}