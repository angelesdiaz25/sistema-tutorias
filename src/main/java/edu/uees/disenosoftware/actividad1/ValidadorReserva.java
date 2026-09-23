package edu.uees.disenosoftware.actividad1;

public class ValidadorReserva {

    private static final int HORAS_MINIMAS_CONFIRMACION = 2;

    public boolean puedeConfirmarse(
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

        return horasAnticipacion >= HORAS_MINIMAS_CONFIRMACION;
    }
}
