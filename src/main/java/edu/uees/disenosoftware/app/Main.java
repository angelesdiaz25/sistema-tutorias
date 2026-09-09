package edu.uees.disenosoftware.app;

import edu.uees.disenosoftware.adapter.ProveedorZoom;
import edu.uees.disenosoftware.adapter.ZoomAdapter;
import edu.uees.disenosoftware.domain.Docente;
import edu.uees.disenosoftware.domain.Estudiante;
import edu.uees.disenosoftware.domain.Reserva;
import edu.uees.disenosoftware.facade.NotificadorConsola;
import edu.uees.disenosoftware.facade.ServicioCalendario;
import edu.uees.disenosoftware.facade.ServicioReservas;
import edu.uees.disenosoftware.facade.TutoriasFacade;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Ángeles Díaz",
                "angeles.diaz@uees.edu.ec"
        );

        Docente docente = new Docente(
                "Docente UEES",
                "docente@uees.edu.ec"
        );

        Reserva reserva = new Reserva(
                "RES-001",
                estudiante,
                docente,
                "Patrones Adapter y Facade"
        );

        TutoriasFacade facade = new TutoriasFacade(
                new ServicioReservas(),
                new ZoomAdapter(new ProveedorZoom()),
                new ServicioCalendario(),
                new NotificadorConsola()
        );

        facade.crearTutoriaVirtual(reserva);
    }
}
