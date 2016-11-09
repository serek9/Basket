package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long>{

    Equipo findByNombre(String nombre);
    List<Equipo> findByLocalidad(String loc);

    @Query("select jugador from Jugador jugador where jugador.equipo.nombre = :nombre")
    List<Jugador> findJugadoresByEquipo(@Param("nombre") String nombre);

    @Query("select jugador from Jugador jugador where jugador.posicion = :posicion")
    List<Jugador> findJugadoresByPosicion(@Param("posicion") String posicion);

    @Query("select jugador.nombre, max(jugador.canastas) from Jugador jugador where jugador.equipo.nombre = :nombre")
    List<Jugador> findJugadorMaxCanastasByEquipo(@Param("nombre") String nombre);
}
