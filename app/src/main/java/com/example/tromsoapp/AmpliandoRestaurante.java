package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;
import com.example.tromsoapp.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {
    MoldeRestaurante moldeRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        moldeRestaurante = (MoldeRestaurante)getIntent().getSerializableExtra("datosRestaurante");
        Toast.makeText(this, moldeRestaurante.getNombre(), Toast.LENGTH_SHORT).show();
    }
}