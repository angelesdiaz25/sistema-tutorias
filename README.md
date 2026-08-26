# Sistema de Gestión de Tutorías

Proyecto desarrollado para la asignatura Diseño de Software - UCOM0310.

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
