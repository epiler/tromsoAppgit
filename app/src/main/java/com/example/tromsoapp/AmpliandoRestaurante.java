package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;
import com.example.tromsoapp.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {
    MoldeRestaurante moldeRestaurante;
    ImageView FotoRestaurantes;
    TextView NombreRestaurantes;
    TextView LoremRestaurantes;
    TextView valoracionR;
    TextView comentarioR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        FotoRestaurantes=findViewById(R.id.FotoRestaurantes);
        NombreRestaurantes=findViewById(R.id.NombreRestaurantes);
        LoremRestaurantes=findViewById(R.id.LoremRestaurantes);
        valoracionR=findViewById(R.id.valoracionR);
        comentarioR=findViewById(R.id.comentarioR);

        moldeRestaurante = (MoldeRestaurante)getIntent().getSerializableExtra("datosRestaurante");

        //CARGANDO LA INFO EN LOS COMPONENTES GRAFICOS

        FotoRestaurantes.setImageResource(moldeRestaurante.getFoto());
        NombreRestaurantes.setText(moldeRestaurante.getNombre());
        LoremRestaurantes.setText(moldeRestaurante.getDescripcionR());
        valoracionR.setText(moldeRestaurante.getValoracionR());
        comentarioR.setText(moldeRestaurante.getComentarioR());
    }
}