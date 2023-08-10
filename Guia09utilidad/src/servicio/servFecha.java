/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servFecha {
       Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
        System.out.println("ingrese dia de nacimiento");
        int dia=leer.nextInt();
         System.out.println("ingrese mes de nacimiento");
        int mes=leer.nextInt()-1;
         System.out.println("ingrese año de nacimiento");
        int anio=leer.nextInt()-1900;  
        
        Date fechaNac = new Date(anio, mes, dia);
        System.out.println("tu fecha de nacimineto es");
        System.out.println(fechaNac);
   return  fechaNac;
    }
    
    public Date fechaActual(){
        Date fechaActual = new  Date();
        System.out.println("la fecha actual es");
        System.out.println( fechaActual);
         return fechaActual;
    }
    
    public void  diferencia(Date fechaActual,Date fechaNac){
        
    long anios = (int) ((fechaNac.getYear()-fechaActual.getYear()));

 System.out.println("Hay " + anios+ " años de diferencia");          
    }
}