package domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Equipo {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String localidad;
    private String fechac;

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getLocalidad() {return localidad;}

    public void setLocalidad(String localidad) {this.localidad = localidad;}

    public String getFechac() {return fechac;}

    public void setFechac(String fechac) {this.fechac = fechac;}

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechac='" + fechac + '\'' +
                '}';
    }
}
