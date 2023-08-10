/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras03;

import java.util.Scanner;

/**
 *
 * @author Sangre
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de
 * adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo
 * jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos
 * necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class entidad {
    
    private int numeroX;
    private int intentosMax=3;
    private int cont=0;

    public entidad() {
    }
    
    public entidad (int numeroX, int intentosMax){
        this.numeroX=numeroX;
        this.intentosMax=intentosMax;
        
    }
    
 

    public int getNumeroX() {
        return numeroX;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    public void NumeroSecreto(entidad entidad){
   this.numeroX = (int)(Math.random()*10+1);
   
        
    }
    public void iniciarJuego(entidad entidad){
        entidad.NumeroSecreto(entidad);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Adivina el numero Secreto");
        do{
            int num = leer.nextInt();
            if(num != entidad.getNumeroX() ){
                entidad.setCont(cont+=1);
               
                
                
            } else{
                System.out.println("adivinaste gil");
            }
            
        }while (entidad.getCont()<entidad.getIntentosMax() );
        System.out.println("Se acabo el Juego.");
    }
    
    
    
    
}
