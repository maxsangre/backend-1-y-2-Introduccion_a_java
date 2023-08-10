/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.entiCuentaBancaria;
import java.util.Scanner;




/**
 *
 * @author Sangre
 * Realizar una clase llamada CuentaBancaria en el paquete  con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
public class servCuentaBancaria {
    
      public entiCuentaBancaria crearCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       entiCuentaBancaria cuenta = new entiCuentaBancaria();
        System.out.println("**BankMax Te Crea tu Cuenta**");
        System.out.println();
          System.out.println("Ingrese Numero de la Cuenta:");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI del cliente:");
        long dniCliente = leer.nextLong();
        System.out.println("Saldo actual de la cuenta:");
        double saldoActual = leer.nextDouble();
        System.out.println("Cuenta Generada con Exito.");
       return new  entiCuentaBancaria(numeroCuenta, dniCliente, (float) saldoActual);
       
    }

    public void ingresar(entiCuentaBancaria cuenta) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Dinero a ingresar:");
        float dinero = leer.nextFloat();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + dinero);
    }

    public void retirar(entiCuentaBancaria cuenta) {
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Cuanto Chirolas desea retirar?:");
        float dinero = leer.nextFloat();
        if (dinero <=0   ){
        System.out.println("no gil");
    }
          if (dinero > cuenta.getSaldoActual()&& (dinero >0 )) {
                    System.out.println("La cantidad ingresada excede el saldo actual, debido a que es Pobre. Vuelva Pronto");
            System.out.println("Se retiraron:");
              System.out.println(cuenta.getSaldoActual());
            System.out.println("Vuelva Pronto Ja.");
            cuenta.setSaldoActual(0);
        } else {
            if (dinero>0){ 
            System.out.println("Se retiraron $" + dinero + " de su cuenta.Vuelva pronto Ja.");
            cuenta.setSaldoActual (cuenta.getSaldoActual() - dinero);
        }
        }
//
    }

    public void extraccionRapida(entiCuentaBancaria cuenta) {
        
        Scanner leer = new Scanner(System.in);
    
        double maximoRetirar = cuenta.getSaldoActual() * 0.2;
        System.out.println("Cuantos Morlacos quiere retirar de manera Flash?: " + "Maximo: " + maximoRetirar);
        double dinero = leer.nextDouble();
        if (dinero > maximoRetirar) {
            System.out.println("Su retiro excede el maximo disponible para la operacion.Maldito Pobre..");
             System.out.println("Esta intentado Cagarme..;");
        } else {
            cuenta.setSaldoActual((float)(cuenta.getSaldoActual() - dinero));
        }

    }

    public void consultarSaldo(entiCuentaBancaria cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(entiCuentaBancaria cuenta) {
           
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI Cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo disponible: " + cuenta.getSaldoActual());
    }
}

     

