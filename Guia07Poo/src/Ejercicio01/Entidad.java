/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Sangre
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y
 * un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar 
 * un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del
 * libro y el número de páginas.
 */
public class Entidad {
    
 private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public Entidad(String ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public Entidad() {

    }

    public Entidad crearLibro() {
        Scanner leer = new Scanner(System.in);
        Entidad Entidades = new Entidad();
        System.out.println("Ingresa el ISBN:");
        Entidades.setISBN(leer.next());
        System.out.println("Ingresa el título:");
        Entidades.setTitulo(leer.next());       
        System.out.println("Ingresa el autor:");
        Entidades.setAutor(leer.next());
        System.out.println("Ingresa la cantidad de páginas:");
        Entidades.setNumPaginas(leer.nextInt());
        return Entidades;
    }

    public void mostrarLibro(Entidad Entidades) {
        System.out.println(Entidades.getISBN());
        System.out.println(Entidades.getTitulo());
        System.out.println(Entidades.getAutor());
        System.out.println(Entidades.getNumPaginas());
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }
}
