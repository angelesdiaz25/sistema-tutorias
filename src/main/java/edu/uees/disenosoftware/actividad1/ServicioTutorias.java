package edu.uees.disenosoftware.actividad1;

public class ServicioTutorias {

    private final ValidadorReserva validadorReserva;

    public ServicioTutorias() {
        this(new ValidadorReserva());
    }

    ServicioTutorias(ValidadorReserva validadorReserva) {
        this.validadorReserva = validadorReserva;
    }

    public void confirmarReserva(
            Reserva reserva,
            int horasAnticipacion) {

        if (!validadorReserva.puedeConfirmarse(
                reserva,
                horasAnticipacion)) {
            return;
        }

        procesarConfirmacion(reserva);
    }

    private void procesarConfirmacion(Reserva reserva) {
        System.out.println("Procesando " + reserva.getId());
        reserva.confirmar();
        System.out.println("OK");
    }
}
