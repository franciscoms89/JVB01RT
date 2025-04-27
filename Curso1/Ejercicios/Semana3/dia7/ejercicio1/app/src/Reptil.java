public class Reptil  extends Animal{

    private int longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Reptil() {
    }

    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy un reptil");
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "longitud=" + longitud +
                ", tipoEscamas='" + tipoEscamas + '\'' +
                ", tipoVeneno='" + tipoVeneno + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
