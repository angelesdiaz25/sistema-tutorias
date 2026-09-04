package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class NotificadorTeams implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[TEAMS]");
        System.out.println("Usuario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}
