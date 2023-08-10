
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class ejercicio03y04 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
     try{
     System.out.println("Ingrese un numero");
     String num1=leer.next();
     System.out.println("ingrese el siguiente numero");
     String num2=leer.next();
     
     
 //    long numero1=Integer.parseInt(num1);
   //  long numero2=Integer.parseInt(num2);
     
      int numero1=Integer.parseInt(num1);
     int numero2=Integer.parseInt(num2);
     
     
         System.out.println(numero1/numero2);
     }catch ( ArithmeticException a){
     System.out.println(a.getMessage());
         System.out.println("No se puede dividir por cero, ");
     //}catch(InputMismatchException b){
         //System.out.println(b.getMessage());
     }catch(NumberFormatException c){
         System.out.println(c.getMessage());
         System.out.println("gay");
     }finally{
         //System.out.println("***ArithmeticException***");
     }
     
        
    }

}
