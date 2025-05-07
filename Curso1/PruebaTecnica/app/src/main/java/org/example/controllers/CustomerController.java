package org.example.controllers;

import org.example.entities.Cliente;
import org.example.persistence.CustomerJPA;

import java.util.List;

public class CustomerController {

    // Esta clase es la que maneja el CRUD

    CustomerJPA customerJPA = new CustomerJPA();

    public List<Cliente> findAll() {
        return customerJPA.findAll();
    }

    public void create(Cliente nuevoCliente) {
        customerJPA.create(nuevoCliente);
    }

    public Cliente findOne(Integer idBuscado) {
        return customerJPA.findOne(idBuscado);
    }

    public void update(Cliente clienteAActualizar) {
        customerJPA.update(clienteAActualizar);
    }

    public void delete(Integer idEliminar) {
        customerJPA.delete(idEliminar);
    }

    public List <Cliente> filterByCity(String ciudadBuscada){
        return customerJPA.filterByCity(ciudadBuscada);
    }

}
