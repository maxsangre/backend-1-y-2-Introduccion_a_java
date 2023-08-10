
import entidades.entiAlojamientoEx03;
import entidades.entiCampingEx03;
import entidades.entiHotel4EstrellasEx03;
import entidades.entiHotel5EstrellasEx03;
import entidades.entiResidenciaEx03;
import java.util.ArrayList;
import servicios.servAlojamientoEx03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class AlojamientoEx03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
          ArrayList<entiAlojamientoEx03> alojamientos = new ArrayList<>();
        entiHotel4EstrellasEx03 hotel4 = new entiHotel4EstrellasEx03("Hotel 4 Estrellas", "Calle La Goondrina 3764", "Buenos Aires", "Max", 2, 2, 3, 50, "A", "Restaurante 4 Estrellas", 20);
        entiHotel5EstrellasEx03 Hotel5 = new entiHotel5EstrellasEx03("Hotel 5 Estrellas", "Calle El Benteveo 3221", "Varela", "Nachito", 5, 2, 5, 50, "A", "Restaurante 4 Estrellas", 40, 2, 3, 10);
        hotel4.crearHotelCuatroEstrellas();
        Hotel5.crearHotelCincoEstrellas();
        hotel4.calcularPrecioHabitacion();
        Hotel5.calcularPrecioHabitacion();
        alojamientos.add(hotel4);
        alojamientos.add(Hotel5);
        
        System.out.println(hotel4);
        System.out.println(Hotel5);
        
        entiCampingEx03 camping1 = new entiCampingEx03("Camping 1", "Calle Rosa Meltrozo 5321", "Jujuy", "Alcides", 100, 20, true);
       camping1.crearCamping().getCapacidadMaximaCarpas();
     
        camping1.getCantidadBanos();
      
               
        alojamientos.add(camping1);
       
        
        System.out.println(camping1);
       
        
        entiResidenciaEx03 residencia1 = new entiResidenciaEx03("Residencia 1", "Calle Telechea 7611 ", "Catamarca", "Gustavo", 5, true, false);
       residencia1.crearResidencia();
      
        residencia1.getHabitaciones();
              
        alojamientos.add(residencia1);
        
System.out.println(residencia1);

        
servAlojamientoEx03 alojamientoService = new servAlojamientoEx03();
       alojamientoService.menu(alojamientos);
       
    }
}
