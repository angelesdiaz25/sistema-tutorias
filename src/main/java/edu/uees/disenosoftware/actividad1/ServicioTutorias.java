package edu.uees.disenosoftware.actividad1;

public class ServicioTutorias {

    public void confirmarReserva(
            Reserva reserva,
            int horasAnticipacion) {

        if (reserva != null) {
            if (reserva.getEstudiante() != null) {
                if (!reserva.isCancelada()) {
                    if (horasAnticipacion >= 2) {
                        System.out.println(
                                "Procesando " + reserva.getId());
                        reserva.confirmar();
                        System.out.println("OK");
                    }
                }
            }
        }
    }
}
