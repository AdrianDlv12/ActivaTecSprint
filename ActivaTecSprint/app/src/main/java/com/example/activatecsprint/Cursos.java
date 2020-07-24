package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cursos extends AppCompatActivity {

    private Button inicio;
    private ImageButton mate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        inicio = (Button) findViewById(R.id.inicio1);
        mate = (ImageButton) findViewById(R.id.matematica);



        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goInicio();
            }
        });

        mate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMate();
            }
        });


    }

    private void goInicio() {
        Intent intent = new Intent(this, Menu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goMate() {
        Intent intent = new Intent(this, matematica.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}