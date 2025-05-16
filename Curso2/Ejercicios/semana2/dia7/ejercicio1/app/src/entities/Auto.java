package entities;

public class Auto {
    private String marca;
    private String modelo;
    private Integer agno;
    private Double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, Integer agno, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.agno = agno;
        this.precio = precio;
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

    public Integer getAgno() {
        return agno;
    }

    public void setAgno(Integer agno) {
        this.agno = agno;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha=" + agno +
                ", precio=" + precio +
                '}';
    }
}
