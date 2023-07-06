package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.tromsoapp.R;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitios);

        //detectando eventos

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentH = new Intent(Home.this,Hoteles.class);
                startActivity(intentH);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentR = new Intent(Home.this,Restaurantes.class);
                startActivity(intentR);
            }
        });

        botonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentT = new Intent(Home.this,turismoo.class);
                startActivity(intentT);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):
                Toast.makeText(this, "quiero que este en español", Toast.LENGTH_SHORT);
                break;
            case(R.id.opcion2):
                Toast.makeText(this, "quiero que este en ingles", Toast.LENGTH_SHORT);
                break;
            case(R.id.opcion3):
                Toast.makeText(this, "quiero que este en noruego", Toast.LENGTH_SHORT);
                break;
            case(R.id.opcion4):
                Toast.makeText(this, "quiero ir acerca de nosotros", Toast.LENGTH_SHORT);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma(String idioma){

    }

}
