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
public class entiPersona01 {
  private String nombre;
  private String apellido;
  private int edad;
  private String documento;
  private entiPerro01 perro;

    public entiPersona01() {
    }
  public entiPersona01 (String nombre,String apellido,int edad,String documento,entiPerro01 perro){
      this.nombre=nombre;
  this.apellido=apellido;
  this.edad=edad;
  this.documento=documento;
  this.perro=perro;
  
  } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public entiPerro01 getPerro() {
        return perro;
    }

    public void setPerro(entiPerro01 perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "entiPersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro + '}';
    }
  
}

