package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //Atributos de la clase
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cajaNombreUsuario = findViewById(R.id.Usuario);
        cajaContrasena = findViewById(R.id.Contrasena);
        botonIngreso = findViewById(R.id.botonLogin);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Capturando datos de las cajas(EditText)
                String nombreUsuario = cajaNombreUsuario.getText().toString();
                String contrasena = cajaContrasena.getText().toString();

               //Abrimos una nueva ACTIVIDAD (HOME)
                Intent intent = new Intent(Login.this,Home.class);

                //Pasando datos a la nueva ACTICIDAD
                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",contrasena);


                startActivity(intent);
            }
        });

    }
}