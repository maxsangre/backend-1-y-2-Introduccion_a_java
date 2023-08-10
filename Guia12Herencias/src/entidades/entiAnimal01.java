/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Sangre
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
* Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá 
* mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main 
* que realice lo
siguiente:
 */
public class entiAnimal01 {
       protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public entiAnimal01() {
    }

    public entiAnimal01(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void alimentarse() {
        System.out.println("El animal se alimenta de " + alimento);
    }
}

