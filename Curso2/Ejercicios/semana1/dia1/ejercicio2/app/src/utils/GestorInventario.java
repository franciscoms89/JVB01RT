package utils;
import entities.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestorInventario{
    List<Producto> productosList = new ArrayList<>();
    // METODO para agregar productos al inventario y valida las opciones
    public void agregarProductos(String nombre, double precio, int cantidad) throws RuntimeException {
        if (nombre == null || nombre.isEmpty()){
            throw new NullPointerException("Este campo no puede estar vació");
        }
        if(precio<=0){
            throw new IllegalArgumentException("El precio no puede ser 0 o menor");
        }
        if(cantidad<=0){
            throw new IllegalArgumentException("La cantidad tiene que ser al menos 1");
        }
        // Si to-do es correcto
        Producto nuevoProducto =new Producto(nombre,precio,cantidad);
        productosList.add(nuevoProducto);
        System.out.println("El producto " + nuevoProducto.getNombre() + " ha sido añadido con éxito. Se han añadido "+
                nuevoProducto.getCantidad() + " unidades a un precio unitario de " + nuevoProducto.getPrecio() + "€.");
    }
}