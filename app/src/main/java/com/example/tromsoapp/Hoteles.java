package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Hoteles extends AppCompatActivity {

    View botonDomos;
    View botonRadisson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        botonDomos=findViewById(R.id.view);

        botonDomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoteles.this,DomosHielo.class);
                startActivity(intent);
            }
        });

        botonRadisson=findViewById(R.id.view2);
        botonRadisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hoteles.this,Radisson.class);
                startActivity(intent);
            }
        });
    }
}