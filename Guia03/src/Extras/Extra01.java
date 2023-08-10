package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra01 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas.
     * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
     * equivalente: 1 día, 2 horas.
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int min = leer.nextInt();
        int dias = min/(24*60);
        int horas = min%(24*60)/60;
        System.out.println(min + "minutos equivalentes a " + dias + "dias y " + horas + "horas.");
    }
}

    


