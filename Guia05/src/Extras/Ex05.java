package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ex05 {



    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
           /**MaxSangre
     * @param args the command line arguments
     * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
     * muestre la suma de sus elementos.
     */
        System.out.println("Ingrese cantidad de filas:");
        int c = leer.nextInt();
        System.out.println("Ingrese cantidad de columnas:");
        int m = leer.nextInt();
        int[][] matriz = new int[c][m];
        int sumaMatriz = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * (10 - 1) + 1);
                sumaMatriz = sumaMatriz + matriz[i][j];

            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("Suma de los elementos: " + sumaMatriz);
    }
}
    
