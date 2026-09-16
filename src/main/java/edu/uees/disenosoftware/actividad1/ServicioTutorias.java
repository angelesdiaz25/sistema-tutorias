package edu.uees.disenosoftware.actividad1;

public class ServicioTutorias {

    private static final int HORAS_MINIMAS_CONFIRMACION = 2;

    public void confirmarReserva(
            Reserva reserva,
            int horasAnticipacion) {

        if (reserva != null) {
            if (reserva.getEstudiante() != null) {
                if (!reserva.isCancelada()) {
                    if (horasAnticipacion
                            >= HORAS_MINIMAS_CONFIRMACION) {

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
