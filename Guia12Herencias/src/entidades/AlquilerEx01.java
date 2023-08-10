/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * 
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
public class AlquilerEx01 {
    

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Alquiler se guarda: el
    //nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    //amarre y el barco que lo ocupará.
    private String nombre;
    private String documento;
    private Calendar fechaAlquiler;
    private Calendar fechaDevolucion;
    private String posAmarre;
    private BarcoEx01 barco;

    public AlquilerEx01() {
    }

    public AlquilerEx01(String nombre, String documento, Calendar fechaAlquiler, Calendar fechaDevolucion, String posAmarre, BarcoEx01 barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public BarcoEx01 getBarco() {
        return barco;
    }

    public void setBarco(BarcoEx01 barco) {
        this.barco = barco;
    }

    public AlquilerEx01 alquiler(BarcoEx01 barco) {
        System.out.println("Ingrese su Nombre:");
        this.nombre = leer.next();
        System.out.println("Ingrese su DNI:");
        this.documento = leer.next();
        System.out.println("Ingrese la fecha de Alquiler:(dia/mes/año)");
        int diaA = leer.nextInt();
        int mesA = leer.nextInt();
        int anioA = leer.nextInt();
        this.fechaAlquiler = new GregorianCalendar(anioA, mesA, diaA);
        System.out.println("Ingrese la fecha de Devolucion:(dia/mes/año)");
        int diaD = leer.nextInt();
        int mesD = leer.nextInt();
        int anioD = leer.nextInt();
        this.fechaDevolucion = new GregorianCalendar(anioD, mesD, diaD);
        System.out.println("Ingrese la Posicion del Amarre:");
        this.posAmarre = leer.next();
        this.barco = barco;
        return new AlquilerEx01(nombre, documento, fechaAlquiler, fechaDevolucion, posAmarre, barco);
    }

}