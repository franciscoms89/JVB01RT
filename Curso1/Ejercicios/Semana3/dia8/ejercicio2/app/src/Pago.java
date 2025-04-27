public class Pago {

    private TipoPago tipoPago;

    public Pago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void mostrarTipoPago(){
        System.out.println("El tipo de pago es: " + this.tipoPago);
    }
}
