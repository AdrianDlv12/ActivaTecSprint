package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class matematica extends AppCompatActivity {

    private Button iniciomate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematica);

        iniciomate = (Button) findViewById(R.id.iniciomate);

        iniciomate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goCursos();
            }
        });


    }

    private void goCursos() {
        Intent intent = new Intent(this, Cursos.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


}