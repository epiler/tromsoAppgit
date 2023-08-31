package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {

private String nombre;
private Integer foto;
private String telefono;
private String RangoPrecio;
private String PlatoRecomendado;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombre, Integer foto, String telefono, String rangoPrecio, String platoRecomendado) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        RangoPrecio = rangoPrecio;
        PlatoRecomendado = platoRecomendado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoPrecio() {
        return RangoPrecio;
    }

    public void setRangoPrecio(String rangoPrecio) {
        RangoPrecio = rangoPrecio;
    }

    public String getPlatoRecomendado() {
        return PlatoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        PlatoRecomendado = platoRecomendado;
    }
}
