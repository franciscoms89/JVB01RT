package utils;
public class GestorVector {
    private final String[] vector = new String[5];
    public void almacenarDatosEnVector(int indice, String dato) {
        try {
            vector[indice] = dato;
            System.out.println("Se ha almacenado el dato { " + dato + " } correctamente en la posición: " + indice);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("El dato a introducir en la posición " + indice + " no puede estar almacenado en una posición que está fuera del vector");
        }
    }
    public void accederADatoEnIndiceIndicado(int indice) {
        try {
            String dato = vector[indice];
            System.out.println("El dato en la posición " + indice + " es: " + dato);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("El dato al que intentas acceder está fuera del vector");
        }
    }
}