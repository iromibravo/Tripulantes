package edu.mintic.tripulantes.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.mintic.tripulantes.entity.Tripulante;
import edu.mintic.tripulantes.repository.TripulanteRepository;

@RestController
public class TripulanteController {

    private TripulanteRepository repository;

    public TripulanteController(TripulanteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tripulantes")
    public List<Tripulante> listaTripulantes() {
        return repository.findAll();
    }

    @GetMapping("/tripulantes/{idTripulante}")
    public Tripulante getTripulante(@PathVariable int idTripulante) {
        return repository.findById(idTripulante).orElse(null);
    }

    @PostMapping("/tripulantes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Tripulante crearTripulante(@RequestBody Tripulante tripulante) {
        
        return repository.save(tripulante);
    }

    @PutMapping("/tripulantes/{idTripulante}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Tripulante actualizarTripulante(@RequestBody Tripulante tripulante, @PathVariable int idTripulante) {
        Tripulante tViejo = repository.findById(idTripulante).orElseThrow();
        tViejo.setNombre(tripulante.getNombre());
        tViejo.setCursos(tripulante.getCursos());
        return repository.save(tViejo);
    }

    @DeleteMapping("/tripulantes")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void eliminarTripulante(@RequestParam int idTripulante) {
        repository.deleteById(idTripulante);
    }

}