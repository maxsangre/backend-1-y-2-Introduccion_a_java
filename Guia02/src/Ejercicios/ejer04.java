/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Sangre
 * Dada una cantidad de grados centígrados se debe mostrar su
 * equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados: ");
        int gradosC = leer.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);
        System.out.println("Los grados Fahrenheit son: " + gradosF);
    }
    
}
