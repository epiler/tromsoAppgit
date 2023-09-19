package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tromsoapp.adaptadores.AdaptadorHoteles;
import com.example.tromsoapp.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel>listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.ListaDimH);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHotel= new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHotel);
    }

    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel( R.drawable.domos, R.drawable.domoss, "Domos de hielo", "$100.000","439436478", 5.0f, "John: ksksjksjdjjsd" ));
        listaHoteles.add(new MoldeHotel( R.drawable.raddissonblue, R.drawable.elefant, "Radisson Blue", "$200.000","219436478", 4.0f, "Jairo: oooooooo" ));
        listaHoteles.add(new MoldeHotel(R.drawable.clarion, R.drawable.smakrest, "Clarion", "$600.000", "86859437",3.9f,"Lana: oioioioi"));
    }

}