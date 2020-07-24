package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Piso3 extends AppCompatActivity {

    private Button piso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piso3);

        piso = (Button) findViewById(R.id.pisos);

        piso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMapa();
            }
        });

    }

    private void goMapa() {
        Intent intent = new Intent(this, Mapa.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}