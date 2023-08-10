/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import entidades.entiClientes;
import entidades.entiPrestamo;
import java.util.List;

/**
 *
 * @author Sangre
 */
public class PrestamoDao extends Dao<entiPrestamo> {
    @Override
    public void guardar(entiPrestamo entidad) {
        super.guardar(entidad);
    }

    @Override
    public void editar(entiPrestamo entidad) {
        super.editar(entidad);
    }

    @Override
    public void eliminar(entiPrestamo entidad) {
        super.eliminar(entidad);
    }

    public void listarPrestamosPorCliente (entiPrestamo cliente) {
        conectar();
        List<entiPrestamo> prestamos;
        try {
            prestamos = em.createQuery("SELECT p FROM entiPrestamo p WHERE p.cliente.documento = :documento")
                    .setParameter("documento", cliente.getCliente().getDocumento()).getResultList();
            if (prestamos.size() > 0) {
                for (entiPrestamo p : prestamos) {
                    System.out.println(p);
                }
            } else {
                System.out.println("No hay prestamos para este cliente");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
          
        }
          
        desconectar();
      
    }

    public entiPrestamo buscarPrestamoPorID(int id) {
        conectar();
        entiPrestamo prestamo;
        try {
            prestamo = em.find(entiPrestamo.class, id);
            if (prestamo != null) {
                System.out.println(prestamo);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
        return prestamo;
    }

    public void listarTodosLosPrestamos() {
        conectar();
        List<entiPrestamo> prestamos;
        try {
            prestamos = em.createQuery("SELECT p FROM entiPrestamo p").getResultList();
            if (prestamos.isEmpty()) {
                System.out.println("No hay prestamos registrados");
            }else {
                for (entiPrestamo p : prestamos) {
                    System.out.println(p);
                }
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listarPrestamosPorCliente(entiClientes cliente) {
    }
}