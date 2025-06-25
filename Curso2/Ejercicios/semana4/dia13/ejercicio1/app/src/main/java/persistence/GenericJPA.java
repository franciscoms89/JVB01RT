package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class GenericJPA<T, ID> {

    private final Class<T> entityClass;

    public GenericJPA(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    // CREATE

    public void create(T entity) {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // READ

    public List<T> findAll() {
        EntityManager em = ConfigJPA.getEntityManager();
        try {
            TypedQuery<T> query = em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
