/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiPardeNumeros;

/**
 *
 * @author Sangre
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán
 * diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor 
 * vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete 
 * Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben 
* redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe 
* obtener el valor absoluto del número.

 */
public class servPardeNumeros {
    
    public void mostrarValores (entiPardeNumeros numeros){
        System.out.println("numero1:" + numeros.getMaxnum1());
        System.out.println("numero2:"+ numeros.getMaxnum2());
        
    }
    
    public void devolverMayor (entiPardeNumeros numeros){
        if(numeros.getMaxnum1()>numeros.getMaxnum2()){
            System.out.println("El mayor es: " + numeros.getMaxnum1());
            
        }else{
            System.out.println("El mayor es: " + numeros.getMaxnum2());
        }
    }
    public void calcularPotencia(entiPardeNumeros numeros){
        if(numeros.getMaxnum1()>numeros.getMaxnum2()){
            System.out.println(numeros.getMaxnum1() + "elevado a " + numeros.getMaxnum2());
            System.out.println(Math.pow(numeros.getMaxnum1(),numeros.getMaxnum2()));
            
        }else{
          // System.out.println(numeros.getMaxnum2() + "elevado a " + numeros.getMaxnum1());
          System.out.printf("%f elevado a %f" , numeros.getMaxnum2() , numeros.getMaxnum1());
            System.out.println(Math.pow(numeros.getMaxnum2(),numeros.getMaxnum1()));
            
        }
            }
    public void calcularRaiz(entiPardeNumeros numeros){
        if(numeros.getMaxnum1()>numeros.getMaxnum2()){
            double raizCuadrada = Math.sqrt(numeros.getMaxnum1());
            System.out.printf(" raiz de %f%f" , numeros.getMaxnum1(), raizCuadrada);
            
        }else{
            double raizCuadrada = Math.sqrt(numeros.getMaxnum2());
            System.out.printf("raiz de %f%f" , numeros.getMaxnum2(), raizCuadrada);
            
        }
    }
    
}
