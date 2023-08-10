package ejercicios;

import entidades.entiCadena;
import java.util.Scanner;
import servicio.servCadena;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Cadena01 {

    /**MaxSangre
     * @param args the command line arguments
     * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su longitud. Agregar
     * constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con frase como atributo debe setear la longitud 
     * de la frase de manera automática. Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario
* y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

     */

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        servCadena servicio = new servCadena();
        entiCadena cadena = new entiCadena("River le Gano a boca jajaja");
        int menu;
        do {
                
           System.out.println("Frase predeterminada");
           System.out.println("River le Gano a boca jajaja");
                   System.out.println("");
            System.out.println("1. Cantidad de vocales");
            System.out.println("2. Comparar Longitudes");
            System.out.println("3. Invertir Frase");
            System.out.println("4. Veces Repetido");
            System.out.println("5. Unir Frases");
            System.out.println("6. Reemplazar letra");
            System.out.println("7. Ver si contiene X letra");
            System.out.println("8. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicio.mostrarVocales(cadena);
                    break;
                case 2:
                    servicio.compararLongitud(cadena);
                    break;
                case 3:
                    servicio.invertirFrase(cadena);
                    break;
                case 4:
                    servicio.vecesRepetido(cadena);
                    break;
                case 5:
                    servicio.unirFrases(cadena);
                    break;
                case 6:
                    servicio.reemplazar(cadena);
                    break;
                case 7:
                    servicio.contiene(cadena);
                    break;
                case 8:
                    System.out.println("Saliendo....Chauchis");
                    break;
                default:
                    break;
            }
        } while (menu != 8);


    }
}
    


