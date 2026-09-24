package edu.uees.disenosoftware.actividad1;

public class ServicioTutorias {

    private final ValidadorReserva validadorReserva;
    private final ConfirmadorReserva confirmadorReserva;

    public ServicioTutorias() {
        this(new ValidadorReserva(), new ConfirmadorReserva());
    }

    ServicioTutorias(
            ValidadorReserva validadorReserva,
            ConfirmadorReserva confirmadorReserva) {

        this.validadorReserva = validadorReserva;
        this.confirmadorReserva = confirmadorReserva;
    }

    public void confirmarReserva(
            Reserva reserva,
            int horasAnticipacion) {

        Anticipacion anticipacion =
                new Anticipacion(horasAnticipacion);

        if (!validadorReserva.puedeConfirmarse(
                reserva,
                anticipacion)) {
            return;
        }

        confirmadorReserva.confirmar(reserva);
    }
}
