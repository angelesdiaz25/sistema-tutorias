# Ae5 – Refactorización respaldada por pruebas unitarias

## Datos generales

- Estudiante: Ángeles Díaz
- Proyecto: Sistema de tutorías
- Actividad: Ae5 – Refactorización respaldada por pruebas unitarias
- Lenguaje: Java 21
- Gestión del proyecto: Maven
- Pruebas: JUnit 5

## Objetivo

Mejorar el diseño interno del servicio de confirmación de reservas mediante refactorizaciones incrementales, utilizando pruebas unitarias como red de seguridad para comprobar que el comportamiento original se conserva.

## Código inicial

Inicialmente, `ServicioTutorias` concentraba la validación de la reserva y su confirmación. Esto provocaba que una sola clase tuviera varias responsabilidades y conociera directamente todas las reglas del negocio.

Entre los problemas identificados se encontraron:

- Validaciones y confirmación en una misma clase.
- Regla de anticipación representada mediante un valor entero.
- Baja separación de responsabilidades.
- Dificultad para probar cada responsabilidad de manera aislada.
- Mayor riesgo al modificar las reglas del negocio.

## Pruebas unitarias

Se construyeron cinco pruebas JUnit para proteger el comportamiento existente:

1. Una reserva válida con cinco horas de anticipación se confirma.
2. Una reserva cancelada no se confirma.
3. Una reserva nula no produce una excepción.
4. Una reserva con anticipación insuficiente no se confirma.
5. Una reserva sin estudiante no se confirma.

Comando utilizado:

```bash
mvn clean test
