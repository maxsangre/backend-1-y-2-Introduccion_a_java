/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13;

import guia13.entiPersona;
import java.util.Scanner;



/**
 *
 * @author Sangre
 * Metodo crearPersona(): el método crear persona, le pide los valores
 * de los atributos al usuario y después se le asignan a sus respectivos
 * atributos para llenar el objeto Persona. Además, comprueba que el sexo 
 * introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá
 * mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
* Si esta fórmula da por resultado un valor menor que 20, significa que la persona 
* está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por
* resultado un número entre 20 y 25 (incluidos), significa que la persona está en su
* peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es
* un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve
* un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
* todos los métodos para cada objeto, deberá comprobar si la persona está en su 
* peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada 
* objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
* en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas
* cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
* y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos
* menores. Para esto, podemos crear unos métodos adicionales.

 */
public class servPersona {
    
     

    entiPersona p1 = new entiPersona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(entiPersona p1) {

        return p1.getEdad() >= 18;
    }
    
    public entiPersona  crearPersona1( int edad) throws Exception{
String nombre="juan";
        entiPersona persona = new entiPersona();
try{
    if(nombre.isEmpty()){
        throw new Exception("Nombre no puede estar vacio!");
       }
    if(edad<0){
        throw new Exception("El usuario no puede tener menos de 1 año!");
    }
}catch(ExceptionInInitializerError a){
    throw a;
}catch(Exception a){
    a.printStackTrace();
    throw new Exception("Error gil");
}finally{
    System.out.println("Se interrumpio la creacion");
            
    }
persona.setNombre(nombre);
persona.setEdad(edad);
return persona;
        
    }

    
    
    

    public entiPersona crearPersona() {
        boolean verificador = false;
        System.out.println("ingrese nombre:");
        p1.setNombre(leer.next());
        System.out.println("ingrese edad :");
        p1.setEdad(leer.nextInt());
        do {
            System.out.println("ingrese sexo:");
            String Genero = leer.next();
            if (Genero.equalsIgnoreCase("h") || Genero.equalsIgnoreCase("m") || Genero.equalsIgnoreCase("o")) {
                p1.setSexo(Genero);
                verificador = true;
                System.out.println("se guardo exitosamente el genero");
            } else {
                System.out.println("ingrese una opcion valida");
            }
        } while (!verificador);
        System.out.println("ingrese peso:");
        p1.setPeso(leer.nextFloat());
        System.out.println("ingrese Altura:");
        p1.setAltura(leer.nextFloat());
        return p1;
    }

    public int calcularIMC(entiPersona p1) {
    
            double IMC = (p1.getPeso() / (Math.pow(p1.getAltura(), 2)));
            if (IMC < 20) {
                return (-1);
            }
            if ((IMC >= 20) && (IMC <= 25)) {
                return (0);
            } else {
                return 1;
            }
           }


    public void mostrarPersona(entiPersona p1) {
        System.out.println("te mando del metodo mostrar persona");
        System.out.println("la persona " + p1.getNombre());
        boolean verif = esMayorDeEdad(p1);
        if (verif == true) {
            System.out.println(" es mayor de edad");
        } else {
            System.out.println(" es menor de edad");
        }
        switch (calcularIMC(p1)) {
            case (-1):
                System.out.println(" esta debajo de peso ideal");
                break;
            case (0):
                System.out.println(" esta en el peso ideal");
                break;
            case (1):
                System.out.println(" esta sobre de peso ideal");
                break;
        }

        System.out.println("la edad es: "+ p1.getEdad()+" el sexo es: " + p1.getSexo() + "  el peso es: " + p1.getPeso() + "  la altura es: " + p1.getAltura());
    }

    public String toString(entiPersona p1) {
        return "te mando esto de servicio personas{" + "Nombre=" + p1.getNombre() + ", Edad=" + p1.getEdad() + ", sexo=" + p1.getSexo() + ", peso=" +p1.getPeso()  + ", altura=" +p1.getAltura() + '}';
    }
       
}