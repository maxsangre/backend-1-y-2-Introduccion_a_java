
import java.util.Random;
import java.util.Scanner;
import servicio.servArreglos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class arreglos {

    /**MaxSangre
     * @param args the command line arguments
     * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
     * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10
* posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

     */

   
     static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        servArreglos as = new servArreglos();
        
        double arrayA[] = new double[50];
        double arrayB[] = new double[20];

        as.inicializarA(arrayA, rand);
        
     //  as.mostrar(arrayA);
     //  as.ordenar(arrayA);
      // as.mostrar(arrayA);
        as.inicializarB(arrayA, arrayB);
        as.mostrar(arrayA);
        as.mostrar(arrayB);
    }
    }


