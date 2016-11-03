package com.example.domain;

import javax.persistence.*;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String fecha;
    private int canastas;
    private int rebotes;
    private int asistencias;
    private String posicion;
    @ManyToOne
    private Equipo equipo;

    public Jugador(String nombre, String fecha,int canastas, int rebotes, int asistencias, String posicion){
        this.nombre = nombre;
        this.fecha = fecha;
        this.canastas = canastas;
        this.rebotes = rebotes;
        this.asistencias = asistencias;
        this.posicion = posicion;
    }

    public Jugador(){

    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public int getCanastas() {return canastas;}
    public void setCanastas(int canastas) {this.canastas = canastas;}

    public int getRebotes() {return rebotes;}
    public void setRebotes(int rebotes) {this.rebotes = rebotes;}

    public int getAsistencias() {return asistencias;}
    public void setAsistencias(int asistencias) {this.asistencias = asistencias;}

    public String getPosicion() {return posicion;}
    public void setPosicion(String posicion) {this.posicion = posicion;}

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", canastas=" + canastas +
                ", rebotes=" + rebotes +
                ", asistencias=" + asistencias +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
