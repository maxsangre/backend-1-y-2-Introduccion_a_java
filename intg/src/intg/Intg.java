
import entidad.entiEstudiante;
import java.util.Arrays;
import servicio.servEstudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Intg {

    /**MaxSangre
     * @param args the command line arguments
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
     * ee arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
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
     * 
     */

    public static void main(String[] args) {
       

        servEstudiante servicio = new servEstudiante();
        entiEstudiante[] estudianteObj = new entiEstudiante[8];

        //Cargar alumnos
        servicio.cargarEstudiantes(estudianteObj);
        //Mostrar alumnos
        System.out.println("Alumnos: ");
        servicio.mostrarEstudiantes(estudianteObj);
        System.out.println();
        //Calcular promedio
        System.out.println("Promedio: " + servicio.calcularPromedio(estudianteObj));
        //Obtener alumnos con mayor promedio
        servicio.obtenerAlumnosNotaMayorPromedio(estudianteObj);
        String[] alumnos = servicio.obtenerAlumnosNotaMayorPromedio(estudianteObj);
        //Mostrar alumnos
        System.out.println();
        System.out.println("Alumnos con nota mayor al promedio: ");
        System.out.println(Arrays.toString(alumnos));
        //Mostrar alumnos con nota mayor al promedio
        System.out.println();
        System.out.println("Nombre y Nota:");
        servicio.mostrarAlumnosNotaMayorPromedio(estudianteObj);
    }
}
    


