package ejericiosResueltos;

import java.util.Scanner;

public class Ejercicio3 {

    public void ejercicio3(){

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce la base");
        double base = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce la altura");
        double altura = scanner2.nextDouble();

        double formula = (base*altura)/2;

        System.out.println("El área del triángulo con las medidas que me has proporcionado es: "
        + formula);

    }
}
