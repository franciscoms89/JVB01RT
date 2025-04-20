import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double [] temp = new double[7];
        String []dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        double media =0.0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduce la temperatura máxima del "+dias[i]);
            temp[i]=scanner.nextDouble();
        }

        for (int i = 0; i < temp.length; i++) {
            media +=temp[i];
        }

        media /=7;
        System.out.println("La temperatura media de la semana ha sido "+media +"ºC");

    }
}