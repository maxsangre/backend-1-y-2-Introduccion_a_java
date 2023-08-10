package Extras;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra14 {

    /**MaxSangre
     * @param args the command line arguments
     * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
     * Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos
     * para averiguar la media de edad de los hijos de todas las familias.
     */

    public static void main(String[] args) {
     int cantidadFamilias = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cant de familias:"));
        int cantidadBendi;
        int edadBendi;
        float promedioEdadBendi;
        for (int i = 0; i < cantidadFamilias; i++) {
            cantidadBendi = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuántas Bendi tiene la familia " + (i + 1) + "?"));
            promedioEdadBendi = 0;
            for (int j = 0; j < cantidadBendi; j++) {
                edadBendi = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es la edad de la Bendi N°" + (j + 1)));
                promedioEdadBendi += edadBendi;
            }
            promedioEdadBendi /= cantidadBendi;
            System.out.println("El promedio de la edad de las Bendis de la familia " + (i + 1) + " es de " + promedioEdadBendi);
        }
    }
}

    


