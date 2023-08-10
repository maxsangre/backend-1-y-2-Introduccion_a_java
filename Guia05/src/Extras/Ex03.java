package Extras;



import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ex03 {

 

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
         /**MaxSangre
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios, pasándole un 
     * arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
     */
              System.out.print("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] v = new int[n];
        //Llenar
        aleatorio(v);
        //Mostrar
        imprimir(v);

    }

    //Funcion Llenar vector con numeros aleatorios
    public static void aleatorio(int[] v) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(10 - 1) + 1;
        }
    }
    //Funcion imprimir vector

    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + v[i] + "]");
        }
    }
}