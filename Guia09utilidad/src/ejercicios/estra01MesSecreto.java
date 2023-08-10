
import java.util.Scanner;
import servicio.servMesSecreto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class estra01MesSecreto {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        servMesSecreto v1 = new servMesSecreto();
boolean bandera=false;
        do {

            System.out.println("Ingrese el mes secreto: ");
            String mes = leer.nextLine();


                if (mes.equals(v1.getMesSecreto())){
                    System.out.println("encontro el mes secreto");
              bandera =true;
                }else{
                    System.out.println("vuelva a intentarlo");
                }

        } while (!bandera);

    }
}
    


