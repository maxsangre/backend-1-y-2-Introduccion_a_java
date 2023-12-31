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

    public class entiResidenciaEx03 extends entiAlojamientoEx03 {
    //Para las residencias se
    //indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
    //campo deportivo.
    protected int habitaciones;
    protected boolean descuentos;
    protected boolean campoDeportivo;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public entiResidenciaEx03() {
    }

    public entiResidenciaEx03(String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
    }

    public entiResidenciaEx03(String nombre, String direccion, String localidad, String gerente, int habitaciones, boolean descuentos, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "habitaciones=" + habitaciones +
                ", descuentos=" + descuentos +
                ", campoDeportivo=" + campoDeportivo +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }

    public entiResidenciaEx03 crearResidencia() {
        System.out.println("Creando Rsidencia");
           System.out.println("Ingrese el nombre de la residencia");
        this.nombre = leer.next();
        System.out.println("Ingrese la direccion de la residencia");
        this.direccion = leer.next();
        System.out.println("Ingrese la localidad de la residencia");
        this.localidad = leer.next();
        System.out.println("Ingrese el gerente de la residencia");
        this.gerente = leer.next();
        System.out.println("Ingrese la cantidad de habitaciones de la residencia");
        this.habitaciones = leer.nextInt();
        System.out.println("Ingrese si posee descuentos a los gremios True/False");
        this.descuentos = leer.nextBoolean();
        System.out.println("Ingrese si posee campo de deportivo true/False");
        this.campoDeportivo = leer.nextBoolean();
        return this;
    }
}


