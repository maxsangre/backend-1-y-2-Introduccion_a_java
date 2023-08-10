/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import Servicios.servAutor;
import Servicios.servClientes;
import Servicios.servEditorial;
import Servicios.servLibros;
import Servicios.servPrestamo;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class Menu {

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servAutor autorService = new servAutor();
        servEditorial editorialService = new servEditorial();
        servLibros libroService = new servLibros();
        servPrestamo prestamoService = new servPrestamo();
        servClientes clienteService = new servClientes();

        int opcion = -1;
        do {
            System.out.println();
            System.out.println();
            System.out.println("♠♠♠♠♠ Menu de Gestiones ♠♠♠♠♠");
            System.out.println("       ===================");
            System.out.println();
            System.out.println("1. Gestión de Autores");
            System.out.println("2. Gestión de Editoriales");
            System.out.println("3. Gestión de Libros");
            System.out.println("4. Gestión de Clientes");
            System.out.println("5. Gestión de Prestamos");
            System.out.println("0. Salir ☻");
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                leer.next();
            }
            switch (opcion) {
                case 1:
                    gestionAutores(autorService, leer);
                    break;
                case 2:
                    gestionEditoriales(editorialService, leer);
                    break;
                case 3:
                    gestionLibros(libroService, leer);
                    break;
                case 4:
                    gestionCliente(clienteService, leer);
                    break;
                case 5:
                    gestionPrestamo(prestamoService, leer);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    private static void gestionAutores(servAutor autorService, Scanner leer) {
        int opcion = -1;
        do {
            System.out.println();
            System.out.println("♦♦♦♦ GESTIÓN DE AUTORES ♦♦♦♦");
            System.out.println("     =====================");
            System.out.println("1. Insertar Autor ");
            System.out.println("2. Search Autor Por Nombre");
            System.out.println("3. Search Autor Por Id");
            System.out.println("4. Lista de Autores");
            System.out.println("5. Autor Alta/Baja");
            System.out.println("6. Modificar Autor");
            System.out.println("0. Volver al Menú Principal ☻");
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e.fillInStackTrace());
                leer.next();
            }
            switch (opcion) {
                case 1:
                    autorService.cargarAutor();
                    break;
                case 2:
                    autorService.buscarAutorPorNombre();
                    break;
                case 3:
                    autorService.buscarAutorPorId();
                    break;
                case 4:
                    autorService.listarAutores();
                    break;
                case 5:
                    autorService.altaBajaAutorPorId();
                    break;
                case 6:
                    autorService.modificarAutorPorId();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    private static void gestionEditoriales(servEditorial editorialService, Scanner leer) {
        int opcion = -1;
        do {
            System.out.println();
            System.out.println("♦♦♦♦♦ GESTIÓN DE EDITORIALES ♦♦♦♦♦");
            System.out.println("       =======================");
            System.out.println("1. Insertar Editorial");
            System.out.println("2. Search Editorial Por Nombre");
            System.out.println("3. Search Editorial Por Id");
            System.out.println("4. Lista de Editoriales");
            System.out.println("5. Editorial Alta/Baja");
            System.out.println("6. Modificar Editorial");
            System.out.println("0. Volver al Menú Principal ☻");
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e.fillInStackTrace());
                leer.next();
            }
            switch (opcion) {
                case 1:
                    editorialService.cargarEditorial();
                    break;
                case 2:
                    editorialService.buscarEditorialPorNombre();
                    break;
                case 3:
                    editorialService.buscarEditorialPorId();
                    break;
                case 4:
                    editorialService.listarEditoriales();
                    break;
                case 5:
                    editorialService.altaBajaEditorialPorId();
                    break;
                case 6:
                    editorialService.modificarEditorialPorId();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    private static void gestionLibros(servLibros libroService, Scanner leer) {
        int opcion = -1;
        do {
            System.out.println();
            System.out.println("===== GESTIÓN DE LIBROS =====");
            System.out.println("     ♦♦♦♦♦♦♦♦♦♦♦♦♦              ");
            System.out.println();
            System.out.println("1. Insertar Libro");
            System.out.println("2. Search Libro Por Nombre");
            System.out.println("3. Search Libro Por ISBN");
            System.out.println("4. Search Libro Por Autor");
            System.out.println("5. Search Libro Por Editorial");
            System.out.println("6. Lista de Libros");
            System.out.println("7. Libro Alta/Baja");
            System.out.println("8. Modificar Libro");
            System.out.println("0. Volver al Menú Principal ☻");
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e.fillInStackTrace());
                leer.next();
            }
            switch (opcion) {
                case 1:
                    libroService.cargarLibro();
                    break;
                case 2:
                    libroService.buscarLibroPorNombre();
                    break;
                case 3:
                    libroService.buscarLibroPorISBN();
                    break;
                case 4:
                    libroService.buscarLibroPorAutor();
                    break;
                case 5:
                    libroService.buscarLibroPorEditorial();
                    break;
                case 6:
                    libroService.listarLibros();
                    break;
                case 7:
                    libroService.altaBajaLibroPorISBN();
                    break;
                case 8:
                    libroService.modificarLibroPorISBN();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void gestionCliente(servClientes clienteService, Scanner leer) {
        int opcion = -1;
        do {
            System.out.println();
            System.out.println("☻☻☻☻☻ GESTIÓN DE CLIENTES ☻☻☻☻☻");
            System.out.println("       =====================");
            System.out.println("1. Insertar Cliente");
            System.out.println("2. Lista de Clientes");
            System.out.println("3. Search Cliente Por Documento");
            System.out.println("0. Volver al Menú Principal ☻");
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e.fillInStackTrace());
                leer.next();
            }
            switch (opcion) {
                case 1:
                    clienteService.crearCliente();
                    break;
                case 2:
                    clienteService.listarClientes();
                    break;
                case 3:
                    clienteService.buscarClientePorDocumento();
                    break;

                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void gestionPrestamo(servPrestamo prestamoService, Scanner leer) {
        int opcion = -1;
        do {
            System.out.println();
            System.out.println("☺☺☺☺☺☺ GESTIÓN DE PRESTAMOS ☺☺☺☺☺");
            System.out.println("        =======================");
            System.out.println("1. Insertar Prestamo");
            System.out.println("2. Lista de Prestamos por Cliente");
            System.out.println("3. Devolver Prestamo");
            System.out.println("4. Lista de Prestamos");
            System.out.println("0. Volver al Menú Principal ☻");
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e.fillInStackTrace());
                leer.next();
            }
            switch (opcion) {
                case 1:
                    prestamoService.crearPrestamo();
                    break;
                case 2:
                    prestamoService.listarPrestamos();
                    break;
                case 3:
                    prestamoService.devolverPrestamo();
                    break;
                case 4:
                    prestamoService.listarTodosLosPrestamos();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }
}
