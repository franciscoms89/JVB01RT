public class Main {
    public static void main(String[] args) {
        Electrodomesticos electrodomestico1 = new Electrodomesticos(1, "Fagor", "X-100", 1200, "Plateado");
        Electrodomesticos electrodomestico2 = new Electrodomesticos(2, "Samsung", "AD1254", 1300, "Amarillo");
        Electrodomesticos electrodomestico3 = new Electrodomesticos(3, "Jata", "12WS322", 1500, "Negro");
        Electrodomesticos electrodomestico4 = new Electrodomesticos();


        System.out.println("La marca del electrodomestico 1 es: "+ electrodomestico1.getMarca()+
                " y su modelo es "+electrodomestico1.getModelo()+
                ". Tiene un consumo de "+electrodomestico1.getConsumo()+" kWh.");
        System.out.println("La marca del electrodomestico 2 es: "+ electrodomestico2.getMarca()+
                " y su modelo es "+electrodomestico2.getModelo()+
                ". Tiene un consumo de "+electrodomestico2.getConsumo()+" kWh.");
        System.out.println("La marca del electrodomestico 3 es: "+ electrodomestico3.getMarca()+
                " y su modelo es "+electrodomestico3.getModelo()+
                ". Tiene un consumo de "+electrodomestico3.getConsumo()+" kWh.");

        System.out.println(electrodomestico4.getMarca());

        // Se obtiene un valor null, ya que ese objeto ha sido creado con el constructor vacío
    }

}