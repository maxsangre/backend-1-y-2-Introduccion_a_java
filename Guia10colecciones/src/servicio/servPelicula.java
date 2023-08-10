/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiPelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Sangre
 */
public class servPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<entiPelicula> films = new ArrayList();
entiPelicula pep = new entiPelicula();
    public void crearpelicula() {
        boolean arbitro = false;
        String Arbitro2;
        while (arbitro == false) {
            entiPelicula pe = new entiPelicula();
            System.out.print("ingrese titulo de la pelicula:");
            pe.setTitulo(leer.next());
            System.out.print("ingrese Director de la pelicula:");
            pe.setDirector(leer.next());
            System.out.print("ingrese Duracion de la pelicula:");
            pe.setDuracion(leer.nextFloat());
            films.add(pe);
            System.out.println("para segir agregando presione cualquier tecla;"
                    + "\n para finalizar presione N");
            Arbitro2 = leer.next();
            if (Arbitro2.equalsIgnoreCase("N")) {
                arbitro = true;
            }
        }
    }

    public void mostrar() {
        for (entiPelicula aux : films) {
            System.out.println(aux.toString());
        }
    }

    public void mostrarHora() {
        for (entiPelicula aux : films) {
            if (aux.getDuracion() > 1) {
                System.out.println(aux.toString());
            }
        }
    
    }
     
    public void ordenarMayor() {
        Comparator<entiPelicula> Arbitro=Comparator.comparing(entiPelicula::getDuracion);
        Collections.sort(films,Arbitro.reversed());
        mostrar();
    }

    public void ordenarMenor() {
        Comparator<entiPelicula> Arbitro=Comparator.comparing(entiPelicula::getDuracion);
        Collections.sort(films,Arbitro);
        mostrar();
    }
      public void ordenarTitulo() {
        Comparator<entiPelicula> Arbitro=Comparator.comparing(entiPelicula::getTitulo);
        Collections.sort(films,Arbitro);
        mostrar();
    }
      
         public void ordenarDirector() {
        Comparator<entiPelicula> Arbitro=Comparator.comparing(entiPelicula::getDirector);
        Collections.sort(films,Arbitro);
        mostrar();
    }
}
