package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.tromsoapp.adaptadores.AdaptadorHoteles;
import com.example.tromsoapp.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel>listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.ListaDimH);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));


        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreHotel =document.getString("nombre");
                                String precioHotel =document.getString("precio");
                                String telefono = document.getString("telefono");
                                Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, telefono, Toast.LENGTH_SHORT).show();
                            }
                        } else {

                        }
                    }
                });



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