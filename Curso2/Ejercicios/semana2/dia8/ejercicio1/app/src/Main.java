import entities.Mascota;
import utils.RegistroMascotas;
public class Main {
    public static void main(String[] args) {
        RegistroMascotas registro = new RegistroMascotas();

        // Generamos mascotas
        for (int i = 0; i < 10; i++) {
            registro.generarMascota();
        }
        // Agregamos mascotas a la lista
        registro.agregarMascota(new Mascota<>("Pichín", 4, "Gato"));
        registro.agregarMascota(new Mascota<>("Mordisquitos", 7, "Reptil"));
        registro.agregarMascota(new Mascota<>("Piolín", 2, "Ave"));
        // Buscamos mascotas por nombre o Especie
        System.out.println("Mascotas con nombre Toby:" + registro.buscarPorNombre("Toby"));
        // Buscamos mascotas por especie
        System.out.println("Mascotas de especie Gato: " + registro.buscarPorEspecie("Gato"));
        // Contar el total de mascotas
        System.out.println("Número total de mascotas: " + registro.contarMascotas());

    }
}