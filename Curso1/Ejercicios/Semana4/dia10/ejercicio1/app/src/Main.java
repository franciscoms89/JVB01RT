import utils.FechaUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate ida = LocalDate.of(2025, 4, 25);
        LocalDate vuelta = LocalDate.of(2025, 5, 2);
        int dias = FechaUtil.calcularDiferenciaDias(ida, vuelta);
        System.out.println("Días de diferencia: " + dias);

    }
}