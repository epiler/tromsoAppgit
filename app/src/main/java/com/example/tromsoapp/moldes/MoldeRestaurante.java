package com.example.tromsoapp.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {

    private String nombre;
    private Integer foto;
    private Integer foto2;
    private String telefono;
    private String RangoPrecio;
    private String PlatoRecomendado;
    private String descripcionR;
    private String comentarioR;
    private float valoracionR;

    public MoldeRestaurante() {
    }

    public MoldeRestaurante(String nombre, Integer foto, Integer foto2, String telefono, String rangoPrecio, String platoRecomendado, String descripcionR, String comentarioR, float valoracionR) {
        this.nombre = nombre;
        this.foto = foto;
        this.foto2 = foto2;
        this.telefono = telefono;
        RangoPrecio = rangoPrecio;
        PlatoRecomendado = platoRecomendado;
        this.descripcionR = descripcionR;
        this.comentarioR = comentarioR;
        this.valoracionR = valoracionR;
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

    public Integer getFoto2() {
        return foto2;
    }

    public void setFoto2(Integer foto2) {
        this.foto2 = foto2;
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

    public String getDescripcionR() {
        return descripcionR;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }

    public String getComentarioR() {
        return comentarioR;
    }

    public void setComentarioR(String comentarioR) {
        this.comentarioR = comentarioR;
    }

    public float getValoracionR() {
        return valoracionR;
    }

    public void setValoracionR(float valoracionR) {
        this.valoracionR = valoracionR;
    }
}