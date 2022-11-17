package edu.mintic.tripulantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mintic.tripulantes.entity.Tripulante;

public interface TripulanteRepository extends JpaRepository<Tripulante, Integer> {
    
}
