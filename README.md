# 🌟 ForoHub - API REST para Foro de Discusión

Desafío del programa ONE Next Education X Alura construyendo una API REST para el control de un foro de discusión desde la perspectiva del Back-End. Construido en Java y Spring boot por Hiram Acevedo.

## 🚀 Características

- CRUD completo para tópicos (Crear, Leer, Actualizar, Eliminar)
- Autenticación y autorización con JWT
- Persistencia de datos con MySQL
- Migraciones de base de datos con Flyway

## 🛠️ Tecnologías Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Security
- JWT para autenticación
- MySQL
- Flyway para migraciones de BD
- Maven

## 📋 Requisitos Previos

- JDK 17 o superior
- Maven
- MySQL
- Insomnia (o cualquier cliente HTTP para pruebas de API)

## 🔧 Configuración

1. Clona el repositorio:
   ```
   git clone https://github.com/tu-usuario/ForoHub.git
   ```

2. Configura las variables de entorno en un archivo `.env` en la raíz del proyecto:
   ```
   DATABASE_URL=jdbc:mysql://localhost:3306/forohub
   DATABASE_USERNAME=tu_usuario
   DATABASE_PASSWORD=tu_contraseña
   JWT_SECRET=tu_secreto_jwt
   ```

3. Ejecuta las migraciones de la base de datos:
   ```
   mvn flyway:migrate
   ```

4. Compila y ejecuta el proyecto:
   ```
   mvn spring-boot:run
   ```

## 🚀 Uso

1. Inicia sesión:
    - Haz una solicitud POST a `http://localhost:8080/login` con el cuerpo:
      ```json
      {
        "login": "tu_usuario",
        "clave": "tu_contraseña"
      }
      ```
    - Guarda el token JWT de la respuesta.

2. Usa el token JWT en el encabezado `Authorization` para las siguientes solicitudes:
   ```
   Authorization: Bearer tu_token_jwt
   ```

3. Endpoints disponibles:
    - GET `/topicos`: Lista todos los tópicos
    - GET `/topicos/{id}`: Obtiene un tópico específico
    - POST `/topicos`: Crea un nuevo tópico
    - PUT `/topicos/{id}`: Actualiza un tópico existente
    - DELETE `/topicos/{id}`: Elimina un tópico

## 🗃️ Base de Datos

La aplicación utiliza MySQL. Asegúrate de tener una base de datos llamada `forohub` creada antes de ejecutar las migraciones.

Tabla principal:
```sql
CREATE TABLE topicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    status VARCHAR(20) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL
);
```

Tabla de usuarios (para autenticación):
```sql
CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(100) NOT NULL UNIQUE,
    clave VARCHAR(300) NOT NULL
);
```

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue primero para discutir lo que te gustaría cambiar.

## 📜 Licencia

[MIT](https://choosealicense.com/licenses/mit/)

---

Desarrollado con ❤️ por [Tu Nombre]