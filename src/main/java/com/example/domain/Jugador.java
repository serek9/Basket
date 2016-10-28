package com.example.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Jugador {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String fecha;
    private int rebotes;
    private String posicion;

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getFecha() {return fecha;}

    public void setFecha(String fecha) {this.fecha = fecha;}

    public int getRebotes() {return rebotes;}

    public void setRebotes(int rebotes) {this.rebotes = rebotes;}

    public String getPosicion() {return posicion;}

    public void setPosicion(String posicion) {this.posicion = posicion;}

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
