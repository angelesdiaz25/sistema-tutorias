# Sistema de Gestión de Tutorías Académicas

## Descripción

Este proyecto corresponde al desarrollo de un **Sistema de Gestión de Tutorías Académicas**, realizado como parte de la asignatura de Ingeniería de Software.

El sistema permite gestionar diferentes elementos relacionados con las tutorías académicas, como estudiantes, docentes, horarios y reservas.

Como continuación del diseño inicial del sistema, se aplicaron patrones de diseño con el objetivo de mejorar la organización, mantenibilidad, extensibilidad y reutilización del código.

---

## Tecnologías utilizadas


- Maven
- Java 21
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
│   ├── NotificadorTeams.java
│   ├── TeamsFactory.java
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


## Actividad Semana 4: Adapter y Facade

### 1. ¿Qué componente representa Target, Adapter y Adaptee?

El Target es la interfaz `Videoconferencia`, porque define el contrato que utiliza el sistema para crear una sala virtual. Los Adapter son `ZoomAdapter` y `TeamsAdapter`, ya que convierten las operaciones externas al método `crearSala()`. Los Adaptee son `ProveedorZoom` y `MicrosoftTeamsAPI`, porque contienen las interfaces originales e incompatibles de cada proveedor.

### 2. ¿Qué tendría que cambiar si se reemplaza Zoom por Teams?

Solamente se debe cambiar la creación del adaptador en la clase principal. En lugar de usar `ZoomAdapter` con `ProveedorZoom`, se utiliza `TeamsAdapter` con `MicrosoftTeamsAPI`. No es necesario modificar la interfaz `Videoconferencia` ni la clase `TutoriasFacade`.

### 3. ¿Por qué Facade no es lo mismo que Adapter?

Adapter permite que dos interfaces incompatibles puedan trabajar juntas. Facade proporciona una interfaz sencilla para coordinar varios servicios y ocultar la complejidad del proceso. Adapter transforma una interfaz, mientras que Facade simplifica el acceso a un conjunto de componentes.

### 4. ¿Qué código quedaría acoplado si elimináramos Videoconferencia?

Sin la interfaz `Videoconferencia`, `TutoriasFacade` y la clase principal dependerían directamente de `ProveedorZoom` o `MicrosoftTeamsAPI`. Al cambiar de proveedor sería necesario modificar esas clases, aumentando el acoplamiento y dificultando el mantenimiento.

### 5. ¿Qué riesgo aparece si TutoriasFacade empieza a validar todas las reglas de negocio?

`TutoriasFacade` podría convertirse en una clase Dios con demasiadas responsabilidades. Esto reduciría su cohesión, dificultaría las pruebas y violaría el principio de responsabilidad única. La Facade debe coordinar servicios, mientras que las reglas del negocio deben mantenerse en las clases correspondientes.

### Conclusión

La actividad permitió comprender que Adapter y Facade son patrones estructurales con objetivos diferentes. Adapter integra proveedores con interfaces incompatibles sin afectar al resto del sistema, mientras que Facade coordina varios servicios mediante una operación sencilla. La incorporación de Microsoft Teams demostró que el sistema puede cambiar de proveedor sin modificar la Facade ni el contrato de videoconferencia.


---

## Actividad 3 - Strategy y Observer

### Preguntas de análisis

#### 1. ¿Qué parte es estable y qué parte es variable en Strategy?

La parte estable es el proceso de cancelación realizado por
`ServicioCancelacion`. La parte variable son las reglas que determinan si
una reserva puede cancelarse. Estas reglas se encuentran separadas en
`CancelacionNormal`, `CancelacionPrioritaria`, `CancelacionGrupal` y
`CancelacionEmergencia`.

#### 2. ¿Qué tendría que cambiar para agregar CancelacionGrupal?

Solamente fue necesario crear una nueva clase que implementa la interfaz
`PoliticaCancelacion`. No fue necesario modificar `ServicioCancelacion`.
Esto favorece el principio abierto/cerrado, porque el sistema puede
extenderse mediante nuevas estrategias sin alterar el código existente.

#### 3. ¿Quién es Subject y quiénes son Observers?

El Subject es la clase `Reserva`, porque mantiene la lista de observadores
y les comunica sus cambios de estado. Los Observers son
`EmailObserver`, `CalendarioObserver`, `PanelEstudianteObserver` y
`PanelDocenteObserver`.

#### 4. ¿Qué problema habría si un Observer lanza una excepción?

Si un Observer lanza una excepción y esta no se controla, la ejecución del
método `notificar()` puede detenerse. Como resultado, los observadores
ubicados después del componente que falló podrían no recibir la
notificación. Una solución sería controlar cada excepción por separado o
utilizar un mecanismo de eventos asíncronos.

#### 5. ¿Por qué Strategy y Observer son patrones de comportamiento, pero no resuelven el mismo problema?

Ambos patrones organizan el comportamiento y la colaboración entre
objetos. Strategy permite intercambiar algoritmos o políticas para
realizar una operación. Observer permite que varios componentes reaccionen
cuando otro objeto cambia. Strategy resuelve la variación de una regla,
mientras que Observer resuelve la comunicación de eventos.

### Relación con OCP y DIP

Strategy favorece OCP porque permite agregar nuevas políticas sin
modificar `ServicioCancelacion`. También favorece DIP porque el servicio
depende de la abstracción `PoliticaCancelacion` y no de una política
concreta.

Observer favorece OCP porque permite agregar nuevos receptores sin
modificar la lógica de `Reserva`. Además, favorece DIP porque `Reserva`
depende de la abstracción `ReservaObserver` y no directamente de correo,
calendario o paneles específicos.

### Conclusiones

En esta práctica se comprobó que Strategy permite separar las diferentes
reglas de cancelación y cambiar la política utilizada durante la
ejecución. De esta forma se evitan bloques condicionales extensos y se
facilita la incorporación de nuevas reglas.

También se aplicó Observer para notificar los cambios de estado de una
reserva. El correo, el calendario y los paneles reaccionan de manera
independiente, sin introducir sus responsabilidades dentro de `Reserva`.
Los dos patrones mejoran la extensibilidad, reducen el acoplamiento y
permiten mantener el sistema de tutorías de una forma más organizada.
