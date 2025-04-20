import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [][] teatro = new String[5][5];
        int fila, asiento;
        String confirmacion;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                teatro[i][j]="o";
            }
            System.out.println();
        }

        System.out.println("Bienvenido al selector de asientos del teatro");
        mostrarTeatro(teatro);

        do {


            System.out.println();
            System.out.println("Introduzca la fila en la que desea sentarse (1-5)");
            fila = scanner.nextInt()-1;
            System.out.println("Introduza el asiento en el que desea sentarse (1-5)");
            asiento = scanner.nextInt()-1;

            if(teatro[fila][asiento].equalsIgnoreCase("x")){
                System.out.println("Asiento ocupado. Elija otro asiento");
                System.out.println();}
            else
                teatro[fila][asiento]="x";

            mostrarTeatro(teatro);
            System.out.println();
            System.out.println("Si desea reservar otro asiento pulse 's' (Sí)");
            confirmacion = scanner.next();

        }while(confirmacion.equalsIgnoreCase("s"));
        System.out.println("Dsifrute de la obra");

    }

    private static void mostrarTeatro(String[][] asientos){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(asientos[i][j]);
            }
            System.out.println();
        }

    }
}