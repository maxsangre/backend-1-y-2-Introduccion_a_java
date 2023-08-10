
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejer02 {

    /**MaxSangre
     * @param args the command line arguments
     * Crear un programa que pida una frase y si esa frase es igual 
     * a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un
     * mensaje de Incorrecto. Nota: investigar la función equals() en Java.
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una Frase");
        
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("Eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
     
    }

}
