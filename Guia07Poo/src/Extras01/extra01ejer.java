
import Extras01.entidad;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra01ejer {

    /**MaxSangre
     * @param args the command line arguments
     * Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además 
     * dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como
     * parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
     */

    public static void main(String[] args) {
    
           Scanner leer = new Scanner(System.in);
        entidad max1 = new entidad("Cancion - Cruel", "Autor - Los Piojos");
        System.out.println(max1.getTitulo() + " / " + max1.getAutor());

        entidad max2 = new entidad();
        System.out.println("Ingrese el Titulo de la cancion Deseada, para reproducir");
        
        max2.setTitulo(leer.nextLine());
        System.out.println("Ingrese el Autor de la cancion");
        max2.setAutor(leer.nextLine());

        System.out.println("Cancion - "+max2.getTitulo() + " / " + "Autor - "+max2.getAutor());

     
    }
}