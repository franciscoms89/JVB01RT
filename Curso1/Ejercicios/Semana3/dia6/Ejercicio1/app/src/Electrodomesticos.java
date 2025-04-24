public class Electrodomesticos {

    private int cod, consumo;
    private String marca, modelo, color;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int cod, String marca, String modelo, int consumo, String color) {
        this.cod = cod;
        this.consumo = consumo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomesticos {" +
                "cod =" + cod +
                ", consumo =" + consumo +
                ", marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", color ='" + color + '\'' +
                '}';
    }
}
