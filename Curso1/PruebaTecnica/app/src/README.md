Este proyecto es una aplicación de consola de Java que permite la gestión de clientes y realizar operaciones CRUD sobre estos (crear, listar, actualizar y borrar clientes en una base de datos).

El proyecto está dividido en varias capas:
1. Main: es la clase principal que ejecuta el programa y por donde empieza este
2. controllers: en este directorio existen 2 clases: una que contiene un CRUD (llamada CustomerController) y otra que tiene métodos "menores" (aquellos que son ejecutados en la consola y que son los visibles para el usuario)
3. entities: contiene la clase Cliente, que es la que tiene los atributos, contrusctores y métodos de nuestra entidad Cliente
4. persitence: consta de dos clases que nos permiten conectarnos a la base de datos y y gestionar operaciones sobre nuestra entidad Cliente

Una vez pulsado RUN, el programa te permitirá elegir entre varias opciones para realizar operaciones, que son:
1. Crear un cliente: te pedirá que insertes los datos necesarios, no pudiendo ser ninguno de ellos nulo. El programa te avisará si intentas dejar algún valor nulo y no te dejará continuar hasta introducir algún dato
2. Listar clientes: te facilitará un listado de los clientes de la base de datos
3. Actualizar datos del cliente: te preguntará qué cliente (por id) quieres modificar y acto seguido aparecerá un menú a elegir con el dato a cambiar. Este menú seguirá preguntando hasta que selecciones la opción salir. Al igual que la opción crear, no permite insertar datos vacíos
4. Eliminar un cliente: preguntará qué cliente (por id) quieres eliminar. Si no existe, el programa te lo dirá. En caso contrario, lo elimina
5. Buscar un cliente por ciudad: preguntará la ciudad por la que quieres buscar a los clientes. Si no existe ningún cliente nos avisará. En caso contrario, nos mostrará el listado de clientes de esa ciudad.
0. Salir: saldrá del programa

Cualquier otra opción nos avisará de que no es válida.

Algunos supuestos son:
1. Todos los campos a rellenar del cliente son obligatorios
2. El género se ingresa como M (masculino) o F (femenino)
3. No existe interfaz gráfica, es todo a través de la consola
