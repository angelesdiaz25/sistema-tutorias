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
## Actividad 2: Factory Method

### ¿Qué archivos nuevos fueron necesarios?

Fue necesario crear `NotificadorTeams.java`, que representa el producto concreto encargado de enviar notificaciones mediante Microsoft Teams, y `TeamsFactory.java`, que se encarga de crear una instancia de dicho notificador.

### ¿Qué clases existentes permanecieron sin cambios?

Permanecieron sin cambios la interfaz `Notificador`, la clase abstracta `NotificadorFactory` y las implementaciones correspondientes a Email, SMS y Push. Solamente fue necesario modificar `MainFactory` para demostrar el funcionamiento de Teams.

### ¿Dónde sigue existiendo acoplamiento concreto?

El acoplamiento concreto continúa dentro de cada fábrica específica, porque cada fábrica debe conocer la clase concreta que crea. Por ejemplo, `TeamsFactory` conoce y crea directamente un objeto `NotificadorTeams`. También existe acoplamiento en `MainFactory`, donde se seleccionan explícitamente las fábricas que se utilizarán.

### ¿Qué complejidad adicional introdujo el patrón?

Factory Method aumenta la cantidad de clases, porque cada mecanismo de notificación necesita un producto concreto y una fábrica. Sin embargo, esta estructura permite que el sistema sea más organizado, extensible y fácil de mantener.

### Justificación del patrón Factory Method

Factory Method resuelve el problema de crear distintos mecanismos de notificación sin distribuir condicionales ni instanciaciones directas por todo el sistema. La variabilidad relacionada con la creación de objetos queda aislada en las fábricas concretas.

Aunque el patrón requiere más clases, este costo está justificado porque permite agregar nuevas notificaciones, como Teams o WhatsApp, sin modificar las implementaciones existentes. De esta manera se reduce el acoplamiento y se facilita la evolución del sistema.
