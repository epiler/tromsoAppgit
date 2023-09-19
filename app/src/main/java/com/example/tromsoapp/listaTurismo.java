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
        listaTurismo.add(new MoldeTurismo(R.drawable.tromsonorthernlightstour, R.drawable.smarth, "Northern Lights", "aadsjkdfjkhjkshjkds jsdjksdjksdjd", "200", "Alberto", "3137720706", "Ruben:aaaaaaa", 5.0f));
        listaTurismo.add(new MoldeTurismo(R.drawable.trineo, R.drawable.tromsonorthernlightstour, "Trineo", "eeeeeesdsdsdsdsds", "300", "Ronnie", "3437720728", "Marlon:eeeee", 3.5f));
        listaTurismo.add(new MoldeTurismo(R.drawable.avistamiento, R.drawable.scandic, "Whales", "iiiiiiiiiioooo", "100", "jonnie", "6927720706", "Samuel:iiiii", 4.0f));

    }

}
