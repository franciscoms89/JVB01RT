package entities;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    // atributos
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    // constructor
    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    // getters y setters
    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    // toString
    @Override
    public String toString() {
        return "Directorio{" +
                "archivos=" + archivos +
                ", nombre='" + nombre + '\'' +
                ", subdirectorios=" + subdirectorios +
                '}';
    }

    // Agregar subdirectorio
    public void addSubdirectory(Directorio subdirectorio) {
        subdirectorios.add(subdirectorio);
    }

    // Agregar archivos
    public void addFile(String archivo) {
        archivos.add(archivo);
    }
}
