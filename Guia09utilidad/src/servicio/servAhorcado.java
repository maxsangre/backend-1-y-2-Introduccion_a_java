/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiAhorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servAhorcado {
    Scanner leer = new Scanner(System.in);

    public static void longitud(entiAhorcado juego) {
        /*Muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
        System.out.println("Longitud de la palabra: " + juego.getLongitud());
    }

    public entiAhorcado crearJuego() {
        /*Le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.*/
        entiAhorcado juego1 = new entiAhorcado();
        System.out.println("Ingrese la palabra:");
        String cadena = leer.next();
        //Setear longitud del arreglo
        juego1.setLongitud(cadena.length());
        //Pasar el String cadena dentro del arreglo letra por letra
        juego1.setPalabra(cadena.toCharArray());
        System.out.println("Cantidad de jugadas maximas:");
        juego1.setJugadasMax(leer.nextInt());
        return juego1;
    }

    public boolean buscar(entiAhorcado juego, String letra, char[] palabra) {
        /*Este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.*/
        int cont = 0;
        for (int i = 0; i < juego.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(juego.getPalabra()[i]))) {
                //Agrega la letra al vector Palabra
                palabra[i] = juego.getPalabra()[i];
                cont++;
            }
        }
        juego.setLetrasEncontradas(juego.getLetrasEncontradas() + cont);
        if (cont > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void encontradas(entiAhorcado juego, String letra, char[] palabra) {
        /*Que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.*/
        boolean esta = buscar(juego, letra, palabra);
        if (esta) {
            System.out.println("Diste en el Blanco, la letra esta en la palabra");
        } else {
            System.out.println("Te mandaste cualquiera, No  existe la letra en la palabra");
            juego.setJugadasMax(juego.getJugadasMax() - 1);
        }
    }

    public void intentos(entiAhorcado juego, char[] palabra) {
        int encontradas = juego.getLetrasEncontradas();
        int restantes = juego.getLongitud() - juego.getLetrasEncontradas();
        System.out.println(Arrays.toString(palabra));
        System.out.println("Número de letras (encontradas, faltantes): " + encontradas + "," + restantes);
        System.out.println("Intentos restantes: " + juego.getJugadasMax());
    }

    public void juego(entiAhorcado juego, char[] palabra) {
        /*El método juego se encargará de llamar todos los
    métodos previamente mencionados e informará cuando el usuario
    descubra toda la palabra o se quede sin intentos. Este método se
    llamará en el main.*/
        System.out.println("Ingrese una letra");
        String letra = String.valueOf(leer.next().charAt(0));
        encontradas(juego, letra, palabra);
        intentos(juego, palabra);
    }

} 

