
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejerc05 {

    /**
     * @param args the command line arguments
     * Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz 
     * A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir,
     * A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene 
     * cambiando sus filas por columnas (o viceversa).
     */

    public static void main(String[] args) {
       /*Realice un programa que compruebe si una matriz dada es antisimétrica.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz: ");
        int max = leer.nextInt();

        int[][] matriz = new int[max][max];

        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        //Mostrar matriz
        System.out.println("Matriz 1");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        //Mostrar traspuesta
        System.out.println("Matriz 2");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println("");
        }

        boolean esAntisimetrica = true;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("La matriz ES antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }
}
    


