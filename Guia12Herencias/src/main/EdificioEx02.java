
import entidades.entiEdificioDeOficinasEx02;
import entidades.entiEdificioEx02;
import entidades.entiPolideportivoEx02;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class EdificioEx02 {

    /**
     * @param args the command line arguments
     * 2. Crear una superclase llamada Edificio con los siguientes
     * çatributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes 
* clases:
• Clase Polideportivo con su nombre y tipo de instalación que
* puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y 
* los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, 
* cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos 
* métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden
* trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas 
* oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método
* cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

16
Por último, en el main vamos a crear un ArrayList de tipo Edificio.
* El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este
* array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. 
* Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber 
* cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas
* deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de 
* oficinas.
     */

    public static void main(String[] args) {
        ArrayList<entiEdificioEx02> edificioArrayList = new ArrayList<>();
        entiPolideportivoEx02 polideportivo1 = new entiPolideportivoEx02(50, 5, 60, true);
        entiPolideportivoEx02 polideportivo2 = new entiPolideportivoEx02(20, 3, 30, false);
        entiEdificioDeOficinasEx02 edificioDeOficinas1 = new entiEdificioDeOficinasEx02(10, 15, 10, 3, 5, 5);
        entiEdificioDeOficinasEx02 edificioDeOficinas2 = new entiEdificioDeOficinasEx02(20, 3, 15, 5, 5, 5);

        edificioArrayList.add(polideportivo1);
        edificioArrayList.add(polideportivo2);
        edificioArrayList.add(edificioDeOficinas1);
        edificioArrayList.add(edificioDeOficinas2);

        for (entiEdificioEx02 aux : edificioArrayList) {
            if (aux instanceof entiPolideportivoEx02) {
                System.out.println("Polideportivo:");
                aux.calcularSuperficie();
                aux.calcularVolumen();
                if (((entiPolideportivoEx02) aux).isTechado()) {
                    System.out.println("Esta Techado.");
                } else {
                    System.out.println("No esta Techado.");
                }
            }
            System.out.println();
            if (aux instanceof entiEdificioDeOficinasEx02) {
                System.out.println("Edificio De Oficinas:");
                aux.calcularSuperficie();
                aux.calcularVolumen();
                ((entiEdificioDeOficinasEx02) aux).cantPersonas();
            }
        }
     
    }
}
    


