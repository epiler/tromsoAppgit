package com.example.tromsoapp.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tromsoapp.R;
import com.example.tromsoapp.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorTurismo extends RecyclerView.Adapter<AdaptadorTurismo.viewHolder> {

    public ArrayList<MoldeTurismo> listaTurismo;

    public AdaptadorTurismo(ArrayList<MoldeTurismo> listaTurismo) {
        this.listaTurismo = listaTurismo;
    }

    @NonNull
    @Override
    public AdaptadorTurismo.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTurismo.viewHolder holder, int position) {
        holder.actualizarDatos(listaTurismo.get(position));
    }

    @Override
    public int getItemCount() {
        return listaTurismo.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitios;
        ImageView fotoSitios;
        TextView contactos;
        TextView telefonoSitios;
        TextView precio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreSitios  = itemView.findViewById(R.id.nombreSitios);
            fotoSitios = itemView.findViewById(R.id.aurorasimg);
            contactos = itemView.findViewById(R.id.contactos);
            telefonoSitios = itemView.findViewById(R.id.telefonoSitios);
            precio = itemView.findViewById(R.id.precio);
        }

        public void actualizarDatos(MoldeTurismo moldesitios) {
            nombreSitios.setText(moldesitios.getNombre());
            fotoSitios.setImageResource(moldesitios.getFoto());
            contactos.setText(moldesitios.getNombreContacto());
            telefonoSitios.setText(moldesitios.getTelefono());
            precio.setText(moldesitios.getPrecio());
        }
    }  {
}
}
