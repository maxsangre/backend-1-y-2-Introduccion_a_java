/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Sangre
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 
* 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
public class servArreglos {
    public void inicializarA(double a[], Random rand){
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100)+1;
        }
    }
    
    public void mostrar(double a[]){
        System.out.println(Arrays.toString(a)); 
    }
//    3-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double a[]){
        Arrays.sort(a);
        
        for (int i = 0; i < a.length/2; i++) {
            double max = a[i];
            a[i] = a[a.length - 1 -i];
            a[a.length -1 -i] = max;
        }
    }
    
//4-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    public void inicializarB(double a[], double b[]){
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 10, 20, 0.5);
    }
}
