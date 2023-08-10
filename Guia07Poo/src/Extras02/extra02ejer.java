
import Extras02.entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra02ejer {

    /**MaxSangre
     * @param args the command line arguments
     * Definir una clase llamada Puntos que contendrá las coordenadas de dos
     * puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar 
     * un objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
     * números y los ingresa en los atributos del objeto. Después, a través de otro método calcular
     * y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
     * Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

     */

    public static void main(String[] args) {
       entidad punto1 = new entidad().crearPuntos();
        System.out.println(entidad.Distancia(punto1));
//        Usando estos valores
//        Deberia dar un valor de 5.00/5.09
//        double x1 = 7;
//        double x2 = 4;
//        double y1 = 5;
//        double y2 = 1;
//        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
    


