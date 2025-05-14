package entities;

import java.util.Random;

public class Trabajador extends Thread{
    private String nombre;
    private EstacionTrabajo estacion;

    public Trabajador(String nombre, EstacionTrabajo estacion) {
        this.nombre = nombre;
        this.estacion = estacion;
    }

    @Override
    public void run() {
        estacion.ensamblar(nombre);
        try {
            Thread.sleep(new Random().nextInt(2000,6000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        estacion.controlCalidad(nombre);
        try {
            Thread.sleep(new Random().nextInt(1000, 7000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        estacion.embalar(nombre);
        try {
            Thread.sleep(new Random().nextInt(2000,5000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}