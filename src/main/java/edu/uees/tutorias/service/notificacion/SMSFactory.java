package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class SMSFactory extends NotificadorFactory {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorSMS();
    }
}
