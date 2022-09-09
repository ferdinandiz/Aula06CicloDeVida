package com.fer.aula06_ciclodevida;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class TelaTres extends AppCompatActivity {
    Button btnVoltar, btnCalendar;
    TextView data, data2;
    DatePickerDialog.OnDateSetListener datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_tres);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnCalendar = findViewById(R.id.btnCalendar);
        data = findViewById(R.id.data);
        data2 = findViewById(R.id.data2);

        data.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int dia = calendar.get(Calendar.DAY_OF_MONTH);
                int mes = calendar.get(Calendar.MONTH);
                int ano = calendar.get(Calendar.YEAR);
                DatePickerDialog dialog = new DatePickerDialog(
                        TelaTres.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        datePicker, ano, mes, dia);
                dialog.getWindow().setBackgroundDrawable(
                        new ColorDrawable(Color.TRANSPARENT)
                );
                dialog.show();
            }
        });

        datePicker = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month+=1;
                String texto = day+"/"+month+"/"+year;
                data.setText(texto);
            }
        };

        Intent recebeData = getIntent();
        String dataIntent = recebeData.getStringExtra("data");
        data2.setText(dataIntent);
        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaTres.this, Calendario.class);
                startActivity(i);
                finish();
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaTres.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}