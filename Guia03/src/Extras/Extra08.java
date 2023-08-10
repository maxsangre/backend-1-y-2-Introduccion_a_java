package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra08 {

    /**MaxSangre
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener
     * la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad
     * de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse.
     * Nota: recordar el uso de la sentencia break.
     */

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int cant = 0;
        System.out.println("Ingrese numeros enteros:");
        do {
            int nums = leer.nextInt();
            if (true) {
                if (nums % 2 == 0 && nums > 0) {
                    par++;
                    cant++;
                } else if (nums % 2 != 0 && nums > 0) {
                    impar++;
                    cant++;
                }
            }
            if (nums % 5 == 0) {
                break;
            }
        } while (true);
        System.out.println("Cantidad de numeros registrados: " + cant);
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}



