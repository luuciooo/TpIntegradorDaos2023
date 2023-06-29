# - Trabajo Práctico Integrador - 
# Desarrollo de Aplicaciones Orientadas a Servicios (DAOS) – 2023

Este es el README del Trabajo Práctico Integrador - Actividad 02 del curso de Desarrollo de Aplicaciones Orientadas a Servicios (DAOS) en el año 2023.

## Alumnos

- Ivan Mella
- Abalos Lucio

## Descripción

El presente trabajo práctico tiene como objetivo implementar una solución utilizando la arquitectura SOA (Service-Oriented Architecture). Se propone el desarrollo de una API REST que abarca diferentes servicios relacionados con el funcionamiento de una aerolínea.

## Servicios/Grupo de servicios a implementar:
### S01 - Clientes (Abalos Lucio)

- Establece/Actualiza/Retorna los datos de cliente.
- Operaciones requeridas: GET, POST, PUT, DELETE.
- Datos del cliente: DNI, nombre, apellido, domicilio, e-mail, fecha de nacimiento, número de pasaporte y fecha de vencimiento del pasaporte.
- Restricciones: No se puede actualizar el DNI del cliente y no puede haber dos clientes con el mismo DNI.

### S02 - Vuelos (Ivan Mella)

- Establece/Actualiza/Retorna los datos de un vuelo.
- Operaciones requeridas: GET, POST, PUT, DELETE.
- Datos del vuelo: Número, fecha/hora, número de filas, número de asientos por fila, tipo de vuelo, destino, origen y estado.
- Restricciones: No puede haber dos vuelos con el mismo número. Una vez registrado, solo se permite cambiar la fecha y hora del vuelo (lo cual cambia su estado "reprogramado") o eliminar el vuelo (lo cual cambia su estado a "cancelado").

## Java Version 20
  
## Dependecias necesarias

- spring-boot-starter-web: Proporciona las dependencias necesarias para crear una aplicación web utilizando Spring Boot.

- spring-boot-devtools: Proporciona herramientas de desarrollo para facilitar el desarrollo en Spring Boot, como la capacidad de reiniciar automáticamente la aplicación cuando se detectan cambios en el código fuente.

- spring-boot-starter-test: Proporciona las dependencias necesarias para realizar pruebas unitarias en la aplicación.

- spring-boot-starter-hateoas: Proporciona soporte para HATEOAS (Hypermedia as the Engine of Application State) en Spring Boot, lo cual permite generar enlaces y respuestas en formato JSON que facilitan la navegación y descubrimiento de los recursos de la API.

- spring-boot-starter-data-jpa: Proporciona soporte para la persistencia de datos utilizando JPA (Java Persistence API) en Spring Boot. Permite interactuar con una base de datos relacional utilizando entidades y repositorios.

- spring-boot-starter-validation: Proporciona validaciones de datos en Spring Boot utilizando las anotaciones de validación de Bean Validation.

- lombok: Biblioteca que permite reducir la cantidad de código boilerplate en las clases Java mediante el uso de anotaciones. Proporciona anotaciones como @Getter, @Setter, @NoArgsConstructor, entre otras, para generar automáticamente los métodos correspondientes.

- modelmapper: Biblioteca que facilita la conversión de objetos entre diferentes modelos de datos en Java. Ayuda a mapear los atributos de un objeto a otro de manera automática.

- mysql-connector-j: Driver JDBC (Java Database Connectivity) para conectarse a una base de datos MySQL.

## Configuacion de Base de datos y script

- Primer paso bajarse el repositorio de la rama master
- Segundo paso crear un nuevo Schema en Worbench "daos2023"
- Tercero paso Importar daos2023.sql
- Cuarto Paso Runear La aplicacion

## Casos de Prueba
### Clientes (Abalos Lucio)

- Clientes.postman_collection.json

### Vuelos (Ivan Mella)

- Vuelos.postman_collection.json
