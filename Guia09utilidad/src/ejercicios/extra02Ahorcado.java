
import entidades.entiAhorcado;
import java.util.Arrays;
import servicio.servAhorcado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra02Ahorcado {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       servAhorcado service = new servAhorcado();
        entiAhorcado juego1 = service.crearJuego();
        char[] palabra = new char[juego1.getPalabra().length];
        Arrays.fill(palabra, '*');

        do {
            service.juego(juego1, palabra);
        } while (juego1.getJugadasMax() != 0 && juego1.getLetrasEncontradas() != juego1.getLongitud());

        if (juego1.getJugadasMax() == 0) {
            System.out.println("Perdiste GIL");
        }
        if (juego1.getLetrasEncontradas() == juego1.getLongitud()) {
            System.out.println("Ganaste..Bie ahi Amiguin...");
        }

    }
}
    


