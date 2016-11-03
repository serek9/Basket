package com.example.repository;

import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    List<Jugador> findByNombre(String nombre);
    List<Jugador> findByNombreAndApellido(String nombre, String apellidos);
    List<Jugador> findByNombreOrApellido(String nombre, String apellido);
    List<Jugador> findByPosicion(String posicion);
    List<Jugador> findByFechaBefore(int rebotes);


}
