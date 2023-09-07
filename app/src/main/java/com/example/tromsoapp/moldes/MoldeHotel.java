package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String valoracionH;
    private String comentarioH;


    public MoldeHotel() { //CONSTRUCTOR VACIO
    }

    public MoldeHotel(String nombre, String precio, String telefono, Integer foto, String valoracionH, String comentarioH) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.valoracionH = valoracionH;
        this.comentarioH = comentarioH;
    }

    //CONSTRUCTOR LLENO


    public String getValoracionH() {
        return valoracionH;
    }

    public void setValoracionH(String valoracionH) {
        this.valoracionH = valoracionH;
    }

    public String getComentarioH() {
        return comentarioH;
    }

    public void setComentarioH(String comentarioH) {
        this.comentarioH = comentarioH;
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

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
