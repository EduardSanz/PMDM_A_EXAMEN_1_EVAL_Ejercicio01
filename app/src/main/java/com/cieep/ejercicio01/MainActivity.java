package com.cieep.ejercicio01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblTiempo;
    private TextView lblTemperatura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblTemperatura = findViewById(R.id.lblTemperatura);
        lblTiempo = findViewById(R.id.lblTiempo);
        lblTiempo.setText("");
        lblTemperatura.setText("");
    }


    public void configuraTemperatura(View view){
        Button btn = (Button) view;
        lblTemperatura.setText(btn.getText());
    }

    public void configuraTiempo(View view) {
        Button btn = (Button) view;
        lblTiempo.setText(btn.getText());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("TEMP", lblTemperatura.getText().toString());
        outState.putString("TIME", lblTiempo.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String tiempo = savedInstanceState.getString("TIME");
        String temp = savedInstanceState.getString("TEMP");
        lblTemperatura.setText(temp);
        lblTiempo.setText(tiempo);
    }
}