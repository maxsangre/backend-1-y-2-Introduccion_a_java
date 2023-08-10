
import Extras03.entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra03ejer {

    /**
     * @param args the command line arguments
     * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
     * jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo
     * jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe 
     * una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el 
     * segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos 
     * necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
     */

    public static void main(String[] args) {
     entidad max5 = new entidad ();
     
     max5.iniciarJuego(max5);
     
    }

}
