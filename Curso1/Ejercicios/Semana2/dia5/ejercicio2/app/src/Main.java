import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para verificar si es par o no");
        int numero = scanner.nextInt();
        System.out.println(esPar(numero));

    }
    private static String esPar(int numero){
        return (numero % 2 == 0) ? "El número es par" : "El número es impar";

    }
}