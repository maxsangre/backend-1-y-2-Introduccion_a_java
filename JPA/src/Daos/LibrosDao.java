/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import entidades.entiLibros;
import java.util.List;

/**
 *
 * @author Sangre
 */
public class LibrosDao extends Dao<entiLibros> {

    @Override
    public void guardar(entiLibros entidad) {
        super.guardar(entidad);
    }

    @Override
    public void editar(entiLibros entidad) {
        super.editar(entidad);
    }

    @Override
    public void eliminar(entiLibros entidad) {
        super.eliminar(entidad);
    }


    public void buscarPorNombre(String nombre) {
        conectar();
        List<entiLibros> libros;
        try {
           libros = em.createQuery("SELECT l FROM entiLibros l WHERE l.titulo LIKE :nombre")
                  //  libros=em.createQuery("SELECT a FROM entiLibro a WHERE a.titulo= :titulo")
                    //.setParameter("titulo", "%" + titulo + "%").getResultList();
                    
                  //  libros = em.createQuery("SELECT e FROM entiLibros e WHERE e.titulo =nombre")
                    .setParameter("nombre", "%"+nombre+"%")
                    .getResultList();
                    
                   
            if (libros != null) {
                for (entiLibros libro : libros) {
                    System.out.println(libro);
                  
                }
                
            } else {
                System.out.println("No se encontraron libros");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }


    public entiLibros buscarPorISBN(long isbn) {
        conectar();
        entiLibros libro;
        try {
            libro = em.find(entiLibros.class, isbn);
            if (libro != null) {
                System.out.println(libro);
            } else {
                System.out.println("No se encontro el libro");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        desconectar();
        return libro;
    }

    public void listarTodos() {
        conectar();
        try {
            List<entiLibros> libros = em.createQuery("SELECT l FROM entiLibros l")
                    .getResultList();
            if (libros.isEmpty()) {
                System.out.println("No hay libros");
            }else {
                for (entiLibros libro : libros) {
                    System.out.println(libro);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public void buscarLibroPorAutor(String nombreAutor) {
        conectar();
        List<entiLibros> libros;
        try {
            libros = em.createQuery("SELECT l FROM entiLibros l WHERE l.autor.nombre LIKE :nombreAutor")
                    .setParameter("nombreAutor", "%" + nombreAutor + "%").getResultList();
            desconectar();
            if (libros.size() == 0) {
                System.out.println("No se encontraron libros con ese autor");
            } else {
                for (entiLibros libro : libros) {
                    System.out.println(libro);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public void buscarLibroPorEditorial(String nombreEditorial) {
        conectar();
        List<entiLibros> libros;
        try {
            libros = em.createQuery("SELECT l FROM entiLibros l WHERE l.editorial.nombre LIKE :nombreEditorial")
                    .setParameter("nombreEditorial", "%" + nombreEditorial + "%").getResultList();
            desconectar();
            if (libros.size() == 0) {
                System.out.println("No se encontraron libros con ese editorial");
            } else {
                for (entiLibros libro : libros) {
                    System.out.println(libro);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public boolean existeLibro(entiLibros libro) {
        conectar();
        entiLibros libroExiste;
        try {
            libroExiste = (entiLibros) em.createQuery(
                            "SELECT l FROM entiLibros l WHERE l.titulo = :titulo AND l.year = :year AND l.editorial.nombre = :editorial_id AND l.autor.nombre = :autor_id")
                    .setParameter("titulo", libro.getTitulo())
                    .setParameter("anio", libro.getYear())
                    .setParameter("editorial", libro.getEditorial().getNombre())
                    .setParameter("autor", libro.getAutor().getNombre()).getSingleResult();
        } catch (Exception e) {
            return false;
        }
        desconectar();
        return libroExiste != null;
    }

    public void altaBajaLibroPorISBN(long isbn) {
        conectar();
        entiLibros libro;
        try {
            libro  = em.find(entiLibros.class, isbn);
            if (libro != null) {
                if (libro.getAlta()) {
                    libro.setAlta(false);
                    System.out.println("Libro dado de baja");
                } else {
                    libro.setAlta(true);
                    System.out.println("Libro dado de alta");
                }
                em.getTransaction().begin();
                em.merge(libro);
                em.getTransaction().commit();
            } else {
                System.out.println("No se encontro el libro");
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

}