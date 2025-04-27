public class Persona {

    private String nombre;
    private Direccion direccion;

    public class Direccion{

        private String calle;
        private String ciudad;

        public Direccion(String calle, String ciudad) {
            this.calle = calle;
            this.ciudad = ciudad;
        }
    }

    public Persona(String nombre, String ciudad, String calle) {
        this.nombre = nombre;
        this.direccion = new Direccion(calle, ciudad);
    }

    public void mostrarDireccion() {
        System.out.println(this.nombre + " vive en "+ this.direccion.calle +" y "+ this.direccion.ciudad);
    }
}
