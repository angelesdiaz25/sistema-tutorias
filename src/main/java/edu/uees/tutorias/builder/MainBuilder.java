package edu.uees.tutorias.builder;

import edu.uees.tutorias.domain.Estudiante;
import edu.uees.tutorias.domain.HorarioTutoria;
import edu.uees.tutorias.domain.Reserva;

public class MainBuilder {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                1L,
                "Angeles Diaz",
                "angeles@uees.edu.ec",
                "EST001",
                "Computacion"
        );

        HorarioTutoria horario1 = new HorarioTutoria();
        HorarioTutoria horario2 = new HorarioTutoria();

        // Reserva 1: utiliza valores por defecto
        Reserva reservaPresencial = new ReservaBuilder()
                .id(1L)
                .estudiante(estudiante)
                .horario(horario1)
                .build();

        // Reserva 2: utiliza campos opcionales
        Reserva reservaVirtual = new ReservaBuilder()
                .id(2L)
                .estudiante(estudiante)
                .horario(horario2)
                .modalidad("VIRTUAL")
                .observaciones("Revision de patrones de diseno")
                .enlaceVirtual("https://meet.google.com/tutoria")
                .duracion(90)
                .build();

        System.out.println("=== RESERVA 1 ===");
        System.out.println("ID: " + reservaPresencial.getId());
        System.out.println("Estado: " + reservaPresencial.getEstado());
        System.out.println("Modalidad: " + reservaPresencial.getModalidad());
        System.out.println("Duracion: " + reservaPresencial.getDuracion());

        System.out.println();

        System.out.println("=== RESERVA 2 ===");
        System.out.println("ID: " + reservaVirtual.getId());
        System.out.println("Estado: " + reservaVirtual.getEstado());
        System.out.println("Modalidad: " + reservaVirtual.getModalidad());
        System.out.println("Observaciones: " + reservaVirtual.getObservaciones());
        System.out.println("Enlace: " + reservaVirtual.getEnlaceVirtual());
        System.out.println("Duracion: " + reservaVirtual.getDuracion());
    }
}
