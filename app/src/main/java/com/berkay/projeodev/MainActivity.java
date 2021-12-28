package com.berkay.projeodev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btnBasla,buttonWho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonWho = findViewById(R.id.buttonWho);
        btnBasla = findViewById(R.id.btnBasla);
        btnBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oyun1 = new Intent(MainActivity.this, com.berkay.projeodev.oyun1.class);
                startActivity(oyun1);
            }
        });
        buttonWho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent who = new Intent(MainActivity.this,gelistirici.class);
                startActivity(who);
            }
        });
    }
}