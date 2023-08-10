package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ex01 {

 

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
         /**MaxSangre
     * @param args the command line arguments
     * ealizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
     * con los valores ingresados por el usuario.
     */
        int suma = 0;
        System.out.print("Ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("Suma del vector: " + suma);
    }
}
    


