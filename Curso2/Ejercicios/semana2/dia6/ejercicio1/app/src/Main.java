import entities.Categorias;
import entities.Evento;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventoList = List.of(
                new Evento("Evento1", LocalDate.of(2025, Month.OCTOBER, 12), Categorias.REUNION),
                new Evento("Evento2", LocalDate.of(2026, Month.JUNE, 1), Categorias.CONFERENCIA),
                new Evento("Evento3", LocalDate.of(2025, Month.JULY, 25), Categorias.REUNION),
                new Evento("Evento4", LocalDate.of(2026, Month.JULY, 30), Categorias.TALLER),
                new Evento("Evento5", LocalDate.of(2026, Month.OCTOBER, 24), Categorias.TALLER)
                );
        // Filtrar eventos por fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2025, Month.OCTOBER, 12);
        List<Evento> filtroEvento = eventoList.stream()
                .filter(e -> e.getFecha().equals(fechaEspecifica))
                .toList();
        System.out.println("Los eventos programados para la fecha " + fechaEspecifica + " son: ");
        filtroEvento.forEach(System.out::println);
        System.out.println();
        // Agrupar eventos por categoría y contar
        Map<Categorias, Long> contarEventos = eventoList.stream()
                .collect(Collectors.groupingBy(
                        Evento::getCategoria,
                        Collectors.counting()));
        System.out.println("La cantidad de eventos por categoría es:");
        contarEventos.forEach((categorias, cantidad) -> System.out.println(categorias + ": " + cantidad));
        System.out.println();
        // Encuentra el evento más cercano
        LocalDate hoy = LocalDate.now();
        Optional<Evento> masCercano = eventoList.stream()
                .filter(e -> !e.getFecha().isBefore(hoy))
                .min(Comparator.comparing(Evento::getFecha));
        System.out.println("El evento más próximo es: ");
        masCercano.ifPresentOrElse(System.out::println,()-> System.out.println("No hay eventos"));
    }
}