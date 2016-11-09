package com.example.service;

import com.example.domain.Equipo;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public void testSquad(){
        Equipo equipo1 = new Equipo("Equipo A", "Barcelona", "08/08/1996");
        equipoRepository.save(equipo1);
        Equipo equipo2 = new Equipo("Equipo B", "Bilbao", "04/04/1999");
        equipoRepository.save(equipo2);

        System.out.println("Buscar por nombre: Equipo B");
        System.out.println(equipoRepository.findByNombre("Equipo B"));
        System.out.println("");
        System.out.println("Buscar por localidad: Barcelona");
        System.out.println(equipoRepository.findByLocalidad("Barcelona"));
        System.out.println("");
    }
}
