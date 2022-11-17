package edu.mintic.tripulantes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mintic.tripulantes.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

    public Optional<Curso> findByNombreCurso(String nombreCurso);

}
