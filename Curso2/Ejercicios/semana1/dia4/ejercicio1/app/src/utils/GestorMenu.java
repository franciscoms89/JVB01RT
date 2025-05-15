package utils;

import entities.Empleado;

import java.util.Scanner;

public class GestorMenu {
    public void mostrarMenu() {
        String nombre;
        double salario;
        double salarioMinimo;
        final Scanner scanner = new Scanner(System.in);
        int opcionElegida=0;
        GestorEmpleados gestorEmpleados = new GestorEmpleados();
        do {
            System.out.println("Bienvenido al gestor de empleados. Por favor, elija una de las siguientes opciones");
            System.out.println("""
                    1. Agregar un nuevo empleado
                    2. Revisar si los salarios cumplen con el SMI
                    3. Listar todos los empleados
                    0. Salir
                    """);
            try {
                opcionElegida = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.err.println("Debes elegir una opción válida del 0 al 3. Solo se admiten números");
                scanner.next();
                continue;
            }

            switch (opcionElegida) {
                case 1:
                    try {
                        System.out.println("Introduzca el nombre del empleado");
                        nombre = scanner.nextLine();
                        try {
                            System.out.println("Introduce el salario");
                            salario = scanner.nextDouble();
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Salario no válido. Por favor, introduzca una cantidad");
                        }
                        Empleado nuevoEmpleado = new Empleado(nombre, salario);
                        gestorEmpleados.agnadirEmpleados(nuevoEmpleado);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error gestionado: " + e.getMessage());
                    } catch (Exception e) {
                        System.err.println("Error interno: " + e.getMessage());
                    } finally {
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Introduzca el salario del empleado: ");
                        salarioMinimo = scanner.nextDouble();
                        gestorEmpleados.salarioMinimo(salarioMinimo);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error gestionado: " + e.getMessage());
                    } catch (Exception e) {
                        System.err.println("Error interno: " + e.getMessage());
                    } finally {
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    gestorEmpleados.listarEmpleados();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Operación no valida. Inténtelo de nuevo" + "\n");
            }

        }while (opcionElegida!=0);
        scanner.close();
    }
}
