package edu.uees.disenosoftware.actividad1;

public class ConfirmadorReserva {

    public void confirmar(Reserva reserva) {
        System.out.println("Procesando " + reserva.getId());
        reserva.confirmar();
        System.out.println("OK");
    }
}
