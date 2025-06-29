API Gestión de Vuelos

Este proyecto es una API REST desarrollada con Spring Boot y JAVA 17 que permite gestionar un listado de vuelos. Incluye funcionalidades como filtrado, creación, modificación, actualización y eliminación de vuelos, todo en memoria (sin base de datos).

Para ejecutar esta API mecesitas: 
- Algún entorno de desarrollo integrado. Ej: IntellijIDEA, Eclipse, NetBeans.
- Postman, para enviar solicitudes HTTP

La estructura del proyecto es:

src/
- controllers/        contiene los ENDPOINTS
- dtos/               contiene los DTOs
- models/             contiene los modelos o entidades
- services/           encapsula la lógica del CRUD y los filtros
- utils/              contiene la clase que ayuda con el manejo de fechas

Una vez inicializado el programa en algún entorno de desarrollo, hay que abrir postman e importar el archivo JSON "Vuelo API.postman_collection" que se encuentra en el directorio principal y que ya tiene las request (GET, POST, PUT, PATCH y DELETE) preparadas para su uso.

Notas:
- Los datos se almacenan en memoria, por lo que se pierden al reiniciar la aplicación.
- Incluye validaciones básicas como fechas coherentes (la salida no puede ser posterior a la llegada).
- Se usa DTO para exponer solo los datos necesarios y calcular duración del vuelo.