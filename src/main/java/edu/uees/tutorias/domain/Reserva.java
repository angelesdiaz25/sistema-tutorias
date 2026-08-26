package edu.uees.tutorias.domain;

public class Reserva {

    private Long id;
    private Estudiante estudiante;
    private HorarioTutoria horario;
    private String estado;

    public Reserva(Long id, Estudiante estudiante,
                   HorarioTutoria horario) {
        this.id = id;
        this.estudiante = estudiante;
        this.horario = horario;
        this.estado = "CONFIRMADA";
    }

    public void cancelar() {
        estado = "CANCELADA";
        horario.liberar();
    }
}
