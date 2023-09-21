package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tromsoapp.adaptadores.AdaptadorRestaurantes;
import com.example.tromsoapp.adaptadores.AdaptadorTurismo;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.ArrayList;

public class listaTurismo extends AppCompatActivity {
    ArrayList<MoldeTurismo> listaTurismo=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_turismo);
        recyclerView=findViewById(R.id.ListaDimT);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("turismo")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                String nombreLugar =document.getString("nombre");
                                String precioLugar =document.getString("precio");
                                String contacto = document.getString("contacto");
                                String telefono = document.getString("telefono");
                                Toast.makeText(listaTurismo.this, nombreLugar, Toast.LENGTH_SHORT).show();
                            }
                        } else {

                        }
                    }
                });


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
