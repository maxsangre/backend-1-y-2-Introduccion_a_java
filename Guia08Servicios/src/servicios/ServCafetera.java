/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.entiCafetera;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class ServCafetera {
       public int llenarCafetera(entiCafetera entiCafetera) {
       System.out.println("Se Completo la Carga.");
          return entiCafetera.getCapacidadMaxima();
        
       
      }

    public void servirTaza(entiCafetera entiCafetera) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza en ml:");
        int taza = leer.nextInt();
        if (taza > entiCafetera.getCantidadActual()) {
            System.out.print("No habia suficiente cafe en la cafetera para llenar la taza, se pudo llenar : " + entiCafetera.getCantidadActual());
            System.out.println(" ml.");
            entiCafetera.setCantidadActual(0);
        } else {
            System.out.println("Se lleno la taza.");
            entiCafetera.setCantidadActual(entiCafetera.getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera(entiCafetera entiCafetera) {
        entiCafetera.setCantidadActual(0);
         System.out.println("La cafetera fue vaciada en su totalidad");
    }

    public void agregarCafe(entiCafetera entiCafetera) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de cafe a agregar:  (en ml)");
        int cafe = leer.nextInt();
        int restante = entiCafetera.getCapacidadMaxima() - entiCafetera.getCantidadActual();
        if (cafe <= restante) {
            entiCafetera.setCantidadActual(entiCafetera.getCantidadActual() + cafe);
             System.out.println("Se agrego la cantidad deseada de cafe. "+ cafe+("ml"));
        } else {
            System.out.println("La cantidad que quiso agregar excede la capacidad de la cafetera.");
        }

    }
}



