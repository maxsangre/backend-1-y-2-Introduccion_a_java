package EjerGuia;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejer01 {

    /**
     * @param args the command line arguments
     * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
     * y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cant de compañeros:");
        int n = leer.nextInt();
        n = n - 1;

        String[] equipo = new String[n];
        System.out.println("Ingrese los nombres:");

        for (int i = 0; i < n; i++) {
            equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(equipo[i]);
        }
    }
}
    


