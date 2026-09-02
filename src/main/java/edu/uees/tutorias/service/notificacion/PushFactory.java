package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class PushFactory extends NotificadorFactory {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorPush();
    }
}
