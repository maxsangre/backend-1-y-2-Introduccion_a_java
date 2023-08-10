
import ejercicios.entidades.entiJugador02;
import ejercicios.entidades.entiRevolver02;
import ejerciciosServicios.servRuleta02;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Revolver02 {

    /**
     * @param args the command line arguments
     * Realizar el juego de la ruleta rusa de agua en Java. 
 * Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, 
* el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son
* las siguientes:
Clase Revolver de agua: esta clase posee los siguientes
* atributos: posic ctual (posición
del tambor que se dispara, puede que esté el agua o no)
* y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones,
* se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y 
* de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide 
* con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
*
• toString(): muestra información del revolver (posición actual 
* y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id
* (representa el número del
jugador), nombre (Empezara con Jugador más su ID, 
* “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores
* será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto 
* será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua
* y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta,
* aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado
* pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: 
* Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList< Jugador >jugadores, Revolver r):
* este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta 
* con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se
* moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje.
* Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se
* mojó.
Pensar la lógica necesaria para realizar esto, usando los
* atributos de la clase Juego.
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servRuleta02 ruletaService = new servRuleta02();
        ArrayList<entiJugador02> jugadores = new ArrayList<>();
        entiRevolver02 revolver = new entiRevolver02();
        System.out.println();
        ruletaService.llenarJuego(jugadores, revolver);
        System.out.println();
        System.out.println("Disparando: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Posicion revolver: " + revolver.getPosActual() + "\nPosicion agua: " + revolver.getPosAgua());
            boolean muerto = !ruletaService.ronda(jugadores.get(i), revolver);
            System.out.println(jugadores.get(i).getNombre() + " Se dispara!");
            if (ruletaService.disparo(jugadores.get(i), revolver)) {
                System.out.println("El " + jugadores.get(i).getNombre() + " se Petatio :/");
            } else {
                System.out.println("Sigue vivo!");
                System.out.println();
                ruletaService.siguienteChorro(revolver);
            }
            if (muerto) {
                break;
            }
        }
    }
}
    


