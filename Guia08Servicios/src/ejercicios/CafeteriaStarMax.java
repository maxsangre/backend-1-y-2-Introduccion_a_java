package ejercicios;


import entidades.entiCafetera;
import java.util.Scanner;
import servicios.ServCafetera;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class CafeteriaStarMax {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        ServCafetera servicio = new ServCafetera();
        entiCafetera cafetera = new entiCafetera(6000, 2500);


        int menu = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println(  "  == StarMax ==");
            System.out.println("       MENU");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Estado actual de la cafetera");
            System.out.println("6. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    cafetera.setCantidadActual(servicio.llenarCafetera(cafetera));
                    break;
                case 2:
                    servicio.servirTaza(cafetera);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    break;
                case 4:
                    servicio.agregarCafe(cafetera);
                    break;
                case 5:
                    System.out.println("Capacidad maxima: " + cafetera.getCapacidadMaxima());
                    System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
                    break;
                case 6:
                     System.out.println("==Gracias por Elegirme..==");
                      System.out.println(" ==StarMax==");
                    break;
            
            }
        } while (menu != 6);{
      
    }
}
    
}
    


