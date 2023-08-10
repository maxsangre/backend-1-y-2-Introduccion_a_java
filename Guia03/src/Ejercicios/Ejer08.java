
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejer08 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*        *
*        *
* * * *

     */

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese el tamaño del Cuadrado");
             int num = leer.nextInt();
             for (int i = 0; i < num ; i ++){
             for(int j = 0; j < num ; j ++){
             if(i==0 || j ==0 || j==num -1 || i==num-1){
             System.out.print("*");
             }else{
                 System.out.print(" ");
             }
             }
             System.out.println();
             }
    }
}
                     


