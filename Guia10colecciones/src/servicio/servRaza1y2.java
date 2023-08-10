/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sangre
 * ejercicio 1
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El programa 
 * pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 * ejercicio 2
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
public class servRaza1y2 {

    public ArrayList<String> raza ;
Scanner leer = new Scanner (System.in);
    public servRaza1y2() {
        this.raza=new ArrayList();
    }

    
    
    
    public void crearRaza() {
       boolean continuar=true;
       while(continuar){
           System.out.println("Ingrese una raza");
           raza.add(leer.nextLine());
           System.out.println("¿Desea agregar otra raza (S/N)");
           continuar=leer.nextLine().equalsIgnoreCase("S");
           
       }
       
    }
    public void mostrarRaza(){
        System.out.println("Razas de sobreviviente");
        for(String max:this.raza){
            System.out.println(max);
            
        }
       
    }
    public void eliminarRaza( ){
        System.out.println("Ingrese el perro a matar");
        String razas=leer.nextLine();
        Iterator<String> it=raza.iterator();
        boolean eliminada =false;
        while(it.hasNext()){
            String aux=it.next();
            if(aux.equalsIgnoreCase(razas)){
                it.remove();
                eliminada=true;
            }
        }
        
        if (eliminada){
    System.out.println("Raza eliminada");
        }else{
        System.out.println("la raza no se encontro gil..");
    }
    
    raza.sort(null);
    }
}
