/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

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
 */
public class entiEstudiante {
     private String nombre;
    private float nota;

    public entiEstudiante() {
    }

    public entiEstudiante(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}

