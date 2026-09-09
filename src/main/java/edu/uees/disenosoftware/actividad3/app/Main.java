package edu.uees.disenosoftware.actividad3.app;

import edu.uees.disenosoftware.actividad3.domain.Reserva;
import edu.uees.disenosoftware.actividad3.observer.CalendarioObserver;
import edu.uees.disenosoftware.actividad3.observer.EmailObserver;
import edu.uees.disenosoftware.actividad3.strategy.CancelacionEmergencia;
import edu.uees.disenosoftware.actividad3.strategy.CancelacionGrupal;
import edu.uees.disenosoftware.actividad3.strategy.CancelacionNormal;
import edu.uees.disenosoftware.actividad3.strategy.ServicioCancelacion;
import edu.uees.disenosoftware.actividad3.observer.PanelDocenteObserver;
import edu.uees.disenosoftware.actividad3.observer.PanelEstudianteObserver;


import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PRUEBA DEL PATRÓN STRATEGY ===");

        ServicioCancelacion servicio =
                new ServicioCancelacion(new CancelacionNormal());

        Reserva normal = new Reserva(
                "R-001",
                LocalDateTime.now().plusHours(5)
        );

        servicio.cancelar(normal);
        System.out.println(
                "Cancelación normal: " + normal.getEstado()
        );

        Reserva grupal = new Reserva(
                "R-002",
                LocalDateTime.now().plusHours(30)
        );

        servicio.cambiarPolitica(new CancelacionGrupal());
        servicio.cancelar(grupal);
        System.out.println(
                "Cancelación grupal: " + grupal.getEstado()
        );

        Reserva emergencia = new Reserva(
                "R-003",
                LocalDateTime.now().plusMinutes(30)
        );

        servicio.cambiarPolitica(
                new CancelacionEmergencia(true)
        );
        servicio.cancelar(emergencia);
        System.out.println(
                "Cancelación de emergencia: "
                        + emergencia.getEstado()
        );

        System.out.println();
        System.out.println("=== PRUEBA DEL PATRÓN OBSERVER ===");

        Reserva reservaObserver = new Reserva(
                "R-004",
                LocalDateTime.now().plusHours(5)
        );


        reservaObserver.agregarObserver(
                new EmailObserver()
        );

        reservaObserver.agregarObserver(
                new CalendarioObserver()
        );

	reservaObserver.agregarObserver(
        new PanelEstudianteObserver()
);

reservaObserver.agregarObserver(
        new PanelDocenteObserver()
);

        System.out.println(
                "Estado inicial: "
                        + reservaObserver.getEstado()
        );

        reservaObserver.confirmar();

        System.out.println(
                "Estado final: "
                        + reservaObserver.getEstado()
        );
    }
}
