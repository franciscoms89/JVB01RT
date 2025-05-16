import entities.Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static utils.InventarioAutos.*;

public class Main {
    public static void main(String[] args) {
        List<Auto> inventario = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // agregar autos
        agregar(inventario, new Auto("Peugeot", "306", 2020, 25000.00));
        agregar(inventario, new Auto("Nissan", "Z4", 2022, 26000.00));
        agregar(inventario, new Auto("Dacia", "N546", 2018, 20000.00));
        agregar(inventario, new Auto("Audi", "A4", 2024, 35000.00));
        agregar(inventario, new Auto("Peugeot", "206", 2020, 20000.00));
        agregar(inventario, new Auto("Peugeot", "106", 2017, 17000.00));
        // filtro por Marca
        System.out.println("Introduce una marca a buscar:");
        String marcaBuscada = scanner.nextLine();
        List<Auto> peugeot = buscarPor(inventario, a -> a.getMarca().equalsIgnoreCase(marcaBuscada));
        System.out.println("Los autos de la marca " + marcaBuscada + " son: " + peugeot.stream().toList());
        // filtro por año
        System.out.println("Introduce un año de búsqueda:");
        int agnoBuscado = scanner.nextInt();
        List<Auto> agno2020 = buscarPor(inventario, a-> a.getAgno() == agnoBuscado);
        System.out.println("Los autos del año " + agnoBuscado + " son: " + agno2020.stream().toList());
        // filtro por precio
        System.out.println("Introduce un precio a buscar");
        double precioBuscado = scanner.nextDouble();
        List<Auto> precio = buscarPor(inventario, a-> a.getPrecio() == precioBuscado);
        System.out.println("Los autos con un precio de: " + precioBuscado + " son: " + precio.stream().toList());
        scanner.close();
    }
}