package com.pruebaTecnica.vuelos_api.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FechaUtil {

    private static final DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static String formatearFecha(String fechaAFormatear){
        try {
            LocalDate fecha = LocalDate.parse(fechaAFormatear);
            return fecha.format(fechaFormateada);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}
