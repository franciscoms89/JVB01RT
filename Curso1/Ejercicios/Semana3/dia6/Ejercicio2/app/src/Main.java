public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona(1,"Fran", 35, "Madrid", 666555444);
        personas[1] = new Persona(2,"Ana", 30, "Barcelona", 666444333);
        personas[2] = new Persona(3,"Jose", 25, "Valencia", 666333222);
        personas[3] = new Persona(4,"Emma", 24, "Bilbao", 666222111);
        personas[4] = new Persona(5,"Dani", 31, "Santiago", 666111000);

        for (Persona p: personas){
            System.out.println("El nombre es: " + p.getNom() + " y la edad es: " + p.getEdad() + " años.");
        }

        System.out.println(personas[2].getNom());
        System.out.println(personas[4].getNom());

        personas[2].setNom("Antonio José");
        personas[4].setNom("Daniel Alfonso");

        System.out.println(personas[2].getNom());
        System.out.println(personas[4].getNom());

        for(Persona p : personas){
            if(p.getEdad()>30){
                System.out.println("Persona con más de 30 años: " + p);
            }else{
                System.out.println();
            }
        }
    }
}