package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class turismoo extends AppCompatActivity {
    View botonTurims;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismoo);
        botonTurims=findViewById(R.id.view);

        botonTurims.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(turismoo.this,listaTurismo.class);
                startActivity(intent);
            }
        });
    }
}