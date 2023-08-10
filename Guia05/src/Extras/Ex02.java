package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ex02 {

   

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
      /**MaxSangre
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
        System.out.println("Ingrese el tamaño de los vectores:");
        int max = leer.nextInt();
        int[] v1 = new int[max];
        int[] v2 = new int[max];
        
        System.out.println("Ingrese los valores del vector 1:");
        for (int i = 0; i < max; i++) {
            v1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2:");
        for (int i = 0; i < max; i++) {
            v2[i] = leer.nextInt();
        }
        //Comparar Vectores
        boolean sonIguales = true;
        for (int i = 0; i < max; i++) {
            if (v1[i] != v2[i]) {
                System.out.println("Los vectores NO son iguales!NOP!");
                sonIguales = false;
                break;
            }
        }
        if (sonIguales) {
                
            System.out.println("Los vectores son iguales!SIP!");
        }
    }
}
    


