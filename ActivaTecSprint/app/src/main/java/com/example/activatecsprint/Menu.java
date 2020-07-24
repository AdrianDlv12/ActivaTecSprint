package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Menu extends AppCompatActivity {

    private ImageButton ajustes;
    private Button cursos, sitios, mentoria, links, clubes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ajustes = (ImageButton) findViewById(R.id.ajuste);
        cursos = (Button) findViewById(R.id.Cursos);
        sitios = (Button) findViewById(R.id.Sitios);
        mentoria = (Button) findViewById(R.id.Mentoria);
        links = (Button) findViewById(R.id.links);
        clubes = (Button) findViewById(R.id.clubes);

        ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goAjustes();
            }
        });

        cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goCursos();
            }
        });

        sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSitio();
            }
        });

        mentoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goMentoria();
            }
        });

        links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLinks();
            }
        });

        clubes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goClub();
            }
        });


    }

    private void goAjustes() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goCursos() {
        Intent intent = new Intent(this, Cursos.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goSitio() {
        Intent intent = new Intent(this, Mapa.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goMentoria() {
        Intent intent = new Intent(this, Mentoria.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goLinks() {
        Intent intent = new Intent(this, Links.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goClub() {
        Intent intent = new Intent(this, Clubes.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}