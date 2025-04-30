import interfaces.Combustion;
import interfaces.Electrico;
import vehiculos.Auto;
import vehiculos.Camioneta;
import vehiculos.Moto;
import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto coche1 = new Auto(1, "MSS1234","Peugeot","207",2022,18000.99,100,300);
        Auto coche2 = new Auto(2, "LFD4523","Audi","A4",2019,21500.99,90,250);

        Camioneta camion1 = new Camioneta(3, "DDD0231", "Mercedes", "Long21", 2016, 32000, 1000, 20);

        Moto moto1 = new Moto(4, "LDS5468", "Vespa", "F32", 2015, 6000.45, 75,"2T");
        Moto moto2 = new Moto(5, "NFS1254", "Kawasaki", "Z125", 2024, 4574.99,125,"4T");

        ArrayList <Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(camion1);
        vehiculos.add(moto1);
        vehiculos.add(moto2);

        for (Vehiculo v : vehiculos){
            System.out.print(v.getId() + " -> " + v.getMarca() + " - " + v.getModelo());
            System.out.print(". ");
            v.calcularAntiguedad();

            if(v instanceof Electrico)
                ((Electrico) v).cargarEnergia();
            else if (v instanceof Combustion)
                ((Combustion) v).recargarCombustible();
        }


    }
}