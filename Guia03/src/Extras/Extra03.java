package Extras;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra03 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese una letra y se
     * detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
     * Nota: investigar la función equals() de la clase String.
     */

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
String letra = ".";
System.out.println("Ingrese una letra");
letra = leer.nextLine();
letra = ("saliendo del programa");

    do {    
if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
    System.out.println("Es una vocal");
}else{
 System.out.println("no es una vocal");  
}
    }while(!letra.equalsIgnoreCase("."));
   
    }
}




        
                
    
    






    
    
