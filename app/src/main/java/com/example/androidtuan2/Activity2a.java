package com.example.androidtuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2a extends AppCompatActivity {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2a);

        btnLogin = findViewById(R.id.btnClick);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity2a.this, "Login", Toast.LENGTH_SHORT).show();

            }
        });
    }
}