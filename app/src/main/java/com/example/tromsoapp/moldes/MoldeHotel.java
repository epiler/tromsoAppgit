package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {

    private Integer foto;
    private Integer foto2;
    private String nombre;
    private String precio;
    private String telefono;
    private float valoracionH;
    private String comentarioH;


    public MoldeHotel() {
    }

    public MoldeHotel(Integer foto, Integer foto2, String nombre, String precio, String telefono, float valoracionH, String comentarioH) {
        this.foto = foto;
        this.foto2 = foto2;
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.valoracionH = valoracionH;
        this.comentarioH = comentarioH;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getValoracionH() {
        return valoracionH;
    }

    public void setValoracionH(float valoracionH) {
        this.valoracionH = valoracionH;
    }

    public String getComentarioH() {
        return comentarioH;
    }

    public void setComentarioH(String comentarioH) {
        this.comentarioH = comentarioH;
    }
}