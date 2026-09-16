package edu.uees.disenosoftware.actividad1;

public class Reserva {

    private final String id;
    private final String estudiante;
    private boolean cancelada;
    private boolean confirmada;

    public Reserva(String id, String estudiante, boolean cancelada) {
        this.id = id;
        this.estudiante = estudiante;
        this.cancelada = cancelada;
        this.confirmada = false;
    }

    public String getId() {
        return id;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void confirmar() {
        confirmada = true;
    }
}
