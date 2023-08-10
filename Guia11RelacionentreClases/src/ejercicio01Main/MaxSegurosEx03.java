
import ejerciciosServicios.servSeguroEx03;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class MaxSegurosEx03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servSeguroEx03 seguroService = new servSeguroEx03();

        int menu = 0;
        do {
            System.out.println("▄");
            System.out.println("▄");
            
            
            
            System.out.println("Max Te Asegura la Vida!!! Pa..");
            System.out.println("--------------------------");
            System.out.println("Elegi una opcion Gato/a: ");
            System.out.println("-----------------------");
            System.out.println("1. Cargar Clientes");
            System.out.println("2. Cargar Vehiculos");
            System.out.println("3. Crear Seguros(Poliza)");
            System.out.println("4. Mostrar Seguros");
            System.out.println("5. Mostrar Clientes");
            System.out.println("6. Mostrar Vehiculos");
            System.out.println("7. Gestion de Cuotas");
            System.out.println("8. Salir");
            System.out.println("--------------------------");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    seguroService.cargarClientes();
                    break;
                case 2:
                    seguroService.cargarVehiculos();
                    break;
                case 3:
                    seguroService.crearSeguros();
                    break;
                case 4:
                    seguroService.mostrarSeguros();
                    break;
                case 5:
                    seguroService.mostrarClientes();
                    break;
                case 6:
                    seguroService.mostrarVehiculos();
                    break;
                case 7:
                    seguroService.gestionarCuotas();
                    break;
                case 8:
                    System.out.println("Saliendo...Gracias por confiar en mi.");
                    break;
                default:
                    System.out.println("Opcion incorrecta no seas Gil..");
                    break;
            }
        } while (menu != 8);
    }
}
    


