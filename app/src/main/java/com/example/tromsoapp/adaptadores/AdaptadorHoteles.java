package com.example.tromsoapp.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tromsoapp.R;
import com.example.tromsoapp.moldes.MoldeHotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    //TOD0 ADAPTADOR TIENE UNA LISTA DE ELEMENTOS
    public ArrayList<MoldeHotel> listaHoteles;

    //CREAMOS UN COSTRUCTOR VACIO

    public AdaptadorHoteles() {

    }

    //CREAMOS UN CONSTRUCTOR LLENO


    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;

        //ESTA PORCION DE CODIGO PERMITE CREAR N COPIAS DEL MOLDE GRAFICO

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new parent(vista);
    }



    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
