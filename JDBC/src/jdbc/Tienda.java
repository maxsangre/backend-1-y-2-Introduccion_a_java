
import java.util.Scanner;
import servicio.servFabricante;
import servicio.servProducto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Tienda {

    /**
     * @param args the command line arguments
     */

   
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servProducto max1 = new servProducto();
        servFabricante  max2 = new servFabricante();
        int menu = 0;
        do {
            System.out.println("==//== Tienda Max ==//==");
            System.out.println("========================");
            System.out.println("");
            System.out.println("1.Mostrar productos");
            System.out.println("2.Mostrar productos con precio ");
            System.out.println("3.Mostrar productos con precio entre MAX1 y MAX2");
            System.out.println("4.Listar Portatiles");
            System.out.println("5.Listar producto mas barato");
            System.out.println("6.Ingresar producto");
            System.out.println("7.Ingresar Fabricante");
            System.out.println("8.Modificar producto");
            System.out.println("0.Salir");
            System.out.println();
            menu = leer.nextInt();
            switch (menu){
                case 1:
                    max1.mostrarProductos();
                    break;
                case 2:
                    max1.mostrarNompre();
                    break;
                case 3:
                    max1.mostrarEntre(120,202);
                    break;
                case 4:
                    max1.listarPortatiles();
                    break;
                case 5:
                    max1.listarProductoMasBarato();
                    break;
                case 6:
                    max1.ingresarProducto();
                    break;
                case 7:
                    max2.insertarFabricante();
                    break;
                case 8:
                    max1.modificarProducto();
                    break;
                    case 0:
                        System.out.println("Hasta luego Marica");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida no seas Garca");
                        break;
            }
        }while (menu != 0);
    }
}
    


