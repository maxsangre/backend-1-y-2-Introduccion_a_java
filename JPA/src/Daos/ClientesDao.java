package Daos;


import Daos.Dao;
import entidades.entiClientes;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sangre
 */
public class ClientesDao extends Dao<entiClientes> {
    @Override
    public void guardar(entiClientes entidad) {
        super.guardar(entidad);
    }

    @Override
    public void editar(entiClientes entidad) {
        super.editar(entidad);
    }

    @Override
    public void eliminar(entiClientes entidad) {
        super.eliminar(entidad);
    }

    public void listarClientes() {
        conectar();
        List<entiClientes> clientes;
        try {
            clientes = em.createQuery("SELECT c FROM entiClientes c").getResultList();
            if (clientes.isEmpty()) {
                System.out.println("No hay clientes");
            } else {
                System.out.println("Lista de clientes:");
                for (entiClientes cliente : clientes) {
                    System.out.println(cliente);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        desconectar();
    }

    public entiClientes buscarClientePorDocumento(long documento) {
        conectar();
        entiClientes cliente;
        try {
            cliente = (entiClientes) em.createQuery("SELECT c FROM entiClientes c WHERE c.documento = :documento")
                    .setParameter("documento", documento)
                    .setMaxResults(1)
                    .getSingleResult();
            if (cliente != null) {
                System.out.println(cliente);
            }
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por documento: " + e.getMessage());
            return null;
        }
        desconectar();
        return cliente;
    }

    public boolean existeCliente(entiClientes cliente) {
        conectar();
        entiClientes clienteExiste;
        try {
            clienteExiste = (entiClientes) em.createQuery("SELECT c FROM entiClientes c WHERE c.documento = :documento")
                    .setParameter("documento", cliente.getDocumento())
                    .setMaxResults(1)
                    .getSingleResult();
        } catch (Exception e) {
            return false;
        }
        desconectar();
        return clienteExiste != null;
    }
}