package edu.uees.disenosoftware.actividad1;

public class ValidadorReserva {

    public boolean puedeConfirmarse(
            Reserva reserva,
            Anticipacion anticipacion) {

        if (reserva == null) {
            return false;
        }

        if (reserva.getEstudiante() == null) {
            return false;
        }

        if (reserva.isCancelada()) {
            return false;
        }

        return anticipacion.esSuficienteParaConfirmar();
    }
}
