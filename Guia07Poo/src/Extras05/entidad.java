/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras05;

/**
 *
 * @author Sangre
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método
 * "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 * 
 */
public class entidad {
      private String nombre;
    private int edad;
    private double salario;

    public entidad() {
    }

    public entidad(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        
        return "entidad{" +
                "nombre = '" + nombre  + ", edad = " + edad +  ", salario = " + salario + '}';
    }

    public entidad calcularAumento(entidad entidad) {
        if (entidad.getEdad() > 30) {
            
            entidad.setSalario(salario * 1.10);
        } else {
            entidad.setSalario(salario * 1.05);
        }
        return entidad;
    }

}

