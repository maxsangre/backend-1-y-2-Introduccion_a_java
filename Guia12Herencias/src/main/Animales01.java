package main;


import entidades.entiAnimal01;
import entidades.entiCaballo01;
import entidades.entiGato01;
import entidades.entiPerro01;
import java.util.ArrayList;
import servicios.servAnimal01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Animales01 {

    /**
     * @param args the command line arguments
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, 
     * Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del 
* Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
* mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main 
* que realice lo
siguiente:
     */

    public static void main(String[] args) {
       servAnimal01 animalesService = new servAnimal01();
        ArrayList<entiAnimal01> animales = new ArrayList<>();

        entiAnimal01 perroObj = new entiPerro01("Firulais", "Carne", 7, "Pitbull");
        animales.add(perroObj);
        perroObj.alimentarse();

        entiAnimal01 gatoObj = new entiGato01("Pelusa", "Croquetas", 5, "Siames");
        animales.add(gatoObj);
        gatoObj.alimentarse();

        entiAnimal01 caballoObj = new entiCaballo01("Pegaso", "Alfalfa", 10, "Caballo andaluz");
        animales.add(caballoObj);
        caballoObj.alimentarse();

        System.out.println("\nTipo de animal: ");
        animalesService.mostrarTipo(animales);
    }
}
    


