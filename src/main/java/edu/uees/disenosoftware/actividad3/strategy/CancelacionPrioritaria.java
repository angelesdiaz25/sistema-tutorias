package edu.uees.disenosoftware.actividad3.strategy;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public class CancelacionPrioritaria implements PoliticaCancelacion {

    @Override
    public boolean puedeCancelar(Reserva reserva) {
        return reserva.horasRestantes() >= 1;
    }
}
