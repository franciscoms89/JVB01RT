import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        verificarNumero(numero);
    }

    private static void verificarNumero(int numero){

        if (numero>0)
            System.out.println("El número es positivo");
        else if (numero<0)
            System.out.println("El número es negativo");
        else
            System.out.println("El número es 0");
    }
}
