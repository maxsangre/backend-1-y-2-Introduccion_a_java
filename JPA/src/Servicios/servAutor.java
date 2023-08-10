/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Daos.AutorDao;
import entidades.entiAutor;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servAutor {
    private final AutorDao Dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public servAutor() {
        this.Dao = new AutorDao();
    }

    public void cargarAutor() {
        entiAutor autor = new entiAutor();
        System.out.println("Ingrese el nombre del autor:");
        autor.setNombre(leer.next());

        boolean existe = Dao.existeAutor(autor);
        try {
            if (!existe) {
                Dao.guardar(autor);
                System.out.println("Autor cargado correctamente");
            } else {
                System.out.println("El autor ya existe");
                cargarAutor();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List buscarAutorPorNombre() {
        try {
            System.out.println("Ingrese el nombre del autor:");
            String nombre = leer.next();
            return Dao.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public entiAutor buscarAutorPorId() {
        try {
            System.out.println("Ingrese el id del autor:");
            int a = leer.nextInt();
            return Dao.buscadorDeId(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontró el autor");
            return null;
        }
    }

    public void listarAutores() {
        try {
            Dao.listarAutores();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarAutorPorId() {
        try {
            System.out.println("Ingrese el id del autor que desea modificar:");
            int max = 0;
            try {
                while (true) {
                    max = leer.nextInt();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
            entiAutor autor = Dao.buscadorDeId(max);
            if (autor != null) {
                System.out.println("Ingrese el nuevo nombre del autor:");
                autor.setNombre(leer.next());
                if (!Dao.existeAutor(autor)) {
                    Dao.editar(autor);
                    System.out.println("Autor modificado correctamente");
                } else {
                    System.out.println("El autor ya existe");
                    modificarAutorPorId();
                }
            } else {
                leer.next();
                modificarAutorPorId();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void altaBajaAutorPorId() {
        try {
            System.out.println("Ingrese el id del autor que desea dar de Alta/Baja:");
            Integer l = leer.nextInt();
            Dao.altaBajaAutor(l);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    public void eliminarAutorPorId() {
//        try {
//            System.out.println("Ingrese el id del autor que desea eliminar:");
//            Integer l = leer.nextInt();
//            DAO.eliminarAutor(l);
//            System.out.println("Se elimino el autor");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
}