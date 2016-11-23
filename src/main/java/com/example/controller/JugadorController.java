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

    @GetMapping("/{id}")
    public Jugador findById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);
        return jugador;
    }

    @GetMapping("/byPoints/{num}")
    public List<Jugador> findByCanastasGreaterThanEqual(@PathVariable Integer num){
        return jugadorRepository.findByCanastasGreaterThanEqual(num);
    }

    @DeleteMapping("/{id}/")
    public void deleteJugador(@PathVariable Long id){
        jugadorRepository.delete(id);
    }

}
