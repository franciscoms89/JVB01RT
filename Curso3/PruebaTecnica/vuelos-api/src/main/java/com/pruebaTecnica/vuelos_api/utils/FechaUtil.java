package com.pruebaTecnica.vuelos_api.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FechaUtil {

    // Función para calcular los días entre la fecha de salida y de llegada de un vuelo
    public static long calcularDuracionDias(LocalDate fechaSalida, LocalDate fechaLlegada){
        return ChronoUnit.DAYS.between(fechaSalida, fechaLlegada);
    }
}