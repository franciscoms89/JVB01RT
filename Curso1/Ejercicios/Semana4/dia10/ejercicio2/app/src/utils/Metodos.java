package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Metodos {

    public void imprimirMenu(){
        System.out.println("Bienvenido al menú de selección, por favor introduzca uno de los siguientes números:" + "\n");
        System.out.println("""
                    1. Bienvedida
                    2. Fecha actual
                    3. Número aleatorio
                    4. Tabla del 5
                    0. Salir
                    """);
    }

    public void mostrarMensaje(){
        System.out.println("Bienvenido al sietema!");
    }

    public void mostrarFechaActual(){
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        System.out.println("La fecha actual es: "+fechaFormateada);
    }

    public void mostrarNumeroAleatorio(){
        int numero = (int) (Math.random()*100);
        System.out.println("Numero aleatorio: " + numero);
    }

    public void mostrarTablaDelCinco(){
        int numero = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x "+ i + " = " + (numero*i));
        }
    }

}
