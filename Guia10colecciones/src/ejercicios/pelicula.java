
import servicio.servPelicula;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class pelicula {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     
         // Pelicula pe =new Pelicula();
          servPelicula p1=new servPelicula();
          p1.crearpelicula();
          System.out.println("mostrar pelis \n");
          p1.mostrar();
          System.out.println("mostar mayor a 1 hora \n");
          p1.mostrarHora();
          System.out.println("ordenar mayor a nemor \n");
          p1.ordenarMayor();
          System.out.println("-----ordenado menor a mayor------ \n");
          p1.ordenarMenor();
          System.out.println("ordenar por director \n");
          p1.ordenarDirector();
          System.out.println("ordenar por titulo \n");
          p1.ordenarTitulo();
    }
    }


