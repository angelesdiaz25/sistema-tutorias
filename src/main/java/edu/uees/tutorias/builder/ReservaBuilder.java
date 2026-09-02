package edu.uees.tutorias.builder;

import edu.uees.tutorias.domain.Estudiante;
import edu.uees.tutorias.domain.HorarioTutoria;
import edu.uees.tutorias.domain.Reserva;

public class ReservaBuilder {

    // Obligatorios
    private Long id;
    private Estudiante estudiante;
    private HorarioTutoria horario;

    // Opcionales con valores por defecto
    private String modalidad = "PRESENCIAL";
    private String observaciones = "";
    private String enlaceVirtual = "";
    private int duracion = 60;

    public ReservaBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public ReservaBuilder estudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
        return this;
    }

    public ReservaBuilder horario(HorarioTutoria horario) {
        this.horario = horario;
        return this;
    }

    public ReservaBuilder modalidad(String modalidad) {
        this.modalidad = modalidad;
        return this;
    }

    public ReservaBuilder observaciones(String observaciones) {
        this.observaciones = observaciones;
        return this;
    }

    public ReservaBuilder enlaceVirtual(String enlaceVirtual) {
        this.enlaceVirtual = enlaceVirtual;
        return this;
    }

    public ReservaBuilder duracion(int duracion) {
        this.duracion = duracion;
        return this;
    }

    public Reserva build() {

        if (id == null) {
            throw new IllegalStateException(
                "El id de la reserva es obligatorio"
            );
        }

        if (estudiante == null) {
            throw new IllegalStateException(
                "El estudiante es obligatorio"
            );
        }

        if (horario == null) {
            throw new IllegalStateException(
                "El horario es obligatorio"
            );
        }

        if (duracion <= 0) {
            throw new IllegalStateException(
                "La duración debe ser mayor a cero"
            );
        }

        return new Reserva(
            id,
            estudiante,
            horario,
            modalidad,
            observaciones,
            enlaceVirtual,
            duracion
        );
    }
}
