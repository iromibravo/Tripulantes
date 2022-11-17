package edu.mintic.tripulantes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cursos")
public class Curso {

    private @Id @GeneratedValue int idCurso;
    private String nombreCurso;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_tripulante")
    private Tripulante tripulante;
    
    public Curso() {
    }

    public Curso(String nombreCurso, String descripcion, Tripulante tripulante) {
        this.nombreCurso = nombreCurso;
        this.descripcion = descripcion;
        this.tripulante = tripulante;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", descripcion=" + descripcion + "]";
    }

    public Tripulante getTripulante() {
        return tripulante;
    }

    public void setTripulante(Tripulante tripulante) {
        this.tripulante = tripulante;
    }

    
}
