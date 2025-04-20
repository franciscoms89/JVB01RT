import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio;
        double acumulado=0.0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce el precio del producto (pulse 0 para finalizar)");
            precio = scanner.nextDouble();
            acumulado += precio;

        }while (precio != 0);
            System.out.println("El inporte final asciende a " + acumulado + "€");

    }
}