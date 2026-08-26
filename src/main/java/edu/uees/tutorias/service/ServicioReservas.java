package edu.uees.tutorias.service;

import edu.uees.tutorias.domain.Estudiante;
import edu.uees.tutorias.domain.HorarioTutoria;
import edu.uees.tutorias.domain.Reserva;

public class ServicioReservas {

    private final RepositorioReservas repositorio;
    private final Notificador notificador;

    public ServicioReservas(
            RepositorioReservas repositorio,
            Notificador notificador) {
        this.repositorio = repositorio;
        this.notificador = notificador;
    }

    public Reserva crearReserva(
            Estudiante estudiante,
            HorarioTutoria horario) {

        horario.reservar();

        Reserva reserva =
                new Reserva(1L, estudiante, horario);

        repositorio.guardar(reserva);

        notificador.enviar(
                estudiante.getEmail(),
                "Reserva confirmada"
        );

        return reserva;
    }
}
