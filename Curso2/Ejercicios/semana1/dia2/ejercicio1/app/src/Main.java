import utils.GestorVector;
public class Main {
    public static void main(String[] args) {
        GestorVector vector = new GestorVector();
        // llamamos al méto-do de almacenar datos
        vector.almacenarDatosEnVector(0, "Hola");
        vector.almacenarDatosEnVector(1, "Adiós");
        vector.almacenarDatosEnVector(2, "Qué tal?");
        vector.almacenarDatosEnVector(3, "Bien");
        vector.almacenarDatosEnVector(5, "Y tú?"); // lanza error
        // llamamos al méto-do de acceder a datos
        vector.accederADatoEnIndiceIndicado(2);
        vector.accederADatoEnIndiceIndicado(7); //lanza error
    }
}