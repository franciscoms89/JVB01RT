import entities.Tarea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Tarea> tareaList = new ArrayList<>();

        System.out.println("Gestor de Proyecto");
        int opcionElegida = 0;

        while (opcionElegida != 3) {
            System.out.println("""
            1. Agregar tarea principal
            2. Ver estructura del proyecto
            3. Salir""");
            System.out.print("Elige una opción: ");
            opcionElegida = scanner.nextInt();
            scanner.nextLine();

            switch (opcionElegida) {
                case 1:
                    System.out.print("Nombre de la tarea principal: ");
                    String nombreTarea = scanner.nextLine();
                    Tarea tareaPrincipal = new Tarea(nombreTarea);
                    addSubtareasRecursivas(tareaPrincipal);
                    tareaList.add(tareaPrincipal);
                    break;
                case 2:
                    System.out.println("\n Proyecto: Desarrollo de Software");
                    for (Tarea tarea : tareaList) {
                        System.out.println("|-- Tarea Principal: " + tarea.getNombre());
                        for (Tarea sub : tarea.getSubtareas()) {
                            sub.imprimirJerarquía("|   ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Gestión terminada.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    // Méto-do recursivo para agregar subtareas
    private static void addSubtareasRecursivas(Tarea tarea) {
        while (true) {
            System.out.print("¿Agregar subtarea a \"" + tarea.getNombre() + "\"? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("s")) break;

            System.out.print("Nombre de la subtarea: ");
            String subtareaNombre = scanner.nextLine();
            Tarea subtarea = new Tarea(subtareaNombre);
            tarea.addSubtarea(subtarea);

            addSubtareasRecursivas(subtarea);
        }
    }
}