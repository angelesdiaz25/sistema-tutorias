package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class NotificadorWhatsApp implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("WhatsApp enviado a " + destinatario + ": " + mensaje);
    }
}
