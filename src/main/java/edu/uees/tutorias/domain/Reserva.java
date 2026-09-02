package edu.uees.tutorias.domain;

public class Reserva {

    private Long id;
    private Estudiante estudiante;
    private HorarioTutoria horario;
    private String estado;

    // Campos opcionales para Builder
    private String modalidad;
    private String observaciones;
    private String enlaceVirtual;
    private int duracion;

    // Constructor original: lo mantenemos para no romper el Ae1
    public Reserva(Long id, Estudiante estudiante,
                   HorarioTutoria horario) {

        this(id, estudiante, horario,
             "PRESENCIAL", "", "", 60);
    }

    // Constructor utilizado por ReservaBuilder
    public Reserva(Long id,
                   Estudiante estudiante,
                   HorarioTutoria horario,
                   String modalidad,
                   String observaciones,
                   String enlaceVirtual,
                   int duracion) {

        this.id = id;
        this.estudiante = estudiante;
        this.horario = horario;
        this.estado = "CONFIRMADA";
        this.modalidad = modalidad;
        this.observaciones = observaciones;
        this.enlaceVirtual = enlaceVirtual;
        this.duracion = duracion;
    }

    public void cancelar() {
        estado = "CANCELADA";
        horario.liberar();
    }

    public Long getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public HorarioTutoria getHorario() {
        return horario;
    }

    public String getEstado() {
        return estado;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getEnlaceVirtual() {
        return enlaceVirtual;
    }

    public int getDuracion() {
        return duracion;
    }
}
