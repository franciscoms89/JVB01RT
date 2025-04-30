package vehiculos;

import interfaces.Electrico;

public class Auto extends Vehiculo implements Electrico {

    private int capacidadBateria;
    private int autonomia;

    public Auto() {
    }

    public Auto(int id, String placa, String marca, String modelo, int agno, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, agno, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("El vehículo electrico está cargando su batería hasta los " + capacidadBateria
                + "mah y tendrá una autonomía de " + autonomia + "hs.");
    }

    @Override
    public void calcularAntiguedad() {
        System.out.println("La antiguedad de este coche es de: "+ (2025-super.getAgno()) + " años");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Capacidad de batería: " + capacidadBateria + " mAh");
        System.out.println("Autonomía: " + autonomia + " hs");
    }
}
