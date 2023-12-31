package Extras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra12 {

    /**MaxSangre
     * @param args the command line arguments
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
     * con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E

     */

    public static void main(String[] args) {
      for (int i = 0; i < 1000; i++) { // se itera a través de cada número del 0-0-0 al 9-9-9
            int centenas = i / 100; // se obtiene el dígito de las centenas
            int decenas = (i / 10) % 10; // se obtiene el dígito de las decenas
            int unidades = i % 10; // se obtiene el dígito de las unidades
            String contador = "" + centenas + "-" + decenas + "-" + unidades; // se concatena los dígitos en una cadena
            contador = contador.replace("3", "E"); // se reemplaza cada aparición del número 3 por la letra E
            System.out.println(contador); // se muestra el contador actual
        }
    }
}
    


