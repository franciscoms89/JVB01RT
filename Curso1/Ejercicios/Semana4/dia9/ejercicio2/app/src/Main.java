import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creamos el ArrayList de productos
        ArrayList < Producto> productos = new ArrayList<>();

        // Creamos los productos y los añadimos al ArrayList
        Producto p1 = new Producto(1, "Nokia 360", "Nokia", "smarthpone", 150.00, 200.00, 100);
        Producto p2 = new Producto(2, "LG TX-456", "LG", "TV", 450.00, 700.00, 50);
        Producto p3 = new Producto(3, "TWL 80", "TWL", "auriculares", 10.00, 20.00, 200);
        Producto p4 = new Producto(4, "HP OMEN 1236-Ti", "HP", "ordenador portatil", 950.00, 1200.00, 5);
        Producto p5 = new Producto(5, "Apple 1235", "Apple", "ordenador portatil", 890.00, 1450.00, 10);
        Producto p6 = new Producto(6, "Xiaomi 12 Pro", "Xiaomi", "smarthpone", 510.00, 800.00, 30);
        Producto p7 = new Producto(7, "Sony Xperia Z", "Sony", "smarthpone", 550.00, 750.00, 26);
        Producto p8 = new Producto(8, "Sony LCD 1258", "Sony", "TV", 500.00, 900.00, 3);
        Producto p9 = new Producto(9, "Beats ", "Beats", "auriculares", 100.00, 225.00, 17);
        Producto p10 = new Producto(10, "XBOX 360", "Microsoft", "videoconsola", 410.00, 550.00, 35);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);

        // Creamos una variable que almacene e producto más caro cuando creemos el bucle for para recorrer el ArrayList
        // Utilizando prodctos.get(0) accedemos al primer valor, que en el for almacenará el mayor valor que encuente
        // dentro del blucle for, creamos un if qué determine si el precio de venta es el más caro y lo iguale a la variable Producto del bucle for

        Producto masCaro = productos.get(0);

        for (Producto p: productos){
            if(p.getPrecioVenta()> masCaro.getPrecioVenta()){
                masCaro=p;
            }
        }

        System.out.println("El precio de venta más caro de todos los productos es "+ masCaro.getPrecioVenta() + "€, que corresponde al producto: " + masCaro.getNombre());

        // Hacemos algo similiar para el precio de coste

        Producto menorCoste = productos.get(0);

        for (Producto p: productos){
            if(p.getPrecioCoste()< menorCoste.getPrecioCoste()){
                menorCoste=p;
            }
        }

        System.out.println("El menor precio de coste de todos los productos es de "+ menorCoste.getPrecioCoste() + "€, que corresponde al producto: " + menorCoste.getNombre());

        // Eliminamos el elemento de la posición 5 del array

        if(productos.size()>5){
            Producto productoEliminado = productos.remove(5);
            System.out.println("Se ha eliminado el elemento de la posición 5");
        }else{
            System.out.println("No existe ningún producto en la posición 5");
        }

        // Calculamos el que tiene mayor stock y le descontamos 3 unidades
        Producto mayorStock = productos.get(0);

        for (Producto p: productos){
            if(p.getStock()> mayorStock.getStock()){
                mayorStock=p;
            }
        }

        int maxStock = Integer.MIN_VALUE;
        Producto productoMaxStock = null;
        for (Producto p: productos){
            if(p.getStock() > maxStock){
                maxStock = p.getStock();
                productoMaxStock = p;
            }
        }
        if (productoMaxStock != null){
            productoMaxStock.setStock(maxStock - 3);
            System.out.println("El producto con más stock es " + productoMaxStock.getNombre());
            System.out.println("Nueva cantidad en stock: " + productoMaxStock.getStock());
        }else{
            System.out.println("No hay productos en el inventario");
        }

    }
}