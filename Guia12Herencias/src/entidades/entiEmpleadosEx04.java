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

    public class entiEmpleadosEx04 extends entiPersonaEx04 {
    //sean del tipo que sean, hay que saber su año de
    //incorporación a la facultad y qué número de despacho tienen asignado.
    protected int anioIncorp;
    protected int numDespacho;

    public entiEmpleadosEx04() {
    }

    public entiEmpleadosEx04(String nombre, String apellidos, int identificacion, String estadoCivil, int anioIncorp, int numDespacho) {
        super(nombre, apellidos, identificacion, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(int anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }
    //Reasignación de despacho a un empleado.

    public void reasignarDespacho() {
        System.out.println("Reasignando despacho");
        System.out.println("Ingrese el nuevo número de despacho");
        numDespacho = leer.nextInt();
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "anioIncorp=" + anioIncorp +
                ", numDespacho=" + numDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificacion=" + identificacion +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}

