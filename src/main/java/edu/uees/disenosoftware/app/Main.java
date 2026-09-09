package edu.uees.disenosoftware.app;

import edu.uees.disenosoftware.adapter.MicrosoftTeamsAPI;
import edu.uees.disenosoftware.adapter.ProveedorZoom;
import edu.uees.disenosoftware.adapter.TeamsAdapter;
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

        System.out.println("=== TUTORÍA CON ZOOM ===");

        Reserva reservaZoom = new Reserva(
                "RES-001",
                estudiante,
                docente,
                "Patrones Adapter y Facade"
        );

        TutoriasFacade facadeZoom = new TutoriasFacade(
                new ServicioReservas(),
                new ZoomAdapter(new ProveedorZoom()),
                new ServicioCalendario(),
                new NotificadorConsola()
        );

        facadeZoom.crearTutoriaVirtual(reservaZoom);

        System.out.println();
        System.out.println("=== TUTORÍA CON MICROSOFT TEAMS ===");

        Reserva reservaTeams = new Reserva(
                "RES-002",
                estudiante,
                docente,
                "Patrones estructurales"
        );

        TutoriasFacade facadeTeams = new TutoriasFacade(
                new ServicioReservas(),
                new TeamsAdapter(new MicrosoftTeamsAPI()),
                new ServicioCalendario(),
                new NotificadorConsola()
        );

        facadeTeams.crearTutoriaVirtual(reservaTeams);
    }
}
