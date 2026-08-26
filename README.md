# Sistema de Gestión de Tutorías

Proyecto desarrollado para la asignatura Diseño de Software - UCOM0310.


#Analisis
En el diseño del Sistema de Gestión de Tutorías se buscó que cada clase tenga una responsabilidad específica. Por ejemplo, HorarioTutoria controla la disponibilidad, mientras que Reserva gestiona el estado de las reservas. La clase ServicioReservas se encarga de coordinar el proceso sin realizar todas las tareas directamente. Para evitar un alto acoplamiento se utilizaron las interfaces RepositorioReservas y Notificador. Estas permiten separar la lógica del sistema de tecnologías específicas como una base de datos o un servicio de correo. Si en el futuro se cambia la tecnología de almacenamiento, solamente sería necesario implementar un nuevo repositorio. De igual manera, se podría cambiar el correo por otro tipo de notificación sin modificar ServicioReservas. Con esto se obtiene un sistema más organizado, flexible y fácil de mantener.


## Descripción
Sistema orientado a objetos para gestionar tutorías académicas entre estudiantes y docentes.

## Clases principales
- Usuario
- Estudiante
- Docente
- HorarioTutoria
- Reserva
- ServicioReservas

## Diseño
El sistema separa las responsabilidades entre las clases del dominio y los servicios.

Se utilizan las interfaces RepositorioReservas y Notificador para reducir el acoplamiento.

## Principios SOLID
- SRP: cada clase posee una responsabilidad específica.
- DIP: ServicioReservas depende de abstracciones y no de tecnologías concretas.

## Compilación
Para compilar el proyecto:

mvn clean compile

## Resultado
El proyecto compila correctamente con Maven.

## Uso de inteligencia artificial
Durante el desarrollo utilicé herramientas de inteligencia artificial como apoyo para organizar el análisis, comprender los principios SOLID y revisar la implementación. El contenido y código fueron revisados y adaptados antes de la entrega.


##Conclusion
El desarrollo de esta actividad permitió aplicar de manera práctica los conceptos de diseño orientado a objetos en un Sistema de Gestión de Tutorías. Se identificaron las clases principales y se distribuyeron sus responsabilidades para mantener una buena organización del código. También se aplicaron principios SOLID como SRP y DIP para reducir el acoplamiento y facilitar futuros cambios. El diagrama UML permitió representar gráficamente la estructura y las relaciones del sistema, manteniendo coherencia con las clases desarrolladas en Java. Además, se utilizó Maven para comprobar correctamente la compilación del proyecto y Git/GitHub para registrar su evolución mediante diferentes commits. En conclusión, la actividad permitió comprender que un buen diseño no consiste solamente en crear código que funcione, sino también en desarrollar una solución clara, mantenible y preparada para evoluciona
