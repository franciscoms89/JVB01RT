package entities;

import java.time.LocalDate;

public class Evento {
    // atributos
    private String nombre;
    private LocalDate fecha;
    private Categorias categoria;
    // constructores
    public Evento() {
    }
    public Evento(String nombre, LocalDate fecha, Categorias categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }
    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", categoria=" + categoria +
                '}';
    }
}