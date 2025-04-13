package ejericiosResueltos;

import java.util.Scanner;

public class Ejercicio1 {

    public void ejercicio1(){

        // Punto a)

        System.out.println("Hola, bienvenido al sistema");

        // Punto b)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido al sistema");

    }

}
