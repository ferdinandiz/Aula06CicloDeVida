package com.fer.aula06_ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaDois extends AppCompatActivity {
    Button btnTela2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);

        btnTela2 = findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaDois.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}