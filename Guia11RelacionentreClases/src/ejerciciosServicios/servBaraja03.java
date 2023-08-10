/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosServicios;

import ejercicios.entidades.entiCartas03;
import ejercicios.entidades.entiPalos03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author Sangre
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
public class servBaraja03 {
  Scanner leer = new Scanner(System.in);
    ArrayList<entiPalos03> palos = new ArrayList<>();
    ArrayList<entiCartas03> cartas = new ArrayList<>();
    ArrayList<entiCartas03> cartasDadas = new ArrayList<>();

    public void crearPalos() {
        palos.add(new entiPalos03("Espadas"));
        palos.add(new entiPalos03("Bastos"));
        palos.add(new entiPalos03("Copas"));
        palos.add(new entiPalos03("Oros"));
    }

    public void crearBaraja() {
        crearPalos();
        if (cartas.size() > 0) {
            System.out.println("Ya existe una baraja");
        } else {
            System.out.println("Creando baraja...");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

            for (int i = 0; i < palos.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new entiCartas03(numero[j], palos.get(i)));
                }
            }
            System.out.println("Se creó la baraja correctamente!");
        }
    }

    public void barajar() {
        System.out.println("Barajando...");
//        for (int i = 0; i < cartas.size(); i++) {
//            int j = (int) (Math.random() * cartas.size());
//            Entidad.Cartas aux = cartas.get(i);
//            cartas.set(i, cartas.get(j));
//            cartas.set(j, aux);
//        }
        Collections.shuffle(cartas); 
        System.out.println("Se mezcló la baraja completamente!");
        
    }

    public entiCartas03 siguienteCarta() {
        entiCartas03 carta = new entiCartas03();
        if (cartas.size() == 0) {
            System.out.println("No hay cartas");
        } else {
            carta = cartas.get(0);
        }
        return carta;
    }

    public void cartasDisponibles() {
        System.out.println("Entidad.Cartas disponibles: " + cartas.size());
    }

    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas que desea dar:");
        int cantidad = leer.nextInt();
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            int cont = 0;
            while (cont < cantidad) {
                System.out.println("Se dio la carta: " + siguienteCarta() + " al jugador");
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    public void cartasMonton() {
        System.out.println("Entidad.Cartas del monton: " + cartasDadas.size());
        for (entiCartas03 carta : cartasDadas) {
            System.out.println(carta);
        }
    }

    public void mostrarBaraja() {
        System.out.println("Entidad.Cartas de la baraja:");
        for (entiCartas03 carta : cartas) {
            System.out.println(carta);
        }
    }
}

