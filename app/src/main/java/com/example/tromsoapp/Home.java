package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.tromsoapp.R;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    TextView nombreCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String nombre = getIntent().getStringExtra("nombre");
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitios);
        nombreCliente=findViewById(R.id.Usuario);

        //Uniendo el texto del PUTEXTRA con el TEXTVIEW

        nombreCliente.setText(nombre);

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


    public void cambiarIdioma(String idioma){

    //CONFIGURAR EL LENGUAJE DEL TELEFONO
        Locale lenguaje = new Locale(idioma);
        Locale.setDefault(lenguaje);


        //CONFIGURAMOS BLOBALMENTE EL TELEFONO

        Configuration configuracionTelefono = getResources().getConfiguration();
        configuracionTelefono.locale = lenguaje;


        //EJECUTAMOS LA CONFIGURACION

        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):
            this.cambiarIdioma("en");
            Intent intentIngles=new Intent(Home.this, Home.class);
            startActivity(intentIngles);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("es");
                Intent intentEspanol=new Intent(Home.this, Home.class);
                startActivity(intentEspanol);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("nb");
                Intent intentNoruego=new Intent(Home.this, Home.class);
                startActivity(intentNoruego);
                break;
            case(R.id.opcion4):

                 Intent intent = new Intent(Home.this,Acerca.class);
                 startActivity(intent);

            break;

        }

        return super.onOptionsItemSelected(item);
    }

}



