/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.entiAlojamientoEx03;
import entidades.entiCampingEx03;
import entidades.entiHotelEx03;
import entidades.entiResidenciaEx03;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */

    public class servAlojamientoEx03 {

    public void menu(ArrayList<entiAlojamientoEx03> alojamientos) {
    }
    /**
     * Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
     * • todos los alojamientos.
     * • todos los hoteles de más caro a más barato.
     * • todos los campings con restaurante
     * • todos las residencias que tienen descuento.
     */
        
public class servAlojamiento {
    public void menu(ArrayList<entiAlojamientoEx03> alojamientoArrayList) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Todos los alojamientos");
            System.out.println("2. Todos los hoteles de más caro a más barato");
            System.out.println("3. Todos los campings con restaurante");
            System.out.println("4. Todos las residencias que tienen descuento");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Todos los alojamientos");
                    mostrarAlojamientos(alojamientoArrayList);
                    break;
                case 2:
                    System.out.println("Todos los hoteles de más caro a más barato");
                    hotelesMasCarosAMasBaratos(alojamientoArrayList);
                    break;
                case 3:
                    System.out.println("Todos los campings con restaurante");
                    campingsConRestaurante(alojamientoArrayList);
                    break;
                case 4:
                    System.out.println("Todos las residencias que tienen descuento");
                    residenciasConDescuento(alojamientoArrayList);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (menu != 5);
    }

    private void residenciasConDescuento(ArrayList<entiAlojamientoEx03> alojamientoArrayList) {
        for (entiAlojamientoEx03 alojamiento : alojamientoArrayList) {
            if (alojamiento instanceof entiResidenciaEx03) {
                if (((entiResidenciaEx03) alojamiento).isDescuentos())
                    System.out.println(alojamiento.getNombre());
            }
        }
    }


    private void campingsConRestaurante(ArrayList<entiAlojamientoEx03> alojamientoArrayList) {
        for (entiAlojamientoEx03 alojamiento : alojamientoArrayList) {
            if (alojamiento instanceof entiCampingEx03) {
                if (((entiCampingEx03) alojamiento).isPoseeRestaurante()) {
                    System.out.println(alojamiento.getNombre());
                }
            }
        }
    }


    private void hotelesMasCarosAMasBaratos(ArrayList<entiAlojamientoEx03> alojamientoArrayList) {
        ArrayList<entiHotelEx03> hoteles = new ArrayList<>();
        for (entiAlojamientoEx03 alojamiento : alojamientoArrayList) {
            if (alojamiento instanceof entiHotelEx03) {
                hoteles.add((entiHotelEx03) alojamiento);
            }
        }
        hoteles.sort(Comparator.comparing(entiHotelEx03::getPrecioHabitaciones).reversed());
        for (entiHotelEx03 hotel : hoteles) {
            System.out.println("*************************");
            System.out.println("Nombre Hotel:\n" + hotel.getNombre());
            System.out.println("Precio Habitaciones:\n" + hotel.getPrecioHabitaciones());

        }
    }

    private void mostrarAlojamientos(ArrayList<entiAlojamientoEx03> alojamientoArrayList) {
        for (entiAlojamientoEx03 alojamiento : alojamientoArrayList) {
            System.out.println(alojamiento.getNombre());
        }
    }
    }
}


 
