/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.entiAnimal01;
import entidades.entiCaballo01;
import entidades.entiGato01;
import entidades.entiPerro01;
import java.util.ArrayList;

/**
 *
 * @author Sangre
 */
public class servAnimal01 {
     public void mostrarTipo(ArrayList<entiAnimal01> animales) {
        for (entiAnimal01 animal : animales) {
            if (animal instanceof entiPerro01) {
                System.out.println(animal.getNombre() + " es un perro de "+animal.getEdad()+" años de edad y es de raza "+animal.getRaza());
            } else if (animal instanceof entiGato01) {
                System.out.println(animal.getNombre() + " es un gato de "+animal.getEdad()+" años de edad y es de raza "+animal.getRaza());
            } else if (animal instanceof entiCaballo01) {
                System.out.println(animal.getNombre() + " es un caballo de "+animal.getEdad()+" años de edd y es de raza "+animal.getRaza());
            }
        }
    }
}

