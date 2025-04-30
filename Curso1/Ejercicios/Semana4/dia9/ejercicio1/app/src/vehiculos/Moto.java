package vehiculos;

import interfaces.Combustion;

public class Moto extends Vehiculo implements Combustion {

    private int cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(int id, String placa, String marca, String modelo, int agno, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, agno, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("La moto de " + cilindrada + "cc está repostando su motor " + tipoMotor +
                " en la gasolinera.");
    }

    @Override
    public void calcularAntiguedad() {
        System.out.println("La antiguedad de esta moto es de: "+ (2025-super.getAgno())+ " años");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo de motor: " + tipoMotor);
    }
}
