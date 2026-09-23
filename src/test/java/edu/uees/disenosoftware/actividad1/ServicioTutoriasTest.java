package edu.uees.disenosoftware.actividad1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioTutoriasTest {

    private final ServicioTutorias servicio = new ServicioTutorias();

    @Test
    void confirmaReservaValidaConAnticipacionSuficiente() {
        Reserva reserva = new Reserva("R-001", "E-001", false);

        servicio.confirmarReserva(reserva, 5);

        assertTrue(reserva.isConfirmada());
    }

    @Test
    void noConfirmaReservaCancelada() {
        Reserva reserva = new Reserva("R-002", "E-002", true);

        servicio.confirmarReserva(reserva, 5);

        assertFalse(reserva.isConfirmada());
    }

    @Test
    void aceptaReservaNulaSinLanzarExcepcion() {
        assertDoesNotThrow(() -> servicio.confirmarReserva(null, 5));
    }

    @Test
    void noConfirmaConAnticipacionInsuficiente() {
        Reserva reserva = new Reserva("R-003", "E-003", false);

        servicio.confirmarReserva(reserva, 1);

        assertFalse(reserva.isConfirmada());
    }

    @Test
    void noConfirmaReservaSinEstudiante() {
        Reserva reserva = new Reserva("R-004", null, false);

        servicio.confirmarReserva(reserva, 5);

        assertFalse(reserva.isConfirmada());
    }
}
