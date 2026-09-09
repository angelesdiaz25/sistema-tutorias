package edu.uees.disenosoftware.actividad3.strategy;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public interface PoliticaCancelacion {

    boolean puedeCancelar(Reserva reserva);
}
