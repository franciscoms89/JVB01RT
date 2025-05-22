package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelos {

    // creamos una función que permita filtrar vuelos, que recibirá 3 parámetros: un alista de vuelo y dos fechas para filtrar
    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, LocalDate fechaDesde, LocalDate fechaHasta) {
        return vuelos.stream().filter(v -> {
                    // Si ambas fechas son nulas, la función devolverá todos los vuelos, ya que no hay filtro
                    if (fechaDesde == null && fechaHasta == null) return true;

                    // La fecha desde la que queremos hacer el filtro es nula pero la fecha hasta tiene valor:
                    // nos devuelve todos los vuelos hasta la fecha hasta la que aplicamos el filtro
                    if (fechaDesde == null) return !v.getFechaInicio().isAfter(fechaHasta);

                    // La fecha hasta la que queremos filtrar es nula pero la fecha desde la que empieza el filtro tiene valor:
                    // nos devuelve los vuelos desde la que fecha desde la que aplicamos el filtro hasta el final de la lista de vuelos
                    if (fechaHasta == null) return !v.getFechaInicio().isBefore(fechaDesde);

                    // Ambas fechas, desde y hasta, tienen valor, por lo que el filtro devuelve los vuelos que hay en ese rango
                    return (!v.getFechaInicio().isBefore(fechaDesde) && !v.getFechaInicio().isAfter(fechaHasta));
                })
                .sorted(Comparator.comparing(Vuelo::getFechaInicio)) // Ordenamos por fecha de inicio
                .collect(Collectors.toList()); // Lo pasamos a una lista
    }
}