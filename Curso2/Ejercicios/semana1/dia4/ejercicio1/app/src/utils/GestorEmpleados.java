package utils;

import entities.Empleado;

import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private List<Empleado> empleadoList = new ArrayList<>();
    public void agnadirEmpleados(Empleado empleado){
        if(empleado.getNombre().isEmpty()){
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        if(empleado.getSalario() <= 0){
            throw new IllegalArgumentException("El salario tiene que ser mayor que 0");
        }
        empleadoList.add(empleado);
        System.out.println("El empleado: " + empleado.getNombre() + " ha sido registrado con éxito");
    }
    public void salarioMinimo(double salarioMinimo){
        if(salarioMinimo <= 1184.00){ // SMI en España
            throw new IllegalArgumentException("El salario debe ser superior o igual al SMI");
        }
        // con este código hacemos un filtro para saber que empleado está por debajo del SMI
        List<Empleado> empleadoSalarioMinimo = empleadoList.stream()
                .filter(empleado -> empleado.getSalario() < salarioMinimo)
                .toList();
        if (empleadoSalarioMinimo.size() == 1184){
            System.out.println("No hay empleados con un suelo inferior al SMI");
        }else {
            System.out.println("Hay empleados con salario inferior al SMI");
            empleadoSalarioMinimo.forEach(System.out::println);
        }
    }
    public void listarEmpleados(){
        if(empleadoList.isEmpty()){
            System.out.println("No hay empleados en la lista");
        }else {
            empleadoList.forEach(System.out::println);
        }
    }
}