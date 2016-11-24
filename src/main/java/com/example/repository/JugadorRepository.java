package com.example.repository;

import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    List<Jugador> findByNombreContaining(String nombre);
    List<Jugador> findByCanastasGreaterThanEqual(int canastas);
    List<Jugador> findByAsistenciasBetween(int a, int b);
    List<Jugador> findByCanastasBetween(int a, int b);
    List<Jugador> findByPosicionIs(String posicion);
    List<Jugador> findByFechaBefore(String fecha);

    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.rebotes), AVG(jugador.asistencias) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgCanastasRebotesAsistenciasPerPosicion();

    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.rebotes), AVG(jugador.asistencias), " +
            "MIN(jugador.canastas), MIN(jugador.rebotes), MIN(jugador.asistencias), " +
            "MAX(jugador.canastas), MAX(jugador.rebotes), MAX(jugador.asistencias) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> AvgMinMaxCanastasRebotesAsistenciasPerPosicion();

    @Query("SELECT jugador FROM Jugador jugador ORDER BY jugador.canastas DESC")
    List<Jugador> orderByCanastas();

}
