/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Daos.EditorialDao;
import entidades.entiEditorial;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servEditorial {
    private final EditorialDao Dao;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public servEditorial() {
        this.Dao = new EditorialDao();
    }

    public void cargarEditorial() {
        try {
            entiEditorial editorial = new entiEditorial();
            System.out.println("Ingrese el nombre de la editorial:");
            editorial.setNombre(leer.next());
            boolean existe = Dao.existeEditorial(editorial);
            if (!existe) {
                Dao.guardar(editorial);
                System.out.println("Editorial cargada correctamente");
            } else {
                System.out.println("La editorial ya existe");
                cargarEditorial();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listarEditoriales() {
        try {
            Dao.listarEditoriales();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public entiEditorial buscarEditorialPorId() {
        try {
            System.out.println("Ingrese el id de la editorial:");
            int id = leer.nextInt();
            return Dao.buscardorDeId(id);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public List<entiEditorial> buscarEditorialPorNombre() {
        try {
            System.out.println("Ingrese el nombre de la editorial:");
            String nombre = leer.next();
            return Dao.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public void modificarEditorialPorId() {
        try {
            System.out.println("Ingrese el id de la editorial que desea modificar:");
            int max = 0;
            try {
                while (true) {
                    max = leer.nextInt();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
            entiEditorial editorial = Dao.buscardorDeId(max);
            if (editorial != null) {
                System.out.println("Ingrese el nuevo nombre de la editorial:");
                editorial.setNombre(leer.next());
                if (!Dao.existeEditorial(editorial)) {
                    Dao.editar(editorial);
                    System.out.println("Editorial modificada correctamente");
                } else {
                    System.out.println("La editorial ya existe");
                    modificarEditorialPorId();
                }
            } else {
                leer.next();
                modificarEditorialPorId();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void altaBajaEditorialPorId() {
        try {
            System.out.println("Ingrese el id de la editorial que desea eliminar:");
            Integer id = leer.nextInt();
            Dao.altaBajaEditorial(id);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}