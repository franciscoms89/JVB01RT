package entities;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
    // Atributos
    private String nombre;
    private List<Tarea> subtareas;

    // Constructor
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    // toString
    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", subtareas=" + subtareas +
                '}';
    }

    // meto-do agregar subtarea
    public void addSubtarea(Tarea tarea){
        subtareas.add(tarea);
    }

    //-------------------------------------------------

    // Méto-do recursivo para imprimir la jerarquía
    public void imprimirJerarquía(String indentacion) {
        System.out.println(indentacion + nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.imprimirJerarquía(indentacion + "|   ");
        }
    }
}