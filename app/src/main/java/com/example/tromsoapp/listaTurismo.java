package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tromsoapp.adaptadores.AdaptadorRestaurantes;
import com.example.tromsoapp.adaptadores.AdaptadorTurismo;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;

import java.util.ArrayList;

public class listaTurismo extends AppCompatActivity {
    ArrayList<MoldeTurismo> listaTurismo=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_turismo);
        recyclerView=findViewById(R.id.ListaDimT);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorTurismo adaptadorTurismo= new AdaptadorTurismo(listaTurismo);
        recyclerView.setAdapter(adaptadorTurismo);
    }

    public void llenarListaConDatos() {
        listaTurismo.add(new MoldeTurismo("Northern Lights", "Juan", "3137720705", "500.000", R.drawable.tromsonorthernlightstour));
        listaTurismo.add(new MoldeTurismo("Trineo", "David", "3137720796", "300.000", R.drawable.trineo));
        listaTurismo.add(new MoldeTurismo("Whales", "Roier", "3137720745", "100.000", R.drawable.ballena));
    }

}
