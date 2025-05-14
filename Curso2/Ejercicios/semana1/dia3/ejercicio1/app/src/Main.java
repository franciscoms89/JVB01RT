import entities.Agente;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Comeinza el hilo principal");
        // creamos los hilos que simulan a los agentes
        Agente agente1 = new Agente("Francisco");
        Agente agente2 = new Agente("María");
        Agente agente3 = new Agente("José");
        // iniciamos los hilos
        agente1.start();
        agente2.start();
        agente3.start();
        // con esto hacemos que el hilo principal (main) se espere hasta que los hilos terminen
        agente1.join();
        agente2.join();
        agente3.join();
        System.out.println("Fin del hilo principal");
    }
}