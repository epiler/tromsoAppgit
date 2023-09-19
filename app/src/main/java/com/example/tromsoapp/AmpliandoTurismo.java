package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView FotoTurismos;

    ImageView FotoTurismos2;
    TextView NombreTurismos;

    TextView LoremTurismo;
    RatingBar valoracionT;
    TextView comentarioT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);
        FotoTurismos=findViewById(R.id.FotoTurismos);
        FotoTurismos2=findViewById(R.id.FotoTurismos2);
        NombreTurismos=findViewById(R.id.NombreTurismos);
        LoremTurismo=findViewById(R.id.LoremTurismo);
        comentarioT=findViewById(R.id.comentarioT);
        valoracionT=findViewById(R.id.valoracionT);

        moldeTurismo = (MoldeTurismo) getIntent().getSerializableExtra("datosTurismo");

        //CARGANDO LA INFO EN LOS COMPONENTES GRAFICOS

        FotoTurismos.setImageResource(moldeTurismo.getFoto());
        FotoTurismos2.setImageResource(moldeTurismo.getFoto2());
        NombreTurismos.setText(moldeTurismo.getNombre());
        LoremTurismo.setText(moldeTurismo.getDescripcionT());
        valoracionT.setRating(moldeTurismo.getValoracionT());
        comentarioT.setText(moldeTurismo.getComentarioT());


    }
}