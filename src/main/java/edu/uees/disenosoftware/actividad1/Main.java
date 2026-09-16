package edu.uees.disenosoftware.actividad1;

public class Main {

    public static void main(String[] args) {
        ServicioTutorias servicio = new ServicioTutorias();

        System.out.println("=== LINEA BASE ===");

        System.out.println("\nCASO A: Reserva valida, 5 horas");
        Reserva valida = new Reserva("R-001", "Angeles", false);
        servicio.proc(valida, 5);
        System.out.println("Confirmada: " + valida.isConfirmada());

        System.out.println("\nCASO B: Reserva cancelada, 5 horas");
        Reserva cancelada = new Reserva("R-002", "Angeles", true);
        servicio.proc(cancelada, 5);
        System.out.println("Confirmada: " + cancelada.isConfirmada());

        System.out.println("\nCASO C: Reserva nula");
        servicio.proc(null, 5);
        System.out.println("No se produjo ningun error");

        System.out.println("\nCASO D: Anticipacion insuficiente");
        Reserva insuficiente = new Reserva("R-003", "Angeles", false);
        servicio.proc(insuficiente, 1);
        System.out.println("Confirmada: " + insuficiente.isConfirmada());
    }
}
