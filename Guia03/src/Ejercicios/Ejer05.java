
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejer05 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor
     * límite positivo, y a continuación solicite números al usuario 
     * hasta que la suma de los números introducidos supere el límite inicial.
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      System.out.println("define el limite");
              
              int limite = leer.nextInt();
              int suma = 0;
              
              System.out.println("Ingrese Numeros para sumar");
              
              do{
                  suma = suma + leer.nextInt();
                                
              } while(suma <= limite);
              
              System.out.println("Se paso del limite");
              System.out.println("Total de la Suma: " + suma);
              System.out.println("Se Paso por: " + (suma - limite));
    }

}

        
        
        
        
        
        
        
        
        
        
    


