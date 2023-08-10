/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author Sangre
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes 
 * operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.
 * random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar 
 * los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear
* ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
* absoluto del número.

 */
public class entiPardeNumeros {
    
    private float maxnum1;
    private float maxnum2;

    public entiPardeNumeros() {
        Random max = new Random();
        maxnum1=max.nextFloat();
          
        maxnum2=max.nextFloat();
    }
    

    public entiPardeNumeros(float maxnum1, float maxnum2) {
        this.maxnum1 = maxnum1;
        this.maxnum2 = maxnum2;
    }

    public float getMaxnum1() {
        return maxnum1;
    }

    public void setMaxnum1(float maxnum1) {
        this.maxnum1 = maxnum1;
    }

    public float getMaxnum2() {
        return maxnum2;
    }

    public void setMaxnum2(float maxnum2) {
        this.maxnum2 = maxnum2;
    }

    @Override
    public String toString() {
        return "entiPardeNumeros{" + "maxnum1=" + maxnum1 + ", maxnum2=" + maxnum2 + '}';
    }

 
    }
    
    

