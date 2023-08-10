/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.entiEstudiante;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sangre
 * Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. La escuela
     * nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber que alumnos han
     * recibido una nota por encima de ese promedio.
     * 
     * Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos van a ser nombre y nota (representando
     * la nota obtenida en el final).
     * 
     * La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
     * 
     * Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objeto tipo estudiante, usando
     * ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
     * 
     * 1. Calcular y mostrar el promedio de notas de todo el curso
     * 
     * 2. Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso.
     * 
     * 3. Por ultimo, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
     * 
     * Nota: para crear un vector de objeto la definicion es la siguiente:
     * 
     * Objeto nombreVector[] = new Objeto[];
 */
public class servEstudiante {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public entiEstudiante cargarEstudiantes(entiEstudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
            estudianteObj[i] = new entiEstudiante();
            Random r = new Random();
            System.out.println("Ingrese el nombre del estudiante numero " + (i + 1) + ":");
            estudianteObj[i].setNombre(leer.next());
//            leer.nextLine();
            System.out.println("Nota del estudiante:");
//            estudianteObj[i].setNota(leer.nextFloat());
            estudianteObj[i].setNota(r.nextFloat());
            System.out.println(estudianteObj[i].getNota());
            System.out.println();
        }
        return new entiEstudiante();
    }

    public void mostrarEstudiantes(entiEstudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
//            System.out.println(estudianteObj[i].toString());
            System.out.println("Nombre :" + estudianteObj[i].getNombre() + "  |  Nota: " + estudianteObj[i].getNota());
        }
    }

    public double calcularPromedio(entiEstudiante[] estudianteObj) {
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < estudianteObj.length; i++) {
            suma += estudianteObj[i].getNota();
        }
        promedio = suma / estudianteObj.length;

        return promedio;
    }

    //Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso
    public String[] obtenerAlumnosNotaMayorPromedio(entiEstudiante[] estudianteObj) {
        int cont = 0;
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > calcularPromedio(estudianteObj)) {
                cont++;
            }
        }
        String[] alumnos = new String[cont];
        int j = 0;
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > calcularPromedio(estudianteObj)) {
                alumnos[j] = estudianteObj[i].getNombre();
                j++;
            }
        }
        return alumnos;
    }

    //Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    public void mostrarAlumnosNotaMayorPromedio(entiEstudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > calcularPromedio(estudianteObj)) {
                System.out.println(estudianteObj[i].getNombre() + ", " + estudianteObj[i].getNota());
            }
        }
    }

}

