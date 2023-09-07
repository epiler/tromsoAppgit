package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView PrecioHoteles;
    TextView TelefonoHoteles;
    TextView valoracionH;
    TextView comentarioH;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.FotoHoteles);
        nombreAmpliandoHotel=findViewById(R.id.NombreHoteles);
        PrecioHoteles=findViewById(R.id.PrecioHoteles);
        TelefonoHoteles=findViewById(R.id.TelefonoHoteles);
        valoracionH=findViewById(R.id.valoracionH);
        comentarioH=findViewById(R.id.comentarioH);

        moldeHotel = (MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //CARGANDO LA INFO EN LOS COMPONENTES GRAFICOS

        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        PrecioHoteles.setText(moldeHotel.getPrecio());
        TelefonoHoteles.setText(moldeHotel.getTelefono());
        valoracionH.setText(moldeHotel.getValoracionH());
        comentarioH.setText(moldeHotel.getComentarioH());
    }
}