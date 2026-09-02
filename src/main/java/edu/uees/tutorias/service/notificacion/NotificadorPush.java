package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class NotificadorPush implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Notificación push enviada a " + destinatario + ": " + mensaje);
    }
}
