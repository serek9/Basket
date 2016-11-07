package com.example.repository;

import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    List<Jugador> findByNombreContaining(String nombre);
    List<Jugador> findByCanastasGreaterThanEqual(int canastas);
    List<Jugador> findByAsistenciasBetween(int a, int b);
    List<Jugador> findByPosicionIs(String posicion);
    List<Jugador> findByFechaBefore(String fecha);

}
