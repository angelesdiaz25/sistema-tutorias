package edu.uees.tutorias.domain;

public class Estudiante extends Usuario {

    private String codigo;
    private String carrera;

    public Estudiante(Long id, String nombre, String email,
                      String codigo, String carrera) {
        super(id, nombre, email);
        this.codigo = codigo;
        this.carrera = carrera;
    }
}
