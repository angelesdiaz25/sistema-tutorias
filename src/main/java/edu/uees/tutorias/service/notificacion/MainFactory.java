package edu.uees.tutorias.service.notificacion;

public class MainFactory {

    public static void main(String[] args) {

        NotificadorFactory emailFactory = new EmailFactory();
        emailFactory.notificar(
                "estudiante@uees.edu.ec",
                "Su tutoría ha sido confirmada"
        );

        NotificadorFactory smsFactory = new SMSFactory();
        smsFactory.notificar(
                "0999999999",
                "Su tutoría ha sido confirmada"
        );

        NotificadorFactory pushFactory = new PushFactory();
        pushFactory.notificar(
                "usuario123",
                "Tiene una tutoría programada"
        );

        NotificadorFactory whatsappFactory = new WhatsAppFactory();
        whatsappFactory.notificar(
                "0999999999",
                "Recordatorio de tutoría para mañana"
        );
System.out.println();

NotificadorFactory teamsFactory = new TeamsFactory();
teamsFactory.notificar(
        "angeles.diaz@uees.edu.ec",
        "Su tutoría fue confirmada mediante Microsoft Teams"
);

    }
}
