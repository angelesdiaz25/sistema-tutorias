package edu.uees.disenosoftware.actividad3.strategy;

import edu.uees.disenosoftware.actividad3.domain.Reserva;

public class CancelacionEmergencia implements PoliticaCancelacion {

    private final boolean emergenciaJustificada;

    public CancelacionEmergencia(boolean emergenciaJustificada) {
        this.emergenciaJustificada = emergenciaJustificada;
    }

    @Override
    public boolean puedeCancelar(Reserva reserva) {
        return emergenciaJustificada
                && reserva.minutosRestantes() >= 15;
    }
}
