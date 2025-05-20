package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelos {
    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos, LocalDate fechaDesde, LocalDate fechaHasta) {
        return vuelos.stream().filter(v -> {
                    // si ambas fechas son null, que devuelva to-do
                    if (fechaDesde == null && fechaHasta == null) return true;
                    // no hay fechaDesde pero sí fechaHasta. Es decir, mostrar to-dos los vuelos hasta fechaHasta
                    if (fechaDesde == null) return !v.getFechaInicio().isAfter(fechaHasta);
                    // no hay fechaHasta pero sí fechaDesde. Es decir, no hay límite de fechaHasta, así que muestra todos los vuelos desde la fechaDesde
                    if (fechaHasta == null) return !v.getFechaInicio().isBefore(fechaDesde);
                    // hay fechaDesde y fechaHasta, por lo tanto hay un rango de fechas, ambas incluidas
                    return (!v.getFechaInicio().isBefore(fechaDesde) && !v.getFechaInicio().isAfter(fechaHasta));
                })
                .sorted(Comparator.comparing(Vuelo::getFechaInicio)) // ordenamos por fecha de inicio
                .collect(Collectors.toList()); // lo pasamos a una lista
    }
}