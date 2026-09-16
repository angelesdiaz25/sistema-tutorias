package edu.uees.disenosoftware.actividad1;

public class ServicioTutorias {

    private static final int HORAS_MINIMAS_CONFIRMACION = 2;

    public void confirmarReserva(
            Reserva reserva,
            int horasAnticipacion) {

        if (!esReservaProcesable(
                reserva,
                horasAnticipacion)) {
            return;
        }

        procesarConfirmacion(reserva);
    }

    private boolean esReservaProcesable(
            Reserva reserva,
            int horasAnticipacion) {

        if (reserva == null) {
            return false;
        }

        if (reserva.getEstudiante() == null) {
            return false;
        }

        if (reserva.isCancelada()) {
            return false;
        }

        return horasAnticipacion
                >= HORAS_MINIMAS_CONFIRMACION;
    }

    private void procesarConfirmacion(Reserva reserva) {
        System.out.println("Procesando " + reserva.getId());
        reserva.confirmar();
        System.out.println("OK");
    }
}
