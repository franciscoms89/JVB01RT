package entities;
import java.time.LocalDate;
public class Vuelo {
    private String destino;
    private LocalDate fechaVuelo;
    private int asientosDisponibles;
    public Vuelo() {
    }
    public Vuelo(String destino, LocalDate fechaVuelo, int asientosDisponibles) {
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.asientosDisponibles = asientosDisponibles;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public LocalDate getFechaVuelo() {
        return fechaVuelo;
    }
    public void setFechaVuelo(LocalDate fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }
    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }
    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
    @Override
    public String toString() {
        return "Vuelo{" +
                "destino='" + destino + '\'' +
                ", fechaVuelo=" + fechaVuelo +
                ", asientosDisponibles=" + asientosDisponibles +
                '}';
    }
    public void reservarAsientos(int asientos){
        this.asientosDisponibles =-asientos;
    }
}