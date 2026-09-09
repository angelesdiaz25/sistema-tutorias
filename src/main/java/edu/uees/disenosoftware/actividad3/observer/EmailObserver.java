package edu.uees.disenosoftware.actividad3.observer;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public class EmailObserver implements ReservaObserver {

    @Override
    public void actualizar(Reserva reserva) {
        System.out.println(
                "Email: la reserva " + reserva.getId()
                        + " cambió al estado "
                        + reserva.getEstado()
        );
    }
}
