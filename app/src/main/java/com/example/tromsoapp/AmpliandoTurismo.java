package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;
    ImageView FotoTurismos;
    TextView NombreTurismos;
    TextView valoracionT;
    TextView comentarioT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        moldeTurismo = (MoldeTurismo) getIntent().getSerializableExtra("datosTurismo");
        FotoTurismos=findViewById()
        comentarioT=findViewById(R.id.comentarioT);
        valoracionT=findViewById(R.id.valoracionT);
    }
}