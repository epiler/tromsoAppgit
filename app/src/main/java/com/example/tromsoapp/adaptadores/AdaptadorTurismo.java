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
        TextView NombreSitio;
        ImageView imagenSitio;
        TextView contactoSitios;
        TextView getNombreP;
        TextView telefonoSitios;
        TextView precio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            NombreSitio  = itemView.findViewById(R.id.NombreSitio);
            imagenSitio = itemView.findViewById(R.id.imagenSitio);
            contactoSitios = itemView.findViewById(R.id.nombreP);
            telefonoSitios = itemView.findViewById(R.id.telefonoSitios);
            precio = itemView.findViewById(R.id.precio);
        }

        public void actualizarDatos(MoldeTurismo moldesitios) {
            NombreSitio.setText(moldesitios.getNombre());
            imagenSitio.setImageResource(moldesitios.getFoto());
            contactoSitios.setText(moldesitios.getNombreContacto());
            telefonoSitios.setText(moldesitios.getTelefono());
            precio.setText(moldesitios.getPrecio());
        }
    }  {
}
}
