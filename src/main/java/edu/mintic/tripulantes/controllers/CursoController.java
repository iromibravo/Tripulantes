package edu.mintic.tripulantes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.mintic.tripulantes.entity.Curso;
import edu.mintic.tripulantes.services.impl.CursoServiceImpl;

@RestController
public class CursoController {

    private CursoServiceImpl cursoService;

    public CursoController(CursoServiceImpl cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/cursos/{idCurso}")
    public Curso getCurso(@PathVariable int idCurso){
        return cursoService.getCurso(idCurso);
    }

    @PostMapping("/cursos")
    public Curso crearCurso(@RequestBody Curso curso){
        return cursoService.crearCurso(curso);
    }

    @GetMapping("/curso/{nombre}")
    public Curso buscarCurso(@PathVariable String nombre){
        return cursoService.buscarPorNombre(nombre);
    }
    
}
