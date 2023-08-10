/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Sangre
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A 
 * continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
public class entidad {
     public entidad() {
    }

    
    private float radio; 

    public entidad(float radio) {
        this.radio = radio;
    }

    public static void main(String[] args) {

    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio: "); this.setRadio(leer.nextFloat());
    }
    
    public void area(){
       float area = (float) (Math.PI*(Math.pow(this.radio, 2)));
      
        System.out.println("El área del círculo es: " + area);
    }
    
    public void perimetro(){
        float Perimetro = (float) (2*Math.PI*this.radio);
        System.out.println("El perimetro del círculo es: " + Perimetro);
    }
}

