package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entities.Cliente;

import java.util.List;

public class CustomerJPA {

    // Permite hacer operaciones CRUD sonbre el objeto Customer

    public void create(Cliente nuevoCliente) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(nuevoCliente);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public List<Cliente> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }

    public Cliente findOne(Integer idBuscado) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            return em.find(Cliente.class, idBuscado);
        }finally {
            em.close();
        }
    }

    public void update(Cliente clienteAActualizar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(clienteAActualizar);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public void delete(Integer idEliminar) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            Cliente clienteEncontrado = em.find(Cliente.class, idEliminar);
            if(clienteEncontrado != null){
                em.remove(clienteEncontrado);
            }else{
                System.out.println("El cliente no existe");
            }
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public List <Cliente> filterByCity(String ciudadBuscada) {
        EntityManager em = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.city = :city", Cliente.class)
                    .setParameter("city", ciudadBuscada);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
