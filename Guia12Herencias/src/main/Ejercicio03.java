
import entidades.entiElectrodomestico02;
import entidades.entiLavadora02;
import entidades.entiTelevisor02;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    
        ArrayList<entiElectrodomestico02> electrodomesticoArrayList = new ArrayList<>();
      entiLavadora02 lavadora1 = new entiLavadora02(1000d, "Blanco", 'A', 80d, 15);
        entiLavadora02 lavadora2 = new entiLavadora02(1500d, "Negro", 'F', 60d, 10);
        entiTelevisor02 televisor1 = new entiTelevisor02(500d, "Gris", 'B', 15d, 32, true);
       entiTelevisor02 televisor2 = new entiTelevisor02(500d, "Negro", 'C', 10d, 24, false);
       electrodomesticoArrayList.add(lavadora1);
        electrodomesticoArrayList.add(lavadora2);
       electrodomesticoArrayList.add(televisor1);
        electrodomesticoArrayList.add(televisor2);

    double lavadoras = 0;
      double televisores = 0;
     for (entiElectrodomestico02 electrodomesticoobj : electrodomesticoArrayList) {
          
      electrodomesticoobj.precioFinal();
       if (electrodomesticoobj instanceof entiLavadora02) {
        System.out.println("Lavadora: " + electrodomesticoobj.getPrecio());
         lavadoras += electrodomesticoobj.getPrecio();
        }
         if (electrodomesticoobj instanceof entiTelevisor02) {
            System.out.println("Televisor: " + electrodomesticoobj.getPrecio());
           televisores += electrodomesticoobj.getPrecio();
        }
        }
        String totales1 = String.format("Total lavadoras: %.2f", lavadoras);
       String totales2 = String.format("Total televisores: %.2f", televisores);
        System.out.println(totales1);
      System.out.println(totales2);
        System.out.println("Total: " + (lavadoras + televisores));
   }
}
    


