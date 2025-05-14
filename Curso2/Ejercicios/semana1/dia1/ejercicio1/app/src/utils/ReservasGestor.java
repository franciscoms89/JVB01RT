package utils;
import entities.Vuelo;
import exceptions.ReservaInvalidaException;
public class ReservasGestor {
    public void reservar(String nombre, Vuelo vuelo, int asientos) throws ReservaInvalidaException {
        // Supuestos que hacen que lancen la excepción
        if (nombre == null || nombre.isEmpty())
            throw new ReservaInvalidaException("El nombre es obligatorio");
        if (vuelo.getFechaVuelo() == null || vuelo.getDestino() == null || vuelo.getDestino().isEmpty())
            throw new ReservaInvalidaException("No existe vuelo");
        if (asientos <= 0)
            throw new ReservaInvalidaException("Debes elegir al menos 1 asiento");
        if (asientos > vuelo.getAsientosDisponibles())
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles");
        //Si la reserva es correcta
        vuelo.reservarAsientos(asientos);
        System.out.println("La reserva se ha realizado correctamente. Aquí tienes los datos de tu vuelo" + "\n"
                + "Nombre: " + nombre + "\n"
                + "Destino: " + vuelo.getDestino() + "\n"
                + "Fecha de vuelo: " + vuelo.getFechaVuelo() + "\n"
                + "Asientos reservados: " +asientos);
    }
}