public class Main {
    public static void main(String[] args) {

        // Punto a)

        int entero = 1;
        double decimal = 10.0;
        boolean logico = true;
        String frase = "Este es el segundo ejercicio, punto a:";

        System.out.println("El int tiene un valor de "+ entero
                + " y el double un valor de " + decimal
                + ". El valor de la variable booleana es " + logico
                + " y la frase contenida en el String es " + frase);

        // Punto b)

        /* int entero2 = 1.0;
        double decimal2 = "Hola";
        boolean logico2 = 4;
        String = true;
         */

        System.out.println("Al asignar valores que no corresponden con el tipo de dato, genera un error en el programa.");
        System.out.println("Como asignar un entero en un dato double (con decimales) o viceversa, o un String en un boolean. ");
        System.out.println("Esto es porque Java es un lenguaje fuertemente tipado.");

    }
}