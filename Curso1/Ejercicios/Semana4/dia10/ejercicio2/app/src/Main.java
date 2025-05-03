import utils.Metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            metodo.imprimirMenu();

            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    metodo.mostrarMensaje();
                    break;
                case 2:
                    metodo.mostrarFechaActual();
                    break;
                case 3:
                    metodo.mostrarNumeroAleatorio();
                    break;
                case 4:
                    metodo.mostrarTablaDelCinco();
                    break;
                case 0:
                    System.out.println("Siendo del programa... Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo" + "\n");
            }
        } while (opcion < 0 || opcion > 4);

        input.close();
    }
}