import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int edad;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad");
        edad = scanner.nextInt();

        if(edad<18)
            System.out.println("Este evento sólo es para mayores de 18 años. No puedes entrar");
        else
            System.out.println("Puedes entrar. Disfruta del recital");
        }

}