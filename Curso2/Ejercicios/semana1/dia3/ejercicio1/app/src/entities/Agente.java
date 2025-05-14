package entities;

import java.time.LocalTime;
import java.util.Random;

public class Agente extends Thread {
    private String nombre;

    public Agente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("El agente " + nombre + " está atendiendo la llamada " + i + " a las " + LocalTime.now());
            try {
                Thread.sleep(new Random().nextInt(2000, 7001));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}