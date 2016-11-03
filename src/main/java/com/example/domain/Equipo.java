package com.example.domain;

import javax.persistence.*;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String localidad;
    private String fechac;

    public Equipo(){
    }

    public Equipo(String nombre, String localidad, String fechac){
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechac = fechac;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getLocalidad() {return localidad;}

    public void setLocalidad(String localidad) {this.localidad = localidad;}

    public String getFechac() {return fechac;}

    public void setFechac(String fechac) {this.fechac = fechac;}

    @Override
    public java.lang.String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechac='" + fechac + '\'' +
                '}';
    }
}
