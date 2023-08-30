package com.example.tromsoapp.adaptadores;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tromsoapp.AmpliandoHotel;
import com.example.tromsoapp.AmpliandoRestaurante;
import com.example.tromsoapp.R;
import com.example.tromsoapp.moldes.MoldeHotel;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import java.util.ArrayList;

public class AdaptadorRestaurantes extends RecyclerView.Adapter<AdaptadorRestaurantes.viewHolder> {

    public ArrayList<MoldeRestaurante> listaRestaurantes;

    public AdaptadorRestaurantes(ArrayList<MoldeRestaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurantes.viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView RangoRestaurante;
        TextView telefonoRestaurante;
        TextView platoRestaurante;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante = itemView.findViewById(R.id.fotoListaRest);
            nombreRestaurante  = itemView.findViewById(R.id.nombreListaRest);
            RangoRestaurante = itemView.findViewById(R.id.Rango);
            telefonoRestaurante = itemView.findViewById(R.id.TelefonoList);
            platoRestaurante = itemView.findViewById(R.id.Plato);
        }

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            nombreRestaurante.setText(moldeRestaurante.getNombre());
            RangoRestaurante.setText(moldeRestaurante.getRangoPrecio());
            telefonoRestaurante.setText(moldeRestaurante.getTelefono());
            platoRestaurante.setText(moldeRestaurante.getPlatoRecomendado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoRestaurante.class);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

}
