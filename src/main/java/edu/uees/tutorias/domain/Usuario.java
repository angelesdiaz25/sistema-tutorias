package edu.uees.tutorias.domain;

public abstract class Usuario {

    private Long id;
    private String nombre;
    private String email;

    public Usuario(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}
