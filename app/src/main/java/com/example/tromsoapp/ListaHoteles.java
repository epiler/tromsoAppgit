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
        listaHoteles.add(new MoldeHotel("Domos de hielo", "$100.000", "123456789",R.drawable.hoteluno));
        listaHoteles.add(new MoldeHotel("Raddisson Blue", "$200.000", "223456789",R.drawable.raddissonblue));
        listaHoteles.add(new MoldeHotel("Clarion", "$600.000", "323456789",R.drawable.clarion));
        listaHoteles.add(new MoldeHotel("Smart", "$50.000", "423456789",R.drawable.smarth));
        listaHoteles.add(new MoldeHotel("Scandic", "$100.000", "523456789",R.drawable.scandic));
    }

}