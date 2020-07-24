package com.example.activatecsprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class utecspace extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utecspace);

        back = (Button) findViewById(R.id.clubgo);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goClub();
            }
        });

    }

    private void goClub() {
        Intent intent = new Intent(this, Clubes.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}