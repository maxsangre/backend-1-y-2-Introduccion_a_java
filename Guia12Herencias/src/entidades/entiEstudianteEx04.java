/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Sangre
 */

    public class entiEstudianteEx04 extends entiPersonaEx04 {
    protected String curso;

    public entiEstudianteEx04() {
    }

    public entiEstudianteEx04(String nombre, String apellidos, int identificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Matriculación de un estudiante en un nuevo curso.
    public void matricular() {
        System.out.println("Ingrese el nombre del curso: ");
        curso = leer.next();
    }

    @Override
    public String toString() {
        return
                "Nombre'" + nombre + '\'' +
                        ", Apellidos " + apellidos + '\'' +
                        ", Identificacion " + identificacion +
                        ", EstadoCivil " + estadoCivil + '\'' +
                        ", Curso'" + curso + '\'';
    }
}

