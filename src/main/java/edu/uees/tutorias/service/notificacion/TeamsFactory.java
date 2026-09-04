package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class TeamsFactory extends NotificadorFactory {

    @Override
    public Notificador crearNotificador() {
        return new NotificadorTeams();
    }
}
