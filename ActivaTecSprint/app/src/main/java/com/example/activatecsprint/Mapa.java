package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mapa extends AppCompatActivity {

    private Button inicio, piso3;
    private ImageButton mapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        inicio = (Button) findViewById(R.id.inicio);
        mapa = (ImageButton) findViewById(R.id.mapafuera);
        piso3 = (Button) findViewById(R.id.pisoo3);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goInicio();
            }
        });

        mapa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goMapa();
            }
        });

        piso3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goPiso3();
            }
        });

    }


    private void goInicio() {
        Intent intent = new Intent(this, Menu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goMapa() {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goPiso3() {
        Intent intent = new Intent(this, Piso3.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}