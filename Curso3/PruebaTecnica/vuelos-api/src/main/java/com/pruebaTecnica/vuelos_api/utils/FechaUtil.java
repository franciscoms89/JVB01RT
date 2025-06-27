package com.pruebaTecnica.vuelos_api.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FechaUtil {

    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static String formatearFecha(String fechaAFormatear) {
        try {
            LocalDate fecha = LocalDate.parse(fechaAFormatear);
            return fecha.format(FORMATO_FECHA);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}