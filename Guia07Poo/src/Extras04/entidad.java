/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras04;

import java.util.Scanner;

/**
 *
 * @author Sangre
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
* que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
* después de realizar una transacción de retiro.
 */
public class entidad {
      private String titular;
    private float saldo;

    public entidad() {
    }

    public entidad(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

 
    public String toString() {
        return "entidad:{" +
                "Titular='" + titular + '\'' +
                ", Saldo=" + saldo +
                '}';
    }
   
    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Titular:");
        this.setTitular(leer.nextLine());
        System.out.println("Saldo:");
        this.setSaldo(leer.nextFloat());
       
    }

    public void retirarDinero(entidad entidad) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto desea retirar?");
        float retiro = leer.nextFloat();
        if (entidad.getSaldo() < retiro) {
            System.out.println("No es posible retirar esa cantidad!");
        } else {
            entidad.setSaldo(saldo - retiro);
            System.out.println("Gracias");
        }
    }
}

