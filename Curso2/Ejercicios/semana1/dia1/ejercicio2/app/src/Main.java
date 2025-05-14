import utils.GestorInventario;
public class Main {
    public static void main(String[] args) throws Exception {
        GestorInventario imventario = new GestorInventario();
        try {
            imventario.agregarProductos("Leche", 1.80, 5);
        } catch (RuntimeException e) {
            System.err.println("Error al agregar el producto: " + e.getMessage());
        }
    }
}