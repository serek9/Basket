package com.example.service;


import com.example.domain.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testGamers(){
        Jugador jugador1 = new Jugador("Alberto", "01/01/1996", 14, 4, 20, "base");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador("Sergio", "08/08/1996", 12, 3, 30, "atacante");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador("Nando", "05/05/1996", 18, 5, 12, "defensa");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador("Larry", "08/09/1996", 12, 8, 13, "atacante");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador("Victor", "01/03/1996", 14, 4, 16, "base");
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador("Hector", "02/02/1996", 15, 3, 18, "defensa");
        jugadorRepository.save(jugador6);


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
    }
}
