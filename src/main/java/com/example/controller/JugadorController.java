package com.example.controller;

import com.example.domain.Jugador;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador createJugador(@RequestBody Jugador jugador){ return jugadorRepository.save(jugador);}

    @PutMapping
    public  Jugador updateJugador(@RequestBody Jugador jugador){ return jugadorRepository.save(jugador);}

    @GetMapping
    public List<Jugador> findAll(){ return  jugadorRepository.findAll(); }

    //MUESTRA EL JUGADOR CON EL ID DE LA URL
    @GetMapping("/{id}")
    public Jugador findById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);
        return jugador;
    }

    //ELIMINA EL JUGADOR CON EL ID DE LA URL
    @DeleteMapping("/delete/{id}")
    public void deleteJugador(@PathVariable Long id){
        jugadorRepository.delete(id);
    }

    //PREGUNTA 1
    @GetMapping("orderByCanastas")
    public  List<Jugador> orderByCanastas(){return jugadorRepository.orderByCanastas();}

    //PREGUNTA 2
    @GetMapping("/byPoints/{num}")
    public List<Jugador> findByCanastasGreaterThanEqual(@PathVariable Integer num){
        return jugadorRepository.findByCanastasGreaterThanEqual(num);
    }

    //PREGUNTA 3
    @GetMapping("/byCanastasBetween/{a}-{b}")
    public List<Jugador> findByCanastasBetween(@PathVariable Integer a, @PathVariable Integer b){
        return jugadorRepository.findByCanastasBetween(a,b);
    }
    //PREGUNTA 4

    //PREGUNTA 5
    //PREGUNTA 6
    //PREGUNTA 7

}
