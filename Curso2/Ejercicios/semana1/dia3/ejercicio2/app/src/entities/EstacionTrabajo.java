package entities;

import java.time.LocalTime;

public class EstacionTrabajo {
    public void ensamblar(String nombre){
        System.out.println("El trabajador: " + nombre + " está en la estación de ensamblado a las " + LocalTime.now());
    }
    public void controlCalidad(String nombre){
        System.out.println("El trabajador: " + nombre + " está llevando a cabo labores de control de calidad" + LocalTime.now());
    }
    public void embalar(String nombre){
        System.out.println("El trabajador " + nombre + " está embalando el producto" + LocalTime.now());
    }
}
