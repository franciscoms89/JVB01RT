public class Main {
    public static void main(String[] args) {
        Electrodomesticos vehículo1 = new Electrodomesticos(1, "Mercedes", "Benz", 120, "Plateado");
        Electrodomesticos vehículo2 = new Electrodomesticos(2, "Peugeot", "207", 130, "Amarillo");
        Electrodomesticos vehículo3 = new Electrodomesticos(3, "Kia", "Sorento", 125, "Verde");
        Electrodomesticos vehículo4 = new Electrodomesticos();


        System.out.println("La marca del vehículo 1 es: "+ vehículo1.getMarca()+
                " y su modelo es "+vehículo1.getModelo()+
                ". Tiene un consumo de "+vehículo1.getConsumo()+" por km.");
        System.out.println("La marca del vehículo 2 es: "+ vehículo2.getMarca()+
                " y su modelo es "+vehículo2.getModelo()+
                ". Tiene un consumo de "+vehículo2.getConsumo()+" por km.");
        System.out.println("La marca del vehículo 3 es: "+ vehículo3.getMarca()+
                " y su modelo es "+vehículo3.getModelo()+
                ". Tiene un consumo de "+vehículo3.getConsumo()+" por km.");

        System.out.println(vehículo4.getMarca());

        // Se obtiene un valor null, ya que ese objeto ha sido creado con el constructor vacío
    }

}