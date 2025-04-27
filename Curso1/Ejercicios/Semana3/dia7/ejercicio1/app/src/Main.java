import java.util.jar.Manifest;

public class Main {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Ave a1 = new Ave();

        m1.saludar();
        r1.saludar();
        a1.saludar();

        Animal animal = new Mamifero();
        // se aplica la propiedad de la herencia por lo que es posible hacer esto ya que un mamífero es un animal,
        // es decir, mamífero es una clase hija de animal, que es la clase padre

        // si modificamos el acceso de public a private, el méto-do main no tiene acceso al méto-do al que hemos camiado el acceso

    }
}