package Ejercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejerc04 {

    /**
     * @param args the command line argumentswdqwqwqee
     */

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                int num = leer.nextInt();
            if(num==1 || num==0){
                System.out.println("Deja de joder");
            }else{
                 if(conversorDePrimos(num) == true){
                     System.out.println("Tu numero es primo");
                 
            }else{
                     System.out.println("Tu numero NO es primo");
                 }
                
               
                
            } 
    }
public static boolean conversorDePrimos(int num){ 
for (int i=2 ; i<num ; i++) {
if(num%i==0)
return false;
}
return true;
}

}
    


