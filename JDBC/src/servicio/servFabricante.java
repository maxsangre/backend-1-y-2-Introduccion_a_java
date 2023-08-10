/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Scanner;
import persistencia.DaoFabricante;

/**
 *
 * @author Sangre
 */
public class servFabricante {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private DaoFabricante dao;

    public servFabricante( ) {
        this.dao = new DaoFabricante();
    }
    public void insertarFabricante() {
        System.out.println("Ingrese el nombre del fabricante");
        String nombre = leer.next();
        try {
            dao.ingresarFabricante(nombre);
        }catch (Exception max1) {
            max1.printStackTrace();
        }
    }
}

