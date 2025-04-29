import java.util.Scanner;

public class Piramide {

    public void generarPiramide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al generador de pirámides, ¿cuántas alturas quieres que tenga?");
        int altura = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < altura; i++) {
            for (int k =0; k < i+1; k++) {
                System.out.print(k+1);
            }
            System.out.println();
        }
    }
}
