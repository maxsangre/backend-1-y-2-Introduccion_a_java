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

    public class entiProfesoresEx04 extends entiEmpleadosEx04 {
    //es necesario gestionar a qué departamento
    //pertenecen (lenguajes, matemáticas, arquitectura, ...).
    protected String departamento;

    public entiProfesoresEx04() {
    }

    public entiProfesoresEx04(String nombre, String apellidos, int identificacion, String estadoCivil, int anioIncorp, int numDespacho, String departamento) {
        super(nombre, apellidos, identificacion, estadoCivil, anioIncorp, numDespacho);
        this.departamento = departamento;
    }

    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //cambio de departamento de un profesor.
    public void cambioDeDepartamento() {
        System.out.println("Ingrese el nuevo departamento:");
        this.departamento = leer.next();
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + '\'' +
                ", Apellidos " + apellidos + '\'' +
                ", Identificacion " + identificacion +
                ", EstadoCivil " + estadoCivil + '\'' +
                ", Departamento " + departamento + '\'' +
                ", Anio De Incorporacion " + anioIncorp +
                ", NumDespacho=" + numDespacho;
    }

}
