package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Clubes extends AppCompatActivity {

    private ImageButton space;
    private Button inicioclub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubes);

        space = (ImageButton) findViewById(R.id.space);
        inicioclub = (Button) findViewById(R.id.inicioclub);

        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSpace();
            }
        });

        inicioclub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goInicio();
            }
        });

    }

    private void goInicio() {
        Intent intent = new Intent(this, Menu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goSpace() {
        Intent intent = new Intent(this, utecspace.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}