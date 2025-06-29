package com.pruebaTecnica.vuelos_api.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FechaUtil {

    public static long calcularDuracionDias(LocalDate fechaSalida, LocalDate fechaLlegada){
        return ChronoUnit.DAYS.between(fechaSalida, fechaLlegada);
    }
}