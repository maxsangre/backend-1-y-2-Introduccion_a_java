
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejer06 {

    /**MaxSangre
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre
     * por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá 
     * mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse
     * hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
     * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
     * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
     * del programa, caso contrario se vuelve a mostrar el menú.
     */

    
    
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese dos numeros enteros Positivo:");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        boolean salir = false;
        while (!salir) {
        System.out.println("Ingrese una opción");
        System.out.println("opción 1 Sumar");
        System.out.println("opción 2 Restar");
        System.out.println("opción 3 Multiplicar");
        System.out.println("opción 4 Dividir");
        System.out.println("opción 5 Salir");
       try {
        int opcion = leer.nextInt(); 
        switch (opcion) {
        case 1: System.out.println("*************** LA SUMA ES:" + (numero1+numero2)+ " ************");
        break;
        case 2: System.out.println("*************** LA RESTA ES: " + (numero1-numero2)+ " ************");
        break;
        case 3: System.out.println("*************** LA MULTIPLICACION ES: " + (numero1*numero2)+ " ************");
        break;
        case 4: System.out.println("*************** LA DIVISION: " + (numero1/numero2)+ " ************");
        break;
        case 5: System.out.println("Esta seguro que desea salir ?  SI = 1 / No = 2 ");
        
                     int numero = leer.nextInt();
              
                     if (numero == 1) { 
                            System.out.println("      ************  GRACIAS  *************               "); 
                            salir=true;
                            break;}
                     else { }
                     break;
               default: System.out.println("Las opciones son del 1 al 5 ");
        }
        }catch(InputMismatchException e) {
            System.out.println("Debes ingresar un numero ");
            leer.next();}
        }
            
        }
        
        }
    

     