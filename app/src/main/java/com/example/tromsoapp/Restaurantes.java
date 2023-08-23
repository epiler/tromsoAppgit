package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Restaurantes extends AppCompatActivity {
    View botonRest;
    View botonR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        botonRest=findViewById(R.id.view);

        botonRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurantes.this,ListaRestaurantes.class);
                startActivity(intent);
            }
        });
    }
}