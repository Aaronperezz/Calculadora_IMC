# Proyecto Java con Spring Boot y Maven

Este proyecto fue creado para practicar el desarrollo backend en Java utilizando **Spring Boot** y **Maven** como herramienta de gestión de dependencias. Más adelante, se añadirá **Bootstrap** para los estilos en el frontend.

---

## Tecnologías utilizadas

- **Java** (versión 24 en mi caso)
- **Spring Boot**
- **Maven**
- **Bootstrap** (próximamente)

---

## Instalación inicial

1. **Instalación de Maven**  
   Descargué Maven desde la página oficial:  
   [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)  
   Luego lo configuré en las variables de entorno para poder usar el comando `mvn` desde la terminal.

2. **Creación del proyecto**  
   Generé la estructura básica de un proyecto Spring Boot desde la web oficial:

   - start.spring.io

   # Estructura del proyecto

src/
├── main/
│ ├── java/com/miapp
│ │ ├── Application.java # Clase principal
│ │ ├── controllers/ # Controladores REST
│ │ ├── models/ # Clases de modelo/datos
│ │ ├── services/ # Lógica de negocio
│ └── resources/
│ ├── application.properties # Configuración del proyecto
│ ├── static/ # Archivos estáticos (CSS, JS, imágenes)
│ └── templates/ # Vistas HTML (si se usa Thymeleaf)
└── test/ # Pruebas unitarias

# Ejecucion del proyecto mediante el terminal

- mvn spring-boot:run

# Próximos pasos

- Añadir Bootstrap para mejorar la parte visual.

- Implementar más controladores y rutas.

- Conectar con base de datos.
