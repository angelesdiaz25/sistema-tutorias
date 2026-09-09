package edu.uees.disenosoftware.actividad3.observer;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public class PanelEstudianteObserver implements ReservaObserver {

    @Override
    public void actualizar(Reserva reserva) {
        System.out.println(
                "Panel del estudiante actualizado: reserva "
                        + reserva.getId()
                        + " - " + reserva.getEstado()
        );
    }
}
