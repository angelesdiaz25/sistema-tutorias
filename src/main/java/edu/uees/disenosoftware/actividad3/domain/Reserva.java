package edu.uees.disenosoftware.actividad3.domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class Reserva {

    private final String id;
    private final LocalDateTime fechaHora;
    private EstadoReserva estado = EstadoReserva.PENDIENTE;

    public Reserva(String id, LocalDateTime fechaHora) {
        this.id = id;
        this.fechaHora = fechaHora;
    }

    public long horasRestantes() {
        return Duration.between(
                LocalDateTime.now(), fechaHora
        ).toHours();
    }

    public void confirmar() {
        estado = EstadoReserva.CONFIRMADA;
    }

    public void cancelar() {
        estado = EstadoReserva.CANCELADA;
    }

    public String getId() {
        return id;
    }

    public EstadoReserva getEstado() {
        return estado;
    }
}
