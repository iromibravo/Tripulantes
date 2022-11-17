package edu.mintic.tripulantes.services.impl;

import org.springframework.stereotype.Service;

import edu.mintic.tripulantes.entity.Curso;
import edu.mintic.tripulantes.repository.CursoRepository;
import edu.mintic.tripulantes.services.ICursoService;

@Service
public class CursoServiceImpl implements ICursoService {

    private CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Curso getCurso(int idCurso) {
        return repository.findById(idCurso).orElseThrow();
    }

    @Override
    public Curso crearCurso(Curso curso) {
        return repository.save(curso);
    }

    @Override
    public Curso buscarPorNombre(String nombre) {
        return repository.findByNombreCurso(nombre).orElseThrow();
    }
    
}
