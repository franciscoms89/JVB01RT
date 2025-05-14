import entities.Vuelo;
import exceptions.ReservaInvalidaException;
import utils.ReservasGestor;
import java.time.LocalDate;
import java.time.Month;
public class Main {
    public static void main(String[] args) {
        // creamos un vuelo
        Vuelo nuevoVuelo = new Vuelo("Barcelona", LocalDate.of(2025, Month.AUGUST,15), 25);
        // llamamos al gestor de reservas
        ReservasGestor nuevaReserva = new ReservasGestor();
        // llamamos al méto-do reservar
        try{
            nuevaReserva.reservar("Fran", nuevoVuelo,5);
        }catch (ReservaInvalidaException e){
            System.err.println("Error en su reserva: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error en el sistema de reservas " + e.getMessage());
        }
    }
}