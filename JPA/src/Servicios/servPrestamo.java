/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Daos.PrestamoDao;
import entidades.entiClientes;
import entidades.entiLibros;
import entidades.entiPrestamo;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servPrestamo {

    private final PrestamoDao Dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    servClientes max = new servClientes();
    servLibros libroservice = new servLibros();
   // servPrestamo presti = new servPrestamo();
   

    public servPrestamo() {
        this.Dao = new PrestamoDao();
    }

    public void crearPrestamo() {
        LocalDate hoy = LocalDate.now();
        entiLibros libro;
        while (true) {
            try {
               libro=(libroservice.buscarLibroPorISBN());
              
                if (libro != null) {
                    System.out.println("Libro encontrado!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
                leer.next();
            }
        }

        if (libro.getEjemplaresRestantes() == 0) {
            System.out.println("No hay mas ejemplares disponibles!");
            return;
        }

        entiClientes cliente;
        while (true) {
            try {
                cliente = (max.buscarClientePorDocumento());
                if (cliente != null) {
                    System.out.println("Cliente encontrado!");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
                leer.next();
            }
        }
        LocalDate fechaPrestamo;
        while (true) {
            try {
                System.out.println("Ingrese la fecha del prestamo en formato (yyyy-MM-dd):");
                 String fecha = leer.next();
                fechaPrestamo = LocalDate.parse(fecha);
                System.out.println(fechaPrestamo);
                if (fechaPrestamo.isBefore(hoy)) {
                    System.out.println("La fecha de prestamo no puede ser anterior a la fecha actual!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
            }
        }
        LocalDate fechaDevolucion;
        while (true) {
            try {
                System.out.println("Ingrese la fecha de devolucion en formato (yyyy-MM-dd):");
                String fecha = leer.next();
                fechaDevolucion = LocalDate.parse(fecha);
                System.out.println(fechaDevolucion);
                if (fechaDevolucion.isBefore(fechaPrestamo) || fechaDevolucion.isBefore(hoy)) {
                    System.out.println("La fecha de devolucion no puede ser anterior a la fecha de prestamo o anterior a la fecha actual!");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido!");
            }
        }

        if (libro.getEjemplaresRestantes() == 0) {
            System.out.println("No hay mas ejemplares disponibles!");
        } else {
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
            libroservice.editar(libro);
            entiPrestamo prestamo = new entiPrestamo(fechaPrestamo, fechaDevolucion, libro, cliente);
            Dao.guardar(prestamo);
            System.out.println("Prestamo creado gato!");
        }
    }

    public void listarPrestamos() {
        entiClientes cliente=(max.buscarClientePorDocumento());
              //      servClientes cliente=(clienteservice.buscarClientePorDocumento());
                   //   entiClientes cliente = (clienteservice.buscarClientePorDocumento();
           
        if (cliente == null) {
            System.out.println("El cliente no existe!");
        } else {
           
 Dao.listarPrestamosPorCliente(cliente);
            
            
             
             
             
        }
    }

    public void devolverPrestamo() {
        entiClientes cliente = (max.buscarClientePorDocumento());
    //  entiClientes cliente=clienteservice.buscarClientePorDocumento();
     //  cliente.
             //entiPrestamo  prestamocliente= Dao.buscarPrestamoPorID(leer.nextInt());
               //   prestamocliente.getCliente().getDocumento();
                   //   entiClientes cliente = (clienteservice.buscarClientePorDocumento();
           
        if (cliente == null) {
            System.out.println("El cliente no existe!");
        } else {
            Dao.listarPrestamosPorCliente(cliente);
            
             System.out.println("Ingrese id  del prestamo que desea devolver:");
            int id = leer.nextInt();
            entiPrestamo prestamo = Dao.buscarPrestamoPorID(id);
            if (prestamo == null) {
                System.out.println("El prestamo no existe!");
            } else {
                entiLibros libro = prestamo.getLibro();
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                libroservice.editar(libro);
                Dao.eliminar(prestamo);
                System.out.println("Prestamo devuelto!");
            }
        }
    }
    public void listarTodosLosPrestamos() {
        try {
            Dao.listarTodosLosPrestamos();
        } catch (Exception e) {
            System.out.println("No hay prestamos registrados!");
        }
    }

    public void editar(entiPrestamo prestamo) {
        Dao.editar(prestamo);
    }
}
