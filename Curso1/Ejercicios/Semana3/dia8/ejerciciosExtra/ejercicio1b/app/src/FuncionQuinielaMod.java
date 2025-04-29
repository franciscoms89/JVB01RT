import java.util.Random;

public class FuncionQuinielaMod {
    public void generarQuiniela(int cantidad) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int aleatorio = random.nextInt(100);
            if(aleatorio<60)
                System.out.println("El resultado nº" + (i+1) + " es: 1");
            else if (aleatorio<90)
                System.out.println("El resultado nº" + (i+1) + " es: X");
            else
                System.out.println("El resultado nº" + (i+1) + " es: 2");
        }
    }
}
