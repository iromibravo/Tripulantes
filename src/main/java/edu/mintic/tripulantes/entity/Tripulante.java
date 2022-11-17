package edu.mintic.tripulantes.entity;

import java.util.List;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
//@Table(name = "tbl_nombre_tabla")
public class Tripulante {
    private @Id @GeneratedValue int idTripulante;
    //@Column(name = "columna_nombre_tripulante")
    private String nombre;
    @OneToMany(mappedBy = "tripulante")
    private List<Curso> cursos;

    public Tripulante() {
    }

    public Tripulante(String nombre, List<Curso> curso) {
        this.nombre = nombre;
        this.cursos = curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }

    public int getIdTripulante() {
        return this.idTripulante;
    }

    public void setIdTripulante(int idTripulante) {
        this.idTripulante = idTripulante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

}
