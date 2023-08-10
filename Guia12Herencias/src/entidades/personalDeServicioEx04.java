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

    public class personalDeServicioEx04 extends entiEmpleadosEx04 {
    //hay que conocer a qué sección están asignados
    //(biblioteca, decanato, secretaría, ...).
    protected String seccion;

    public personalDeServicioEx04() {
    }

    public personalDeServicioEx04(String nombre, String apellidos, int identificacion, String estadoCivil, int anioIncorp, int numDespacho, String seccion) {
        super(nombre, apellidos, identificacion, estadoCivil, anioIncorp, numDespacho);
        this.seccion = seccion;
    }

    

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    //• Traslado de sección de un empleado del personal de servicio.
    public void trasladarSeccion() {
        System.out.println("Ingrese la nueva seccion:");
        this.seccion = leer.next();
    }

    @Override
    public String toString() {
        return
                "Nombre" + nombre + '\'' +
                        ", Apellidos " + apellidos + '\'' +
                        ", Identificacion " + identificacion +
                        ", Estado Civil " + estadoCivil + '\'' +
                        ", Seccion " + seccion + '\'' +
                        ", Anio De Incorporacion " + anioIncorp +
                        ", NumDespacho " + numDespacho;
    }
}

