/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import entidades.entiEditorial;
import java.util.List;

/**
 *
 * @author Sangre
 */
public class EditorialDao extends Dao<entiEditorial> {

    @Override
    public void guardar(entiEditorial entidad) {
        super.guardar(entidad);
    }

    @Override
    public void editar(entiEditorial entidad) {
        super.editar(entidad);
    }

    @Override
    public void eliminar(entiEditorial entidad) {
        super.eliminar(entidad);
    }

    public void listarEditoriales() {
        conectar();
        List<entiEditorial> editoriales;
        try {
            editoriales  = em.createQuery("SELECT e FROM entiEditorial e").getResultList();
            if (editoriales.isEmpty()) {
                System.out.println("No se encontraron resultados");
            } else {
                for (entiEditorial editorial : editoriales) {
                    System.out.println(editorial);
                }
            }
        }catch (Exception e) {
            System.out.println("Error en la busqueda: " + e.getMessage());
        }
        desconectar();
    }

    public entiEditorial buscardorDeId(int id) {
        conectar();
        entiEditorial editorial = new entiEditorial();
        try {
            editorial = em.find(entiEditorial.class, id);
            if (editorial != null) {
                System.out.println(editorial);
            } else {
                System.out.println("No se encontro la editorial");
            }
        } catch (Exception e) {
            System.out.println("No se encontro la editorial");
        }
        desconectar();
        return editorial;
    }

    public boolean existeEditorial(entiEditorial editorial) {
        conectar();
        entiEditorial editorialExiste;
        try {
            editorialExiste = (entiEditorial) em.createQuery(
                            "SELECT e FROM entiEditorial e WHERE e.nombre LIKE :nombre")
                    .setParameter("nombre", editorial.getNombre())
                    .getSingleResult();
        } catch (Exception e) {
            return false;
        }
        desconectar();
        return editorialExiste != null;
    }

    public List buscarPorNombre(String nombre) {
        conectar();
        List<entiEditorial> editoriales;
        try {
            editoriales = em.createQuery("SELECT e FROM entiEditorial e WHERE e.nombre LIKE :nombre")
                    .setParameter("nombre", "%"+nombre+"%")
                    .getResultList();
            if (editoriales.size() > 0) {
                for (entiEditorial e : editoriales) {
                    System.out.println(e);
                }
                return editoriales;
            } else {
                System.out.println("No se encontraron editoriales");
            }
        } catch (Exception e) {
            System.out.println("Error en la busqueda: " + e.getMessage());
        }
        desconectar();
        return null;
    }

    public void altaBajaEditorial(Integer id) {
        conectar();
        entiEditorial editorial;
        try {
            editorial = em.find(entiEditorial.class, id);
            if (editorial != null) {
                if (editorial.getAlta()) {
                    editorial.setAlta(false);
                    System.out.println("Se dio de baja la Editorial");
                } else {
                    editorial.setAlta(true);
                    System.out.println("Se dio de alta la Editorial");
                }
                em.getTransaction().begin();
                em.merge(editorial);
                em.getTransaction().commit();
            } else {
                System.out.println("No se encontro la editorial");
            }
        }catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        desconectar();
    }
}