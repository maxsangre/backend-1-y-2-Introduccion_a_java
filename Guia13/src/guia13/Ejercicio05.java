
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejercicio05 {

    /**
     * @param args the command line arguments
     * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
     * 
     */

    public static void main(String[] args) {
     Random max=new Random();
     int numeroAdivinar=max.nextInt(500)+1;
     System.out.println("Numero Secreto "+ numeroAdivinar);
     int intentos=0;
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     System.out.println("Bienvenido al juego de max");
     System.out.println("Intenta adivinar un numero de 1 al 500 Gil");
     
     while(true){
         System.out.println("Pone un numero che..");
         try{
             int numeroUsuario=leer.nextInt();
             intentos++;
             if(numeroUsuario==numeroAdivinar){
                 System.out.println("La pegaste!!");
                 System.out.println("Cantidad de intentos: "+intentos);
                 break;
             }else{
                 System.out.println("No adivinaste Bobo");
             }
         }catch (InputMismatchException a){
             System.out.println("Eso no es un numero Gil/Volve a la primaria");
             intentos++;
             leer.next();
             }
     }
         }
}


     
     
     
     
    


