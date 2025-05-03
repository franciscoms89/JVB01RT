package utils;

import java.time.LocalDate;
import java.time.Period;

public class FechaUtil {
    public static int calcularDiferenciaDias(LocalDate fecha1, LocalDate fecha2) {
        Period periodo = Period.between(fecha1, fecha2);
        return periodo.getDays();
    }
}
