package exceptions;
public class ReservaInvalidaException extends Exception {
    public ReservaInvalidaException(String mensaje){
        super(mensaje);
    }
}