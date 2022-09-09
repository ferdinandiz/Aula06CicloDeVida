package com.fer.aula06_ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaUm extends AppCompatActivity {
    Button btnTela1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_um);
        btnTela1 = findViewById(R.id.btnTela1);
        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mudaTela();
            }
        });
    }

    public void mudaTela(){
        Intent i = new Intent(TelaUm.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}