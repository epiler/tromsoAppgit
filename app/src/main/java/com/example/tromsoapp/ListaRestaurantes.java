package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tromsoapp.adaptadores.AdaptadorHoteles;
import com.example.tromsoapp.adaptadores.AdaptadorRestaurantes;
import com.example.tromsoapp.moldes.MoldeHotel;
import com.example.tromsoapp.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurante=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.ListaDimR);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes= new AdaptadorRestaurantes(listaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurantes);
    }

    public void llenarListaConDatos() {
        listaRestaurante.add(new MoldeRestaurante("Elefant Indisk",R.drawable.elefant, R.drawable.ballena, "3137720706", "$20.000 - $90.000", "Margarita","Hotel hermosoy agradable", "john: djfdjkdjkjds", 3.5f ));
        listaRestaurante.add(new MoldeRestaurante("Lotus",R.drawable.lotus, R.drawable.elefant, "3207720705", "$27.000 - $100.000", "Whale","Hotel feo", "alfred: djfdjkdjkjds",4.0f ));
        listaRestaurante.add(new MoldeRestaurante("Raketten",R.drawable.raketten, R.drawable.smakrest, "3217720701", "$15.000 - $80.000", "Salmon","Hotel asqueroso", "alberto: djfdjkdjkjds",5.0f ));

    }

}