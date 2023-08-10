package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra04 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
     * y se muestre su equivalente en romano.
     * MaxSangre
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = leer.nextInt();

        if (numero >= 1 && numero <= 10) {
            if (numero == 1) {
                System.out.println("I");
            } else if (numero == 2) {
                System.out.println("II");
            } else if (numero == 3) {
                System.out.println("III");
            } else if (numero == 4) {
                System.out.println("IV");
            } else if (numero == 5) {
                System.out.println("V");
            } else if (numero == 6) {
                System.out.println("VI");
            } else if (numero == 7) {
                System.out.println("VII");
            } else if (numero == 8) {
                System.out.println("VIII");
            } else if (numero == 9) {
                System.out.println("IX");
            } else if (numero == 10) {
                System.out.println("X");
               
                
                
            }
        }

    }
}
    


