import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Punto a)

        System.out.println("Hola, bienvenido al sistema");

        // Punto b)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido al sistema");

    }
}