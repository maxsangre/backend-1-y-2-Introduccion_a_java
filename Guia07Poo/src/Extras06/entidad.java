/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras06;

import java.util.Scanner;

/**
 *
 * @author Sangre
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule 
 * y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 
 * 4 y 6 y imprime el área del rectángulo.
 */
public class entidad {
    
    private float lado1;
    private float lado2;

    public entidad() {
    }

    public entidad(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "entidad{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
      
    }
          
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer lado: "); this.lado1 = leer.nextInt();
        System.out.println("Ingrese el valor del segundo lado: "); this.lado2 = leer.nextInt();
    }

 
       public float calcular_area(){
        float area = this.lado1 * this.lado2;
        System.out.println("El area de rectangulo es: " + area);
        return area;
    }

}

