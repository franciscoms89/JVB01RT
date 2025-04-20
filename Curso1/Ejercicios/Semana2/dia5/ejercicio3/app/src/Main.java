public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ana", "Luis"};
        mostrarNombres(nombres);
    }

    private static void mostrarNombres(String [] nombres){
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}