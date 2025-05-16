import entities.Categorias;
import entities.Empleado;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleadoList = List.of(
                new Empleado("Francisco", 2000.00, Categorias.DESARROLLADOR),
                new Empleado("Ana", 1500.00, Categorias.ANALISTA),
                new Empleado("José", 3000.00, Categorias.GERENTE),
                new Empleado("Stefano", 2500.00, Categorias.DESARROLLADOR),
                new Empleado("Sara", 1800.00, Categorias.ANALISTA));
        // Filtrar empleados con salario mayor a valor específico
        double valorEspecifico = 2000.00;
        List<Empleado> filtroEmpleados = empleadoList.stream()
                .filter(e -> e.getSalario() > valorEspecifico)
                .toList();
        if(filtroEmpleados.isEmpty()){
            System.out.println("No hay empleados con el salario especificado: " + valorEspecifico);
        }else{
            System.out.println("Los empleados con un salario mayor a " + valorEspecifico + " son: ");
            filtroEmpleados.forEach(System.out::println);
        }
        System.out.println();
        // Agrupar por categoria y obtener promedio
        Map<Categorias, Double> promedioPorCategoria = empleadoList.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("El promedio de los salarios por categorías es:");
        promedioPorCategoria.forEach((categoria, promedio) -> System.out.println(categoria + ": " + promedio + "€"));
        System.out.println();
        // Encontrar al empleado con el salario más alto
        Optional<Empleado> masAlto = empleadoList.stream()
                .max(Comparator.comparingDouble(Empleado::getSalario));
        if (masAlto.isEmpty()) {
            System.out.println("Todos los empleados tienen el mismo salario o no existe empleados");
        }else{
            System.out.println("El empleado con el salario más alto es: " + masAlto);
        }
    }
}