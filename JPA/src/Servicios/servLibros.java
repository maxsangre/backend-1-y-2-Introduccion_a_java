/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Daos.AutorDao;
import Daos.LibrosDao;
import entidades.entiAutor;
import entidades.entiEditorial;
import entidades.entiLibros;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servLibros {

    private final LibrosDao Dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
 // servLibros maxServicio = new servLibros();
   servEditorial editorialService = new servEditorial();
servAutor autorito=new servAutor();

    public servLibros() {
        this.Dao = new LibrosDao();
    }

    public void listarLibros() {
        try {
            Dao.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarLibroPorNombre() {
        try {
            System.out.println("♦ Ingrese el nombre del libro:");
            String nombre = leer.next();
            Dao.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontró el libro");
        }
    }

    public entiLibros buscarLibroPorISBN() {
        try {
            System.out.println("♦ Ingrese el ISBN del libro:");
            long isbn = leer.nextLong();
                return Dao.buscarPorISBN(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se encontrón el libro  jajajaj");
            return null;
        }
    }

    
     public void cargarLibro(){
        entiLibros libro = new entiLibros();

        System.out.println("♣ Ingrese Titulo:");
        libro.setTitulo(leer.nextLine());

        //Validar numero
        int year;
        while (true) {
            try {
                System.out.println("♣ Ingrese año:");
                year = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para el año.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setYear(year);

        int ejemplares;
        while (true) {
            try {
                System.out.println("♦ Ingrese ejemplares:");
                ejemplares = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para los ejemplares.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setEjemplares(ejemplares);

        int ejemplaresPrestados;
        while (true) {
            try {
                System.out.println("♦ Ingrese ejemplares prestados:");
                ejemplaresPrestados = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para los ejemplares prestados.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setEjemplaresPrestados(ejemplaresPrestados);

        int ejemplaresRestantes;
        while (true) {
            try {
                System.out.println("♦ Ingrese ejemplares restantes:");
                ejemplaresRestantes = leer.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero para los ejemplares restantes.");
                leer.nextLine(); // Limpiar el buffer del scanner
            }
        }
        libro.setEjemplaresRestantes(ejemplaresRestantes);

        while (true) {
            System.out.println("Asignar Autor...");
           List<servAutor> autor = autorito.buscarAutorPorNombre();
            if (autor == null || autor.isEmpty()) {
                System.out.println("Intente nuevamente.\n"); 
            } else {
                System.out.println();
                while (true) {
                    try {
                       
                        libro.setAutor(autorito.buscarAutorPorId());
                        System.out.println("Autor asignado");
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: Debes ingresar un numero entero para el ID.");
                        leer.nextLine(); // Limpiar el buffer del scanner
                    }
                }
                break;
            }
        }

        while (true) {
            System.out.println("Asignar Editorial...");
            List<entiEditorial> editoriales = editorialService.buscarEditorialPorNombre();
            if (editoriales == null || editoriales.isEmpty()) {
                System.out.println("Intente nuevamente.\n");
            } else {
                System.out.println();
                while (true) {
                    try {
                        libro.setEditorial(editorialService.buscarEditorialPorId());
                        System.out.println("Editorial asignada");
                        break;
                    } catch (Exception e) {
                        System.out.println("Error: Debes ingresar un numero entero para el ID.");
                        leer.nextLine(); // Limpiar el buffer del scanner
                    }
                }
                break;
            }
        }

        boolean existe = Dao.existeLibro(libro);

        try {
            if (libro.getAutor() != null && libro.getEditorial() != null && !existe) {
                Dao.guardar(libro);
                System.out.println("Se cargó el libro correctamente.☻");
                leer.nextLine();
            } else {
                System.out.println("No se pudo cargar el libro. ajjajajaj");
                System.out.println("Por favor, verifique los datos e intente nuevamente. ☻");
                System.out.println("Es posible que el libro ya exista. ☺");
                leer.nextLine(); // Limpiar el buffer del scanner
                cargarLibro();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void buscarLibroPorAutor() {
        try {
            System.out.println("Ingrese el nombre del autor que desea buscar ☻:");
            String nombre = leer.next();
            Dao.buscarLibroPorAutor(nombre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void buscarLibroPorEditorial() {
        try {
            System.out.println("Ingrese el nombre de la editorial que desea buscar:");
            String nombre = leer.next();
            Dao.buscarLibroPorEditorial(nombre);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void altaBajaLibroPorISBN() {
        try {
            System.out.println("Ingrese el ISBN del libro que desea dar de baja o alta");
            long isbn = leer.nextLong();
            Dao.altaBajaLibroPorISBN(isbn);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void modificarLibroPorISBN() {
        try {
            System.out.println("Ingrese el ISBN del libro que desea modificar:");
            long isbn;
            while (true) {
                try {
                    System.out.println("Ingrese ISBN:");
                    isbn = leer.nextLong();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número para el ISBN.");
                    leer.nextLine(); // Limpiar el buffer del scanner
                }
            }
            entiLibros libro = Dao.buscarPorISBN(isbn);
            if (libro != null) {
                int menu = -1;
                do {System.out.println("♦♦♦Menu Para Insoportables♦♦♦");
                System.out.println("              ====================");
                    System.out.println("1. Modifica el título Gato");
                    System.out.println("2. O Dale Modifica el Year Pa");
                    System.out.println("3. Bueno Dale Modifica los ejemplares");
                    System.out.println("4. O Modificar ejemplares prestados si Queres ☺");
                    System.out.println("5.  Entonces Modifica los ejemplares restantes");
                    System.out.println("6. Pero si queres Modificar el id del autor ya sabes que hacer");
                    System.out.println("7. Dale Pesado Modifica el id de la editorial");
                    System.out.println("8. Pero Guardar cambios Pesado no seas Gil");
                    System.out.println("0. Salir ☻");
                    menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese el nuevo título:");
                            libro.setTitulo(leer.next());
                            break;
                        case 2:
                            int year;
                            while (true) {
                                try {
                                    System.out.println("Ingrese el year:");
                                    year = leer.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número entero para el año.");
                                    leer.nextLine(); // Limpiar el buffer del scanner
                                }
                            }
                            libro.setYear(year);
                            break;
                        case 3:
                            int ejemplares;
                            while (true) {
                                try {
                                    System.out.println("Ingrese ejemplares:");
                                    ejemplares = leer.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número entero para los ejemplares.");
                                    leer.nextLine(); // Limpiar el buffer del scanner
                                }
                            }
                            libro.setEjemplares(ejemplares);
                            break;
                        case 4:
                            int ejemplaresPrestados;
                            while (true) {
                                try {
                                    System.out.println("Ingrese ejemplares prestados:");
                                    ejemplaresPrestados = leer.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número entero para los ejemplares prestados.");
                                    leer.nextLine(); // Limpiar el buffer del scanner
                                }
                            }
                            libro.setEjemplaresPrestados(ejemplaresPrestados);
                            break;
                        case 5:
                            int ejemplaresRestantes;
                            while (true) {
                                try {
                                    System.out.println("Ingrese ejemplares restantes:");
                                    ejemplaresRestantes = leer.nextInt();
                                    break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número entero para los ejemplares restantes.");
                                    leer.nextLine(); // Limpiar el buffer del scanner
                                }
                            }
                            libro.setEjemplaresRestantes(ejemplaresRestantes);
                            break;

                        case 6:
                            System.out.println("Buscar Autor...");
                             autorito.buscarAutorPorNombre();
                            libro.setAutor(autorito.buscarAutorPorId());
                            break;

                        case 7:
                            System.out.println("Buscar editorial...");
                            editorialService.buscarEditorialPorNombre();
                            libro.setEditorial(editorialService.buscarEditorialPorId());
                            break;
                        case 8:
                            boolean existe = Dao.existeLibro(libro);
                            try {
                                if (libro.getAutor() != null && libro.getEditorial() != null && !existe) {
                                    Dao.editar(libro);
                                    System.out.println("Se modificó el libro correctamente. ☻");
                                    leer.nextLine(); // Limpiar el buffer del scanner
                                    break;
                                } else {
                                    System.out.println("No se pudo modificar el libro. Matate Gil");
                                    System.out.println("Por favor, verifique los datos e intente nuevamente. no sea Salame");
                                    System.out.println("Es posible que el libro ya exista. fijate en la Base de Datos ☻");
                                    leer.nextLine(); // Limpiar el buffer del scanner
                                    modificarLibroPorISBN();
                                }
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;
                        case 0:
                            System.out.println("Saliendo del menu de modificación. ☺");
                            break;
                        default:
                            System.out.println("Opción incorrecta. Gay");
                            break;
                    }

                } while (menu != 0);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void editar(entiLibros libro) {
        Dao.editar(libro);
    }
}