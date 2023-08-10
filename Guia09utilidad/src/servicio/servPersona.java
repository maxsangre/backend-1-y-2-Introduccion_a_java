/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiPersona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sangre
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una
 * fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
* Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento
* y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona 
* es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
public class servPersona {
      Scanner leer = new Scanner(System.in);

    public entiPersona crearPersona() {
        /*que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.*/
        System.out.println("Ingrese el nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese fecha de nacimiento aaaa/mm/dd");
        System.out.println("Ingrese el Año: "); 
                int anio = leer.nextInt() - 1900;
                System.out.println("Ingrese el mes: ");
                int mes = leer.nextInt() - 1;
                System.out.println("Ingrese el dia");
                int dia = leer.nextInt();
        Date fechaNacimiendo = new Date(anio, mes, dia);
        return new entiPersona(nombre, fechaNacimiendo);
    }

    public int calcularEdad(entiPersona persona) {
        /*que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.*/
        Date fechaNacimiento = persona.getFechaNacimiento();
        Date fechaActual = new Date();
//        System.out.println(Math.abs(fechaActual.getYear()-persona.getFechaNacimiento().getYear())+" Años");
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
                (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }

    public boolean menorQue(entiPersona persona, int edad) {
        /*Recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.*/
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(entiPersona persona) {
        /*que muestra la información de la persona
deseada.*/
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad:");
        System.out.println(calcularEdad(persona));
        System.out.println("Ingrese una edad para ver si es menor de dicha edad:");
        int edadX = leer.nextInt();
        System.out.println(menorQue(persona, edadX));


    }
}

