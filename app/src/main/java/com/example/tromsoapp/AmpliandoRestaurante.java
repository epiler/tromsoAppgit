package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;
import com.example.tromsoapp.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {
    MoldeRestaurante moldeRestaurante;
    ImageView FotoRestaurantes;
    ImageView FotoRestaurantes2;
    TextView NombreRestaurantes;
    TextView LoremRestaurantes;
    RatingBar valoracionR;
    TextView comentarioR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        FotoRestaurantes=findViewById(R.id.FotoRestaurantes);
        FotoRestaurantes2=findViewById(R.id.FotoRestaurantes2);
        NombreRestaurantes=findViewById(R.id.NombreRestaurantes);
        LoremRestaurantes=findViewById(R.id.LoremRestaurantes);
        valoracionR=findViewById(R.id.valoracionR);
        comentarioR=findViewById(R.id.comentarioR);

        moldeRestaurante = (MoldeRestaurante)getIntent().getSerializableExtra("datosRestaurante");

        //CARGANDO LA INFO EN LOS COMPONENTES GRAFICOS

        FotoRestaurantes.setImageResource(moldeRestaurante.getFoto());
        FotoRestaurantes2.setImageResource(moldeRestaurante.getFoto2());
        NombreRestaurantes.setText(moldeRestaurante.getNombre());
        LoremRestaurantes.setText(moldeRestaurante.getDescripcionR());
        valoracionR.setRating(moldeRestaurante.getValoracionR());
        comentarioR.setText(moldeRestaurante.getComentarioR());
    }
}