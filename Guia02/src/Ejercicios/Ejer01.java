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
 * Escribir un programa que pida dos números enteros por teclado 
 * y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros por teclado");
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        System.out.println( "La suma de ambos numeros es:" + (num3 + num4));
        
    }
    }

