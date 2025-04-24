public class Main {
    public static void main(String[] args) {
        Verdura[] verduras = new Verdura[5];

        verduras[0]= new Verdura(1,"Tomate","Rojo",40,false);
        verduras[1]= new Verdura(2,"Zanahoria","Naranja",30,false);
        verduras[2]= new Verdura(3,"Patata","Amarillo",50,true);
        verduras[3]= new Verdura(4,"Lechuga","Verde",10,false);
        verduras[4]= new Verdura(5,"Cebolla","Morada",15,true);

        for (Verdura v: verduras){
            System.out.println("La verdura: "+ v.getNombre() + " tiene: " + v.getCalorias() + " calorías");
        }

        verduras[2].setNombre("Pepino");
        verduras[2].setColor("Verde");
        verduras[2].setCalorias(15);
        verduras[2].setDebeCocinarse(true);
        verduras[4].setNombre("Cebolla dulce");
        verduras[4].setColor("Blanca");
        verduras[4].setCalorias(22);
        verduras[4].setDebeCocinarse(true);

        for (Verdura v : verduras) {
            System.out.println("id: " + v.getId());
            System.out.println("Nombre: " + v.getNombre());
            System.out.println("Color: " + v.getColor());
            System.out.println("Calorías: " + v.getCalorias());
            System.out.println("Debe cocinarse: " + v.isDebeCocinarse());
        }

        for (Verdura v: verduras){
            if(v.getColor().equalsIgnoreCase("Verde")){
                System.out.println("Estas verduras son verdes: " + v.getNombre());
            }else {
                System.out.println();
            }
        }
    }
}