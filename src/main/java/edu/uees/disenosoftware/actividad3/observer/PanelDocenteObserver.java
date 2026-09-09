package edu.uees.disenosoftware.actividad3.observer;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public class PanelDocenteObserver implements ReservaObserver {

    @Override
    public void actualizar(Reserva reserva) {
        System.out.println(
                "Panel del docente actualizado: reserva "
                        + reserva.getId()
                        + " - " + reserva.getEstado()
        );
    }
}
