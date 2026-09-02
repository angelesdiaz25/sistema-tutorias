package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public abstract class NotificadorFactory {

    public abstract Notificador crearNotificador();

    public void notificar(String destinatario, String mensaje) {
        Notificador notificador = crearNotificador();
        notificador.enviar(destinatario, mensaje);
    }
}
