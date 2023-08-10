/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import entidades.entiAutor;
import java.util.List;

/**
 *
 * @author Sangre
 */
public class AutorDao extends Dao<entiAutor> {
    @Override
    public void guardar(entiAutor entidad) {
        super.guardar(entidad);
    }

    @Override
    public void editar(entiAutor entidad) {
        super.editar(entidad);
    }

    @Override
    public void eliminar(entiAutor entidad) {
        super.eliminar(entidad);
    }


    public List buscarPorNombre(String nombre) {
        conectar();
        List<entiAutor> autor;
        try {
            autor = em.createQuery("SELECT a FROM entiAutor a where a.nombre LIKE :nombre")
                    .setParameter("nombre", "%"+nombre+"%")
                    .getResultList();
            if (autor.isEmpty()) {
                System.out.println("No se encontraron autores.");
            } else {
                for (entiAutor aut : autor) {
                    System.out.println(aut);
                }
                return autor;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return null;
    }

    public entiAutor buscadorDeId(int l) {
        conectar();
        entiAutor autor = new entiAutor();
        try {
            autor = em.find(entiAutor.class, l);
            if (autor != null) {
                System.out.println(autor);
            } else {
                System.out.println("No  se encontro el autor gil");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
        return autor;
    }

    public void listarAutores() {
        conectar();
        List<entiAutor> autores;
        try {
            autores = em.createQuery("SELECT a FROM entiAutor a").getResultList();
            if (autores.isEmpty()) {
                System.out.println("No hay autores");
            } else {
                for (entiAutor autor : autores) {
                    System.out.println(autor);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public boolean existeAutor(entiAutor autor) {
        conectar();
        entiAutor autorExiste;
        try {
            autorExiste = (entiAutor) em.createQuery("SELECT a FROM entiAutor a WHERE a.nombre= :nombre")
                    .setParameter("nombre", autor.getNombre())
                    .getSingleResult();
        } catch (Exception e) {
            return false;
        }
        desconectar();
        return autorExiste != null;
    }

    public void altaBajaAutor(Integer id) {
        conectar();
        entiAutor autor;
        try {
            autor = em.find(entiAutor.class, id);
            if (autor != null) {
                if (autor.getAlta()) {
                    autor.setAlta(false);
                    System.out.println("Autor dado de baja Amigo");
                } else {
                    autor.setAlta(true);
                    System.out.println("Autor dado de alta Bro");
                }
                em.getTransaction().begin();
                em.merge(autor);
                em.getTransaction().commit();
            } else {
                System.out.println("No se encontro el autor Zapato");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public void eliminarAutor(Integer id) {
        conectar();
        entiAutor autor;
        try {
            autor = em.find(entiAutor.class, id);
            if (autor != null) {
                em.getTransaction().begin();
                em.remove(autor);
                em.getTransaction().commit();
            } else {
                System.out.println("No se encontro el autor, Sanguango");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

}
