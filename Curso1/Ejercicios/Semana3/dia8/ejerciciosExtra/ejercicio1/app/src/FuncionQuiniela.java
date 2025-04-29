import java.util.Random;

public class FuncionQuiniela {

    public void generarQuiniela(int cantidad){

        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int aleatorio = random.nextInt(3);
            if(aleatorio==0)
                System.out.println("El resultado nº" + (i+1) + " es: 1");
            else if (aleatorio==1)
                System.out.println("El resultado nº" + (i+1) + " es: X");
            else
                System.out.println("El resultado nº" + (i+1) + " es: 2");
        }
    }
}
