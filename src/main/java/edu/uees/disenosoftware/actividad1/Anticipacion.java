package edu.uees.disenosoftware.actividad1;

public record Anticipacion(int horas) {

    private static final int HORAS_MINIMAS_CONFIRMACION = 2;

    public boolean esSuficienteParaConfirmar() {
        return horas >= HORAS_MINIMAS_CONFIRMACION;
    }
}
