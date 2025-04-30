package vehiculos;

import interfaces.Combustion;

public class Camioneta extends Vehiculo implements Combustion {

    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta() {
    }

    public Camioneta(int id, String placa, String marca, String modelo, int agno, double costo, int capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, agno, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("La camioneta está repostando hasta los " + capacidadTanque
                + " litros y consume " + consumoCombustible + "km/l.");
    }

    @Override
    public void calcularAntiguedad() {
        System.out.println("La antiguedad de esta camioneta es de: "+ (2025-super.getAgno())+ " años");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad del tanque: " + capacidadTanque + " litros");
        System.out.println("Consumo de combustible: " + consumoCombustible + " km/l");
    }
}
