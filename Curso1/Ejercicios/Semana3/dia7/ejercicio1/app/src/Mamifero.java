public class Mamifero extends Animal{

    private int numPatas;
    private String reproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numPatas, String reproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numPatas = numPatas;
        this.reproduccion = reproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy un mamífero");
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "numPatas=" + numPatas +
                ", reproduccion='" + reproduccion + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
