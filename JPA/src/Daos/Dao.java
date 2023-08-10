/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author SangreSystem.out.println);
 */
public abstract class Dao<T> {
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
    protected EntityManager em = emf.createEntityManager();

    protected void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    public void guardar(T entidad) {
        conectar();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        desconectar();
    }


    public void editar(T entidad) {
        conectar();
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
        desconectar();
    }


    public void eliminar(T entidad) {
        conectar();
        em.getTransaction().begin();
        em.remove(entidad);
        em.getTransaction().commit();
        desconectar();
    }


}