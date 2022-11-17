package edu.mintic.tripulantes.services;

import edu.mintic.tripulantes.entity.Curso;

public interface ICursoService {
    public Curso getCurso(int idCurso);
    public Curso crearCurso(Curso curso);
    public Curso buscarPorNombre(String nombre);
}
