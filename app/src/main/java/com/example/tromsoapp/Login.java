package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //Atributos de la clase
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        cajaNombreUsuario = findViewById(R.id.Usuario);
        cajaContrasena = findViewById(R.id.Contrasena);

        //Capturando datos de las cajas(EditText)
        String nombreUsuario = cajaNombreUsuario.getText().toString();
        String contrasena = cajaContrasena.getText().toString();
    }
}