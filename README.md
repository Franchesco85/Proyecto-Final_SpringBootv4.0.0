✅ Badges
✅ Tabla visual
✅ Sección de instalación paso a paso
✅ Screenshots (con marcadores, listo para que luego coloques tus imágenes)
✅ Scripts útiles de Maven
✅ Sección “Roadmap”
✅ Licencia
✅ Agradecimientos
✅ Estilo totalmente profesional

🚀 Proyecto-Final_SpringBootv4.0.0

API REST con Spring Boot 4 + Java 21 + H2 + JPA


📘 Descripción General

Proyecto-Final_SpringBootv4.0.0 es un proyecto base desarrollado utilizando:

Java 21

Spring Boot 4.0.0

JPA/Hibernate

H2 Database

Arquitectura MVC con Servicios y Repositorios

El sistema implementa un módulo completo de Gestión de Usuarios, con todas las capas necesarias:

Controller (REST API)

Service + ServiceImpl

Repository (JPA)

Entity

DTOs

Mapper

Este proyecto funciona como modelo para desarrollar:

Sistemas administrativos

Backends para aplicaciones web y móviles

API REST profesionales

TP finales en universidades / institutos técnicos

Integraciones con React, Angular, Vue, Flutter, etc.

📁 Estructura del Proyecto
src/main/java/com/pagina/Proyecto/Final/
│
├── controller/
│   └── UsuarioController.java
│
├── service/
│   ├── UsuarioService.java
│   └── UsuarioServiceImpl.java
│
├── repository/
│   └── UsuarioRepository.java
│
├── mapper/
│   └── UsuarioMapper.java
│
├── dto/
│   └── UsuarioCrearRequest.java
│
├── entity/
│   └── Usuario.java
│
└── ProyectoFinalApplication.java

🛠️ Tecnologías Utilizadas
Tecnología	Descripción
Java 21	Lenguaje principal del proyecto
Spring Boot 4.0.0	Framework backend
Spring Web MVC	Controladores HTTP
Spring Data JPA	Persistencia
Hibernate	ORM
H2 Database	DB en memoria
Maven	Build & dependencias
Lombok	Constructor, getters/setters automáticos
⚙️ Configuración — application.properties
server.port=8081
spring.application.name=Proyecto-Final

# JPA
spring.jpa.hibernate.ddl-auto=update

# BASE DE DATOS H2
spring.datasource.url=jdbc:h2:mem:proyectofinaldb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# CONSOLA H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

🗄 H2 Console

Una vez ejecutado el proyecto, ingresá a:

👉 http://localhost:8081/h2-console

Configuración correcta:

Campo	Valor
JDBC URL	jdbc:h2:mem:proyectofinaldb
Username	sa
Password	(vacío)
▶️ Cómo Ejecutar el Proyecto
1️⃣ Requisitos previos

✔ Java 21
✔ IntelliJ IDEA
✔ Maven (incluido en IntelliJ)

2️⃣ Clonar el repositorio
git clone https://github.com/Franchesco85/Proyecto-Final_SpringBootv4.0.0.git
cd Proyecto-Final_SpringBootv4.0.0

3️⃣ Instalar dependencias
mvn clean install

4️⃣ Ejecutar la aplicación

Desde consola:

mvn spring-boot:run


O desde IntelliJ:

🟩 Run → ProyectoFinalApplication

🧪 Probar con Postman
Acción	Método	Endpoint
Listar usuarios	GET	/api/usuario
Buscar por ID	GET	/api/usuario/{id}
Crear usuario	POST	/api/usuario
Eliminar usuario	DELETE	/api/usuario/{id}
Ejemplo JSON para crear usuario
{
  "nombre": "Francisco",
  "apellido": "Pérez",
  "email": "fran@gmail.com"
}

🔚 Endpoints Implementados
📌 GET — Listar todos
GET /api/usuario

📌 POST — Crear
POST /api/usuario

📌 GET — Buscar por ID
GET /api/usuario/{id}

📌 DELETE — Eliminar por ID
DELETE /api/usuario/{id}

🧩 Screenshots (Opcional)

Puedes subir tus capturas en /assets y vincularlas así:

Vista en IntelliJ
![Proyecto en IntelliJ](assets/intellij.png)

Vista en H2 Console
![Consola H2](assets/h2console.png)

🛣️ Roadmap del Proyecto

 Agregar autenticación JWT

 Añadir Swagger para documentación automática

 Migrar H2 → MySQL / PostgreSQL

 Crear módulo Producto

 Implementar excepciones personalizadas

 Crear Frontend en React.js

 Dockerizar el proyecto

🧩 Scripts útiles de Maven
Acción	Comando
Limpiar proyecto	mvn clean
Compilar	mvn compile
Ejecutar	mvn spring-boot:run
Ejecutar tests	mvn test
📜 Licencia

Este proyecto está bajo licencia MIT.
Podés usarlo, mejorarlo y adaptarlo libremente.

🙋‍♂️ Autor
Francisco Pérez

Abogado – Programador
Desarrollador Web Full Stack
Especialista en React.js, Java, Spring Boot, SQL, PHP y Tecnología IT.

GitHub: https://github.com/Franchesco85
