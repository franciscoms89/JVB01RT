package vestimentas;

public class Sombrero extends Vestimenta {

    private String tipo;
    private String tamagno;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamagno) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamagno = tamagno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamagno() {
        return tamagno;
    }

    public void setTamagno(String tamagno) {
        this.tamagno = tamagno;
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Este sombrero es de tipo " + getTipo());
    }
}
