package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("SMS enviado a " + destinatario + ": " + mensaje);
    }
}
