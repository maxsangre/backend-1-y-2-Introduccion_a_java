/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;
import persistencia.DaoProducto;

/**
 *
 * @author Sangre
 */
public class servProducto {
 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private DaoProducto dao;

    public servProducto() {
        this.dao = new DaoProducto();
    }

    public void mostrarProductos() {
        try {
            dao.mostrarProductos();
        } catch (Exception max1) {
            max1.printStackTrace();
        }
    }
    public void mostrarNompre() {
        try {
            dao.mostrarNompre();
        } catch (Exception max1) {
            max1.printStackTrace();
        }
    }
    public void mostrarEntre(int max1, int max2) {
        try {
            dao.mostrarEntre(max1,max2);
        } catch (Exception max3) {
            max3.printStackTrace();
        }
    }
    public void listarPortatiles() {
        try {
            dao.listarPortatiles();
        } catch (Exception max1) {
            max1.printStackTrace();
        }
    }
    public void listarProductoMasBarato(){
    try {
        dao.listarProductoMasBarato();
    }catch (Exception max1){
        max1.printStackTrace();
    }
    }
    public void ingresarProducto(){
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo_fabricante = leer.nextInt();
            dao.ingresarProducto(nombre,precio,codigo_fabricante);
        }catch (Exception max1){
            max1.printStackTrace();
        }
    }
    public void modificarProducto(){
        try {
            System.out.println("Ingrese la id del producto que desea modificar:");
            int id = leer.nextInt();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto:");
            double precio = leer.nextDouble();
            System.out.println("Ingrese el codigo del fabricante:");
            int codigo_fabricante = leer.nextInt();
            dao.modificarProducto(id,nombre,precio,codigo_fabricante);
        }catch (Exception max1){
            max1.printStackTrace();
        }
    }
}

