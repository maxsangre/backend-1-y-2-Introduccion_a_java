/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosServicios;



import ejercicios.entidades.entiPerro01;
import ejercicios.entidades.entiPersona01;
import java.util.Scanner;

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
public class servAdopcion01 {
    Scanner max = new Scanner(System.in).useDelimiter("\n");
    public entiPersona01 crearPersona(){
        entiPersona01 persona=new entiPersona01();
   System.out.println("Ingrese su Nombre de Pila: ");
   persona.setNombre(max.next());
   System.out.println("Ingrese su Apellido: ");
   persona.setApellido(max.next());
   System.out.println("Ingrese su edad sin Mentir: ");
   persona.setEdad(max.nextInt());
   System.out.println("Ingrese su DNI: ");
   persona.setDocumento(max.next());
   return persona;
    }
    public entiPerro01 crearPerro(){
        entiPerro01 perro=new entiPerro01();
        System.out.println("Ingrese en Nombre del Can: ");
        perro.setNombre(max.next());
        System.out.println("Ingrese la Raza del Can: ");
        perro.setRaza(max.next());
        System.out.println("Ingrese la Edad del Can: ");
        perro.setEdad(max.nextInt());
        System.out.println("Ingrese el Tamaño del Can: ");
        perro.setTamanio(max.next());
        return perro;
            
    } 
}



