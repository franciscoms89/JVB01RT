public class Main {
    public static void main(String[] args) {

        System.out.println(concatenarCadenas("HOLA","mundo"));
    }

    private static String concatenarCadenas(String cadenaMayusculas, String cadenaMinusculas){

        return cadenaMinusculas + " " + cadenaMayusculas;

    }
}