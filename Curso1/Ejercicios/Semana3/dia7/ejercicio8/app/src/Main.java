import vestimentas.*;

public class Main {
    public static void main(String[] args) {

        Vestimenta[] prendas = new Vestimenta[9];

        prendas[0] = new Zapato(1, "casual Oxford", 80.99, "Zara", "42", "negro", "cuero", "lazo");
        prendas[1] = new Zapato(2, "cowboy", 100.99, "H&N", "37", "marrón", "vaquero", "cordones");
        prendas[2] = new Zapato(3, "stiletto", 95.99, "Zara", "39", "negro", "poliester", "sin cierre");

        prendas[3] = new Pantalon(4, "Jeans Skinny", 39.99, "Levy's", "40", "azul oscuro", "Demin", "Vaquero");
        prendas[4] = new Pantalon(5, "Pantalón chino", 40.99, "Zara", "41", "negro", "Skinny", "algodón");
        prendas[5] = new Pantalon(6, "Chandal", 20.59, "Nike", "40", "verde", "Jogger", "fibra sintética");

        prendas[6] = new Camiseta(7, "camiseta manga corta", 10.99, "Adidas", "m", "blanca", "corta", "redondo");
        prendas[7] = new Camiseta(8, "camiseta manga larga", 12.99, "Nike", "s", "negra", "larga", "en V");

        prendas[8] = new Sombrero(9,"boina",10.90,"shein","l","gris","casual","grande");

        for(Vestimenta v: prendas){
            v.mostrarMensaje();
            System.out.println();
        }

    }
}
