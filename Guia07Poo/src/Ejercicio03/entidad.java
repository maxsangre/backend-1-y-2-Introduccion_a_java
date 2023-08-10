/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Sangre
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben
 * crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método 
* devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método 
* devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
public class entidad {
      private float max1;
    private float max2;

    public entidad() {
    }

    public float getMax1() {
        return max1;
    }

    public void setMax1(float max1) {
        this.max1 = max1;
    }

    public float getMax2() {
        return max2;
    }

    public void setMax2(float max2) {
        this.max2 = max2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros por favor: "); 
        setMax1(leer.nextFloat());
        setMax2(leer.nextFloat());
    }
    
    public float sumar(){
        float suma = this.max1 + this.max2;
        System.out.println("La suma de los dos valores es: " + suma);
        return suma;
    }
    
    public float restar(){
        float resta = this.max1 - this.max2;
        System.out.println("La resta de los dos valores es: " + resta);
        return resta;
    }
    
    public float multiplicar(){
        float v3 = 0;
        if (this.max1 == 0 || this.max2 == 0) {
            System.out.println("Uno de los dos valores es 0 por lo que el resultado es: 0");
        }else{
        v3 = this.max1 * this.max2;
        System.out.println("La multiplicacion de los dos valores es: " + v3);
        }
        return v3;
    }
    
     public float dividir(){
        float div = 0; float max1 = this.max1; float max2 = this.max2;
        if (this.max1 == 0 || this.max2 == 0) {
            System.out.println("Uno de los dos valores es 0, no sea GIL no se puede dividir");
        }else{
        div = max1 / max2;
        System.out.printf("La divicion de los dos valores es: %.2f \n", div);
        }
        return div;
    }
}

