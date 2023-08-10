
import entidades.entiNIF;
import java.util.Scanner;
import servicios.servNIF;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra02NIF {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     
     Scanner leer = new Scanner(System.in);
    servNIF S1 = new servNIF();
    entiNIF N1 = S1.crearNif();
       S1.mostrar(N1);



    }

}



    



    


