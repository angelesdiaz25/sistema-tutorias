package edu.uees.tutorias.domain;

public class HorarioTutoria {

    private Long id;
    private String fecha;
    private String hora;
    private boolean disponible = true;

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        if (!disponible) {
            throw new IllegalStateException("Horario no disponible");
        }
        disponible = false;
    }

    public void liberar() {
        disponible = true;
    }
}
