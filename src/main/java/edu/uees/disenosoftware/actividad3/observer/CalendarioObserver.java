package edu.uees.disenosoftware.actividad3.observer;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public class CalendarioObserver implements ReservaObserver {

    @Override
    public void actualizar(Reserva reserva) {
        System.out.println(
                "Calendario actualizado para "
                        + reserva.getId()
        );
    }
}
