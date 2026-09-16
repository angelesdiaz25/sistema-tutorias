package edu.uees.disenosoftware.actividad1;

public class ServicioTutorias {

    public void proc(Reserva r, int h) {
        if (r != null) {
            if (r.getEstudiante() != null) {
                if (!r.isCancelada()) {
                    if (h >= 2) {
                        System.out.println("Procesando " + r.getId());
                        r.confirmar();
                        System.out.println("OK");
                    }
                }
            }
        }
    }
}
