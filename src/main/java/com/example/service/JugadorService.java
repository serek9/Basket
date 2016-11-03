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
        Jugador jugador1 = new Jugador("Alberto", "01/01/1996", 4, 2, 2, "base");
        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador("Sergio", "08/08/1996", 2, 1, 3, "atacante");
        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador("Nando", "05/05/1996", 8, 1, 2, "defensa");
        jugadorRepository.save(jugador3);

        Jugador jugador4 = new Jugador("Larry", "08/09/1996", 2, 1, 3, "atacante");
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador("Victor", "01/03/1996", 4, 2, 2, "base");
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador("Hector", "02/02/1996", 5, 1, 3, "defensa");
        jugadorRepository.save(jugador6);


        System.out.println("Buscar por nombre: Sergio");
        System.out.println(jugadorRepository.findByNombre("ser"));
    }
}
