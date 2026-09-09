package edu.uees.disenosoftware.actividad3.app;

import edu.uees.disenosoftware.actividad3.domain.Reserva;
import edu.uees.disenosoftware.actividad3.strategy.CancelacionNormal;
import edu.uees.disenosoftware.actividad3.strategy.ServicioCancelacion;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRUEBA DEL PATRÓN STRATEGY ===");

        Reserva reserva = new Reserva(
                "R-001",
                LocalDateTime.now().plusHours(5)
        );

        System.out.println("Estado inicial: " + reserva.getEstado());
        System.out.println(
                "Horas restantes: " + reserva.horasRestantes()
        );

        ServicioCancelacion servicio =
                new ServicioCancelacion(new CancelacionNormal());

        servicio.cancelar(reserva);

        System.out.println("Estado final: " + reserva.getEstado());
        System.out.println(
                "Cancelación realizada mediante CancelacionNormal"
        );
    }
}
