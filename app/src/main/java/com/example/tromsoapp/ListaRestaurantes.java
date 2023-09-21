package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tromsoapp.adaptadores.AdaptadorHoteles;
import com.example.tromsoapp.adaptadores.AdaptadorRestaurantes;
import com.example.tromsoapp.moldes.MoldeHotel;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {

    ArrayList<MoldeRestaurante> listaRestaurante=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        recyclerView=findViewById(R.id.ListaDimR);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("reataurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreRestaurante =document.getString("nombre");
                                String precioRestaurante =document.getString("precio");
                                String recomendado = document.getString("telefono");
                                String telefono = document.getString("telefono");
                                Toast.makeText(ListaRestaurantes.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                            }
                        } else {

                        }
                    }
                });



        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes= new AdaptadorRestaurantes(listaRestaurante);
        recyclerView.setAdapter(adaptadorRestaurantes);
    }

    public void llenarListaConDatos() {
        listaRestaurante.add(new MoldeRestaurante("Elefant Indisk",R.drawable.elefant, R.drawable.ballena, "3137720706", "$20.000 - $90.000", "Margarita","Hotel hermoso y agradable", "john: djfdjkdjkjds", 3.5f ));
        listaRestaurante.add(new MoldeRestaurante("Lotus",R.drawable.lotus, R.drawable.elefant, "3207720705", "$27.000 - $100.000", "Whale","Hotel feo", "alfred: djfdjkdjkjds",4.0f ));
        listaRestaurante.add(new MoldeRestaurante("Raketten",R.drawable.raketten, R.drawable.smakrest, "3217720701", "$15.000 - $80.000", "Salmon","Hotel asqueroso", "alberto: djfdjkdjkjds",5.0f ));

    }

}