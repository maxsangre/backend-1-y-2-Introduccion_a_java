/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.entidades;

/**
 *
 * @author Sangre
 * Realizar un programa para que una Persona pueda adoptar un Perro.
 * Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
* y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, 
* vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por
* ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class entiPerro01 {
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    
    public entiPerro01(){
    }
    
    public entiPerro01(String nombre,String raza,int edad,String tamanio){
    this.nombre=nombre;
    this.raza=raza;
    this.edad=edad;
    this.tamanio=tamanio;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "entiPerro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }

  
    }


