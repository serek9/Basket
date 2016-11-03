package com.example.repository;

import com.example.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long>{

    Equipo findByNombre(String nombre);
    List<Equipo> findByLocalidad(String loc);
}
