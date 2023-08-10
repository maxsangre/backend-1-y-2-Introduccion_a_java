
import Extras05.entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra05ejer {

    /**MaxSangre
     * @param args the command line arguments
     * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método
     * "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
     * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
     */

    public static void main(String[] args) {
      
        entidad entidad1 = new entidad("YBAÑEZ Maximiliano", 35, 10000.0);
        
        entidad1.calcularAumento(entidad1);
        
        System.out.println(entidad1.toString());
        
        entidad entidad2 = new entidad("Maximiliano TELECHEA", 25, 5000.0);
        
        entidad2.calcularAumento(entidad2);
        
        System.out.println(entidad2.toString());
    }

}
    


