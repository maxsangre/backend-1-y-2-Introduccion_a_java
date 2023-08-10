/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class ejercicio02 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     int[] numeros=new int[5];
     try{
         System.out.println(numeros[10]);
     }catch(ArrayIndexOutOfBoundsException max){
         System.out.println(max.toString());
         System.out.println(max.getMessage());
     }finally{
         System.out.println("*******para vos gato");
     }
    }

}
