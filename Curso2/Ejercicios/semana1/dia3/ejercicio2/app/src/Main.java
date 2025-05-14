import entities.EstacionTrabajo;
import entities.Trabajador;

public class Main {
    public static void main(String[] args) {
        EstacionTrabajo estacionTrabajo = new EstacionTrabajo();
        //creamos varios hilos
        for (int i = 1; i <= 10; i++) {
            Thread persona = new Thread(new Trabajador("Trabajador " + i, estacionTrabajo));
            persona.start();
        }
    }
}