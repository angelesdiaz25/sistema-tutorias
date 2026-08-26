package edu.uees.tutorias.domain;

public class Docente extends Usuario {

    private String codigo;
    private String especialidad;

    public Docente(Long id, String nombre, String email,
                   String codigo, String especialidad) {
        super(id, nombre, email);
        this.codigo = codigo;
        this.especialidad = especialidad;
    }
}
