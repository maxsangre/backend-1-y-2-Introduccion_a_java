package Ejercicios;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejer01 {

    /**@MaxSangre
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar.
     */

    @SuppressWarnings("empty-statement")
    
    
    public static void main(String[] args)  {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
       
         
        if (num % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es Inpar");
        }
        
        
    }
    }