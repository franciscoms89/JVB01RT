package ejericiosResueltos;

import java.util.Scanner;

public class Ejercicio4 {

    public void ejercicio4(){

        Scanner scannerNum1 = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        double num1 = scannerNum1.nextDouble();

        Scanner scannerNum2 = new Scanner(System.in);
        System.out.println("Introduce el segundo número");
        double num2 = scannerNum1.nextDouble();

        System.out.println("La suma de " + num1 + " y " + num2 + "es " + (num1+num2));
        System.out.println("La resta de " + num1 + " y " + num2 + "es " + (num1-num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + "es " + (num1*num2));
        System.out.println("La división de " + num1 + " y " + num2 + "es " + (num1/num2));

        // Extra

        System.out.println("Si el segundo valor de la división fuese 0, daría un error. Ya que un número dividido entre 0 es indefinido.");
        System.out.println("En este ejercicio podríamos crear un if para comprobar si se introduce un 0 en el segundo número y en ese caso, escribir un mensaje de que no es número válido.");

    }

}
