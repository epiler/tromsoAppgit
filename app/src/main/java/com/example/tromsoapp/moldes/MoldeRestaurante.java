package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {

private String nombre;
private Integer foto;
private String telefono;
private String RangoPrecio;
private String PlatoRecomendado;
private String descripcionR;
private String comentarioR;
private String valoracionR;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombre, Integer foto, String telefono, String rangoPrecio, String platoRecomendado, String descripcionR, String comentarioR, String valoracionR) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        RangoPrecio = rangoPrecio;
        PlatoRecomendado = platoRecomendado;
        this.descripcionR = descripcionR;
        this.comentarioR = comentarioR;
        this.valoracionR = valoracionR;
    }

    public String getComentarioR() {
        return comentarioR;
    }

    public void setComentarioR(String comentarioR) {
        this.comentarioR = comentarioR;
    }

    public String getValoracionR() {
        return valoracionR;
    }

    public void setValoracionR(String valoracionR) {
        this.valoracionR = valoracionR;
    }

    public String getDescripcionR() {
        return descripcionR;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
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
