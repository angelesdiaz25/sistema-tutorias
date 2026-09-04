# Sistema de Gestión de Tutorías Académicas

## Descripción

Este proyecto corresponde al desarrollo de un **Sistema de Gestión de Tutorías Académicas**, realizado como parte de la asignatura de Ingeniería de Software.

El sistema permite gestionar diferentes elementos relacionados con las tutorías académicas, como estudiantes, docentes, horarios y reservas.

Como continuación del diseño inicial del sistema, se aplicaron patrones de diseño con el objetivo de mejorar la organización, mantenibilidad, extensibilidad y reutilización del código.

---

## Tecnologías utilizadas

- Java 17
- Maven
- Git
- GitHub
- Ubuntu / WSL
- PlantUML
- Programación Orientada a Objetos

---

## Estructura del proyecto

El proyecto está organizado principalmente en los siguientes paquetes:

```text
src/main/java/edu/uees/tutorias/
│
├── domain/
│   ├── Usuario.java
│   ├── Estudiante.java
│   ├── Docente.java
│   ├── HorarioTutoria.java
│   └── Reserva.java
│
├── service/
│   ├── Notificador.java
│   ├── ServicioReservas.java
│   └── RepositorioReservas.java
│
├── service/notificacion/
│   ├── NotificadorEmail.java
│   ├── NotificadorSMS.java
│   ├── NotificadorPush.java
│   ├── NotificadorWhatsApp.java
│   ├── NotificadorFactory.java
│   ├── EmailFactory.java
│   ├── SMSFactory.java
│   ├── PushFactory.java
│   ├── WhatsAppFactory.java
│   └── MainFactory.java
│
└── builder/
    ├── ReservaBuilder.java
    └── MainBuilder.java
