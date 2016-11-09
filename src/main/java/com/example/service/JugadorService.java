package com.example.service;


import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testGamers(){
        Jugador jugador1 = new Jugador("Alberto", "01/01/1996", 14, 4, 20, "base", equipoRepository.findByNombre("Equipo A"));
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador("Sergio", "08/08/1996", 12, 3, 30, "atacante", equipoRepository.findByNombre("Equipo A"));
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador("Nando", "05/05/1996", 18, 5, 12, "defensa", equipoRepository.findByNombre("Equipo A"));
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador("Larry", "08/09/1996", 12, 8, 13, "atacante", equipoRepository.findByNombre("Equipo B"));
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador("Victor", "01/03/1996", 14, 4, 16, "base", equipoRepository.findByNombre("Equipo B"));
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador("Hector", "02/02/1996", 15, 3, 18, "defensa", equipoRepository.findByNombre("Equipo B"));
        jugadorRepository.save(jugador6);


        System.out.println(equipoRepository.findByNombre("Equipo A"));


        System.out.println("Buscar por nombre: Sergio");
        System.out.println(jugadorRepository.findByNombreContaining("ser"));
        System.out.println("");
        System.out.println("Buscar por canastas iguales o superiores a 4");
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(4));
        System.out.println("");
        System.out.println("Buscar por asistencias entre 15 y 20");
        System.out.println(jugadorRepository.findByAsistenciasBetween(15,20));
        System.out.println("");
        System.out.println("Mostrar todos los atacantes:");
        System.out.println(jugadorRepository.findByPosicionIs("atacante"));
        System.out.println("");
        System.out.println("Buscar jugadores con fecha anterior a 12/12/1996:");
        System.out.println(jugadorRepository.findByFechaBefore("12/12/1996"));
        System.out.println("");
        System.out.println("Media de la puntuación por posición:");
        showStatistics(jugadorRepository.AvgCanastasRebotesAsistenciasPerPosicion());
        System.out.println("");
        System.out.println("Media, max y min de la puntuación por posición:");
        showStatistics2(jugadorRepository.AvgMinMaxCanastasRebotesAsistenciasPerPosicion());
        System.out.println("");
        System.out.println("Jugadores del Equipo B:");
        System.out.println(equipoRepository.findJugadoresByEquipo("Equipo B"));
        System.out.println("");
        System.out.println("Jugadores con posicion base");
        System.out.println(equipoRepository.findJugadoresByPosicion("base"));
        System.out.println("");
        System.out.println("Jugador con mayor numero de canastas del Equipo A");
        System.out.println(equipoRepository.findJugadorMaxCanastasByEquipo("Equipo A"));
    }

    private void showStatistics(List<Object[]> statisticsList){
        for (Object[] statistic: statisticsList){
            System.out.println("Posición: "+statistic[0]);
            System.out.println("AVG Canastas = "+statistic[1] +" puntos");
            System.out.println("AVG Rebotes = "+statistic[2] +" puntos");
            System.out.println("AVG Asistencias = "+statistic[3] +" puntos"+System.lineSeparator());
        }
    }

    private void showStatistics2(List<Object[]> statisticsList){
        for (Object[] statistic: statisticsList){
            System.out.println("Posicion: "+statistic[0]);
            System.out.println("AVG Canastas = "+statistic[1] +" puntos");
            System.out.println("AVG Rebotes = "+statistic[2] +" puntos");
            System.out.println("AVG Asistencias = "+statistic[3] +" puntos");
            System.out.println("MIN Canastas = "+statistic[4] +" puntos");
            System.out.println("MIN Rebotes = "+statistic[5] +" puntos");
            System.out.println("MIN Asistencias = "+statistic[6] +" puntos");
            System.out.println("MAX Canastas = "+statistic[7] +" puntos");
            System.out.println("MAX Rebotes = "+statistic[8] +" puntos");
            System.out.println("MAX Asistencias = "+statistic[9] +" puntos"+System.lineSeparator());
        }
    }

}
