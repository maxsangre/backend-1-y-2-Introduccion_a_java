/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sangre
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
public class servPaises {
     public void agregarPaises(HashSet<String> paises) {
        Scanner leer = new Scanner(System.in);
        String pais;
        boolean bandera = true;
        do {
            System.out.println("Ingrese un país: ");
            pais = leer.nextLine();
            paises.add(pais);
            System.out.println("¿Desea agregar otro país? (S/N)");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                bandera = false;
            }
        } while (bandera);
     }

    public void mostrarPaises(HashSet<String> paises) {
        ArrayList<String> paisesList = new ArrayList<>(paises);
        System.out.println("Paises:");
        Collections.sort(paisesList);
//        paisesList.sort(Comparator.naturalOrder());
        for (String paisesordenado : paisesList) {
            System.out.println(paisesordenado);
        }
    }

    public void eliminarPaises(HashSet<String> paises) {
        Iterator<String> it = paises.iterator();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el pais a eliminar: ");
        String pais = leer.nextLine();
        boolean eliminada = false;
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(pais)) {
                it.remove();
                eliminada = true;
            }
        }
        if (eliminada) {
            System.out.println("Pais eliminado");
        } else {
            System.out.println("Pais no encontrado");
        }
    }

}