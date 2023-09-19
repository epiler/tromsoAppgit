package com.example.tromsoapp.moldes;

import android.widget.RatingBar;

import java.io.Serializable;
import java.io.StringReader;

public class MoldeTurismo implements Serializable {

    private Integer foto;

    private Integer foto2;
    private String nombre;

    private String descripcionT;
    private String precio;

    private String nombreContacto;
    private String telefono;

    private String comentarioT;

    private float valoracionT;


    public MoldeTurismo() {
    }

    public MoldeTurismo(Integer foto, Integer foto2, String nombre, String descripcionT, String precio, String nombreContacto, String telefono, String comentarioT, float valoracionT) {
        this.foto = foto;
        this.foto2 = foto2;
        this.nombre = nombre;
        this.descripcionT = descripcionT;
        this.precio = precio;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.comentarioT = comentarioT;
        this.valoracionT = valoracionT;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionT() {
        return descripcionT;
    }

    public void setDescripcionT(String descripcionT) {
        this.descripcionT = descripcionT;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getComentarioT() {
        return comentarioT;
    }

    public void setComentarioT(String comentarioT) {
        this.comentarioT = comentarioT;
    }

    public float getValoracionT() {
        return valoracionT;
    }

    public void setValoracionT(float valoracionT) {
        this.valoracionT = valoracionT;
    }
}