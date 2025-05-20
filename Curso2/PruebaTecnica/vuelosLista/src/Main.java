import entities.Vuelo;
import utils.FiltroVuelos;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    // constantes
    public static final LocalDate INICIO = LocalDate.of(2025, Month.AUGUST, 1);
    public static final LocalDate FIN = LocalDate.of(2025, Month.AUGUST, 30);
    // estas constantes puede ser null

    public static void main(String[] args) {
        List<Vuelo> vuelos = List.of(
                new Vuelo(1, "IB1245", "Iberia", "Madrid", "Londres", LocalDate.of(2025, Month.JULY,1), LocalDate.of(2025, Month.JULY, 6)),
                new Vuelo(2, "IB1536", "Iberia", "Londres", "Roma", LocalDate.of(2025, Month.JULY,10), LocalDate.of(2025, Month.JULY, 15)),
                new Vuelo(3, "RY0123", "Ryanair", "Barcelona", "Roma", LocalDate.of(2025, Month.AUGUST,15), LocalDate.of(2025, Month.AUGUST, 20)),
                new Vuelo(4, "RY0824", "Ryanair", "Roma", "Madrid", LocalDate.of(2025, Month.AUGUST,25), LocalDate.of(2025, Month.AUGUST, 27)),
                new Vuelo(5, "LF1234", "Lufthansa", "Frankfurt", "Zurich", LocalDate.of(2025, Month.SEPTEMBER,12), LocalDate.of(2025, Month.SEPTEMBER, 18)),
                new Vuelo(6, "LF9853", "Lufthansa", "Zurich", "Londres", LocalDate.of(2025, Month.OCTOBER,15), LocalDate.of(2025, Month.OCTOBER, 30)),
                new Vuelo(7, "VU2214", "Vueling", "Madrid", "Atenas", LocalDate.of(2025, Month.OCTOBER,25), LocalDate.of(2025, Month.OCTOBER, 26)),
                new Vuelo(8, "VU1244", "Vueling", "Atenas", "Barcelona", LocalDate.of(2025, Month.NOVEMBER,5), LocalDate.of(2025, Month.NOVEMBER, 10)),
                new Vuelo(9, "EM1225", "Emirates", "Madrid", "Sofia", LocalDate.of(2025, Month.NOVEMBER,20), LocalDate.of(2025, Month.NOVEMBER, 26)),
                new Vuelo(10, "EM1540", "Emirates", "Frankfurt", "Moscu", LocalDate.of(2025, Month.DECEMBER,15), LocalDate.of(2025, Month.DECEMBER, 19))
        );
        List<Vuelo> vuelosFiltrados = FiltroVuelos.filtrarVuelos(vuelos, INICIO, FIN);
        vuelosFiltrados.forEach(System.out::println);
    }
}