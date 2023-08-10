
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejerc02 {

    /**MaxSangre
     * @param args the command line arguments
     *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario
     * un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra 
     * repetido
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int contador = 0;
        System.out.println("ingrese tamaño del vector");
        int n = leer.nextInt();
        System.out.println("ingrese numero a buscar");
        int buscar = leer.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * (10 - 1) + 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("[" + vector[i] + "]");
        }

        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                System.out.println("su numero se encuentra en la posicion " + i);
                contador++;
            }
        }
            if (contador > 0) {
                System.out.println("su numero se repite " + contador + " veces");
            } else {
                System.out.println(" su numero no se encuentra");
            }
        
    }
}
    


