/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiAlumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sangre
 *  Crear una clase llamada Alumno que mantenga información sobre las
 * notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista 
* de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
* Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno 
* y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular 
* su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
* Dentro
del método se usará la lista notas para calcular el promedio final de alumno.
* Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class servAlumno {
    
  public void crearAlumnos(ArrayList<entiAlumno> alumnos) {

        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = scanner.next();
            ArrayList<Integer> Notas = new ArrayList<>();
            System.out.println("Ingrese las notas del alumno");
            for (int i = 0; i < 3; i++) {
                Notas.add(scanner.nextInt());
            }
           entiAlumno alumno = new entiAlumno(nombre, Notas);
            alumnos.add(alumno);
            System.out.println("Desea agregar otro alumno? (s/n)");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));


    }

    public void mostrarAlumnos(ArrayList<entiAlumno> alumnos) {
        for (entiAlumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void notaFinal(ArrayList<entiAlumno> alumnos) {
        System.out.println("Ingrese el nombre del alumno a obtener promedio:");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.next();
        int promedio = 0;
        boolean encontrado = false;
        for (entiAlumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for (int nota : alumno.getNotas()) {
                    promedio += nota;                }
                System.out.println("El promedio del alumno es: " + promedio / 3);
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no existe");
        }
    }

    public void eliminarAlumno(ArrayList<entiAlumno> alumnos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a eliminar:");
        String nombre = scanner.next();
        boolean encontrado = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                alumnos.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Entidades.Alumno eliminado!");
        } else {
            System.out.println("No existe el alumno!!!");
        }
    }

    public void modificarAlumno(ArrayList<entiAlumno> alumnos) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = leer.nextLine();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) ;
            {
                System.out.println("Nuevo nombre:");
                String nuevoNombre = leer.nextLine();
                alumnos.get(i).setNombre(nuevoNombre);
            }
        }
    }

    public void modificarNotaExistente(ArrayList<entiAlumno> alumnos) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno a modificar:");
        String nombre = leer.nextLine();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre)) ;
            {
                System.out.println("Ingrese la posicion de la nota a modificar");
                int posicion = leer.nextInt();
                System.out.println("Ingrese la nueva nota:");
                int nota = leer.nextInt();
                alumnos.get(i).getNotas().set(posicion, nota);
            }
        }
    }
}