/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Sangre
 */

    public class entiPersonaEx04 {
    //Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
    //identificación y su estado civil.
    protected String nombre;
    protected String apellidos;
    protected int identificacion;
    protected String estadoCivil;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public entiPersonaEx04() {
    }

    public entiPersonaEx04(String nombre, String apellidos, int identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil() {
        System.out.println("Ingrese el nuevo estado civil: ");
        String estadoCivil = leer.next();
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificacion=" + identificacion +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}

