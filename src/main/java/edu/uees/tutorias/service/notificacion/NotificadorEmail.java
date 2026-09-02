package edu.uees.tutorias.service.notificacion;

import edu.uees.tutorias.service.Notificador;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Correo enviado a " + destinatario + ": " + mensaje);
    }
}
