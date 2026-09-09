package edu.uees.disenosoftware.app;

import edu.uees.disenosoftware.adapter.ProveedorZoom;
import edu.uees.disenosoftware.adapter.Videoconferencia;
import edu.uees.disenosoftware.adapter.ZoomAdapter;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PATRÓN ADAPTER ===");

        ProveedorZoom zoom = new ProveedorZoom();
        Videoconferencia video = new ZoomAdapter(zoom);

        String enlace = video.crearSala(
                "Tutoría Diseño de Software",
                "docente@uees.edu.ec"
        );

        System.out.println("Enlace: " + enlace);
    }
}
