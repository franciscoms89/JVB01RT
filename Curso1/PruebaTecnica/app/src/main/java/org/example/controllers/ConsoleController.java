package org.example.controllers;

import org.example.entities.Cliente;

import java.util.List;
import java.util.Scanner;

public class ConsoleController {

    // Esta clase contiene métodos que se usan a través de la consola o están relacionados con ellas

    private final CustomerController c = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);

    // Nos muestra el menú de la consola
    public void mostrarMenu(){

        int opcionElegida;
        do {
            System.out.println("Por favor, introduzca una de los siguientes opciones:" + "\n");
            System.out.println("""
                    1. Agregar un nuevo cliente
                    2. Listar todos los clientes
                    3. Actualizar información de un cliente
                    4. Eliminar un cliente
                    5. Buscar clientes por ciudad
                    0. Salir
                    """);

            opcionElegida = scanner.nextInt();
            scanner.nextLine();

            switch (opcionElegida) {
                case 1:
                    add();
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    searchByCity();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo" + "\n");
            }
        } while (opcionElegida!=0);

    }

    // Añade los datos introducidos por consola y valida que no sean nulos
    public void add(){
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setName(notEmpty("Nombre: "));
        nuevoCliente.setSurname(notEmpty("Apellidos: "));
        nuevoCliente.setGender(notEmpty("Género (M/F): "));
        nuevoCliente.setCity(notEmpty("Ciudad: "));
        nuevoCliente.setBirthDate(notEmpty("Fecha de nacimiento (dd/mm/yyyy): "));
        nuevoCliente.setPhone(notEmpty("Teléfono: "));
        nuevoCliente.setEmail(notEmpty("Email: "));

        c.create(nuevoCliente);
        System.out.println("Cliente guardado con éxito");

    }

    // Nos valida que los datos no sean nulos
    private String notEmpty(String mensaje){
        String entrada;
        do{
            System.out.println(mensaje);
            entrada = scanner.nextLine().trim();
            if(entrada.isEmpty()){
                System.out.println("No puede habar campos vacíos. Por favor, introduzca alguna información");
            }
        }while(entrada.isEmpty());
        return entrada;
    }

    // Lista a los clientes
    public void list(){
        List <Cliente> listaClientes = c.findAll();
        for(Cliente c: listaClientes){
            System.out.println(c);
        }
    }

    // Actualiza los datos introducidos del cliente y valida que no sean nulos
    public void update(){
        System.out.println("Por favor, introduce el id del cliente a modificar: ");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        Cliente customer = c.findOne(id);
        if(customer == null){
            System.out.println("No existe el cliente seleccionado");
            return;
        }

        int eleccion;

        do {
            System.out.println("¿Qué datos deseas modificar? Elija una de las siguientes opciones");
            System.out.println("""
                    1. Nombre
                    2. Apellidos
                    3. Género
                    4. Ciudad
                    5. Fecha de nacimiento
                    6. Teléfono
                    7. Email
                    0. Salir
                    """);
            eleccion = scanner.nextInt();
            scanner.nextLine();
            switch (eleccion) {
                case 1:
                    customer.setName(notEmpty("Nuevo nombre: "));
                    break;
                case 2:
                    customer.setSurname(notEmpty("Nuevos apellidos: "));
                    break;
                case 3:
                    customer.setGender(notEmpty("Nuevo género (M/F): "));
                    break;
                case 4:
                    customer.setCity(notEmpty("Nueva ciudad: "));
                    break;
                case 5:
                    customer.setBirthDate(notEmpty("Nueva fecha de nacimiento (dd/mm/yyyy): "));
                    break;
                case 6:
                    customer.setPhone(notEmpty("Nuevo teléfono: "));
                    break;
                case 7:
                    customer.setEmail(notEmpty("Nuevo email: "));
                case 0:
                    System.out.println("Saliendo del selector");
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo" + "\n");
            }
        }while (eleccion!=0);

        c.update(customer);
        System.out.println("Cliente actualizado con éxito");
    }

    // Elimina el cliente deseado
    public void delete(){
        System.out.println("Introduzca el Id del cliente a eliminar: ");
        try{
            Integer id = scanner.nextInt();
            scanner.nextLine();
            Cliente cliente = c.findOne(id);

            if(cliente == null){
                System.out.println("No existe el cliente seleccionado");
                return;
            }
            c.delete(id);
            System.out.println("Cliente eliminado con éxito");

        }catch(Exception e){
            System.out.println("Error al eliminar al cliente");
        }

    }

    // Buscador de cliente por ciudad
    public void searchByCity(){
        System.out.println("Introduzca la ciudad a buscar: ");
        String ciudad = scanner.nextLine();
        List <Cliente> lista = c.filterByCity(ciudad);
        if(lista.isEmpty()){
            System.out.println("No existen clientes en esa ciudad");
        }else{
            lista.forEach(c -> System.out.println(c.getName() + " " + c.getSurname()));
        }
    }
}
