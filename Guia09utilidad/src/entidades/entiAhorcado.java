/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Arrays;

/**
 *
 * @author Sangre
 */
public class entiAhorcado {
     private int longitud;
    private char[] palabra = new char[longitud];
    private int letrasEncontradas;
    private int jugadasMax;

    public entiAhorcado() {
    }

    public entiAhorcado(int longitud, char[] palabra, int letrasEncontradas, int jugadasMax) {
        this.longitud = longitud;
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "longitud=" + longitud +
                ", palabra=" + Arrays.toString(palabra) +
                ", letrasEncontradas=" + letrasEncontradas +
                ", jugadasMax=" + jugadasMax +
                '}';
    }
}

