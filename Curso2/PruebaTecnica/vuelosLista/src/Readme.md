Este sencillo programa tiene com función principal filtrar vuelos por fechas.

Esta compuesto por:
1. La clase Main. Tiene una lista de vuelos predefinidos, dos contantes para aplicar el filtro que se pueden modificar e incluso dejarlas nulas y una instancia de la clase encargada de aplicar el filtro
2. El directorio entities con la clase Vuelo, que es la que se encarga de construir cada vuelo, con sus métodos getters y setters
3. El directorio utils con una clase llamada FiltroVuelos que contiene una función que aplica diferentes filtros. Estos son:

- Si ambas fechas son nulas: nos devuelve todos los vuelos
- Si la fecha desde la que queremos aplicar el filtro es nula pero hay una fecha hasta como límite: nos devuelve todos los vuelos hasta la fecha límite fijada, incluida esa fecha 
- Si la fecha hasta la que queremos aplicar el filtro es nula pero hay una fecha desde la que queremos empezar a buscar: nos devuelve todos los vuelos desde la fecha en la que empieza el filtro hasta el final de los vuelos de la lista 
- Si ambas fechas (desde y hasta) tienen valor: existe un rango de fechas por lo que nos devuelve los vuelos de ese rango incluyendo los vuelos de la misma fecha fijada

Para utilizar el programa, desde la clase Main podemos modificar las fechas e incluso dejarlas nulas. Dependiendo de lo que establezcamos como fecha de inicio o de final para el filtro, el programa nos devolverá por consola los diferentes resultados.