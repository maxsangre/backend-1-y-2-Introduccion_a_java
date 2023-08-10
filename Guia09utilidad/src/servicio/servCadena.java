/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiCadena;
import java.util.Scanner;

/**
 *
 * @author Sangre
 * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase
 * (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
 * El constructor con frase como atributo debe setear la longitud de la frase de manera automática. Crear una clase
 * CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada:
* "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
* se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra 
* nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada 
* por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún 
* otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve 
* verdadero si la contiene y falso si no.

 */
public class servCadena {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(entiCadena cadena) {
        /*deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.*/
        int contadorVocales = 0;
        char letra;
        String frase = cadena.getFrase();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println();
    }
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada:
    // "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(entiCadena cadena) {
        String fraseOri = cadena.getFrase();
        String fraseNueva = "";
        char letra;
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            letra = fraseOri.charAt(i);
            fraseNueva = fraseNueva.concat(String.valueOf(letra));
        }
        System.out.println("Frase invertida: " + fraseNueva);
        System.out.println();
    }
//**Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces
// se repite el carácter en la frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.**/
    
    public void vecesRepetido(entiCadena cadena) {
        System.out.println("Letra que desea buscar para contar veces que se repite:");
        String letraBuscada = String.valueOf(leer.next().charAt(0));
        String frase = cadena.getFrase();
        int cont = 0;
        char letra;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letraBuscada.equalsIgnoreCase(String.valueOf(letra))) {
                cont++;
            }
        }
        System.out.println("Letra " + "'" + letraBuscada + "'" + " cantidad de veces repetida: " + cont);
        System.out.println();
    }
//Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra 
//* nueva frase ingresada por el usuario.
    
    public void compararLongitud(entiCadena cadena) {
        System.out.println("Ingrese una nueva frase para comparar las longitudes: ");
        String fraseNueva = leer.nextLine();
        if (fraseNueva.length() == cadena.getFrase().length()) {
            System.out.println("Las longitudes son iguales");
        } else {
            System.out.println("Las longitudes son diferentes");
            System.out.println("");
        }
    }

    
    public void unirFrases(entiCadena cadena) {
       /* deberá unir la frase contenida en la
        clase Cadena con una nueva frase ingresada por el usuario y mostrar
        la frase resultante.*/
        System.out.println("Ingrese una nueva frase para concatenarlas: ");
        String fraseUsuario = leer.nextLine();
        String fraseNueva = cadena.getFrase().concat(fraseUsuario);
        System.out.println("Frase resultante: " + fraseNueva);
        System.out.println();
    }

    public void reemplazar(entiCadena cadena) {
        /*deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.*/
        System.out.println("Ingrese el valor por el cual desea reemplazar las letras 'a' ':");
        String letra = leer.next();
        String frase = cadena.getFrase();
        frase = frase.replace("a", letra);
        System.out.println("Resultado: ");
        System.out.println(frase);
        System.out.println();
    }

    public void contiene(entiCadena cadena) {
        /*deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.*/

        String frase = cadena.getFrase();
        System.out.println("Letra que desea buscar dentro de la frase: ");
        char letraBuscada = leer.next().charAt(0);
        char letra;
        boolean contiene = false;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == letraBuscada) {
                contiene = true;
                break;
            }
        }
        if (contiene) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

    }
} 

