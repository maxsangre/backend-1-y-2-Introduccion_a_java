/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Daos.ClientesDao;
import entidades.entiClientes;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servClientes {
    private final ClientesDao Dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public servClientes() {
        this.Dao = new ClientesDao();
    }

    public void crearCliente() {
        entiClientes cliente = new entiClientes();
        try {
            while (true) {
                try {
                    System.out.println("Ingrese el documento del cliente");
                    cliente.setDocumento(leer.nextLong());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Tipo de dato incorrecto.");
                    leer.nextLine(); // Limpiar el buffer del scanner
                }
            }
            boolean existe = Dao.existeCliente(cliente);
            if (existe) {
                System.out.println("Ya existe un Cliente asociado a ese documento!");
                crearCliente();
            }else {
                System.out.println("Ingrese el nombre del cliente");
                cliente.setNombre(leer.next());

                System.out.println("Ingrese el apellido del cliente");
                cliente.setApellido(leer.next());

                System.out.println("Ingrese el telefono del cliente");
                cliente.setTelefono(leer.next());

                if (!existe) {
                    Dao.guardar(cliente);
                    System.out.println("Cliente creado");
                }
            }
        } catch (
                Exception e) {
            System.out.println("Error al ingresar los datos");
        }
    }

    public void listarClientes() {
        try {
            Dao.listarClientes();
        } catch (Exception e) {
            System.out.println("Error al listar los clientes");
        }
    }

    public entiClientes buscarClientePorDocumento() {
        long documento;
        while (true) {
            try {
                System.out.println("Ingrese el documento del cliente a buscar:");
                documento = leer.nextLong();
                return Dao.buscarClientePorDocumento(documento);
            } catch (Exception e) {
                System.out.println("Error al ingresar el documento");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }
}
