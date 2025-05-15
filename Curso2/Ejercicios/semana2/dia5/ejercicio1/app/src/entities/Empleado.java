package entities;

public class Empleado {
    // atributos
    private String nombre;
    private double salario;
    private Categorias categoria;
    // contructores
    public Empleado() {
    }
    public Empleado(String nombre, double salario, Categorias categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Categorias getCategoria() {
        return categoria;
    }
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    // toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria=" + categoria +
                '}';
    }
}