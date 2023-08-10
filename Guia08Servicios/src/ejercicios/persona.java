package ejercicios;

import guia13.entiPersona;
import java.util.Scanner;
import guia13.servPersona;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class persona {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       
  
   
         Scanner leer = new Scanner(System.in);
        entiPersona[] p1 = new entiPersona[4];
        servPersona ps = new servPersona();
        
        System.out.println("ingrese cuantas personas creara");
        int dim = leer.nextInt();
        boolean[] vectorEdad = new boolean[dim];
        int[] vectorIMC = new int[dim];

        int contadormayor = 0;
        int contadormenor = 0;

        int imcmenor = 0;
        int imcigual = 0;
        int imcmayor = 0;

        for (int i = 0; i < dim; i++) {

            System.out.println("  ");
            System.out.println("========= =====");

            p1[i] = ps.crearPersona();
            vectorIMC[i] = ps.calcularIMC(p1[i]);
            vectorEdad[i] = ps.esMayorDeEdad(p1[i]);

            if (ps.esMayorDeEdad(p1[i]) == true) {
                contadormayor++;
            } else {
                contadormenor++;
            }

            switch (vectorIMC[i]) {
                case (-1):
                    imcmenor++;
                    break;
                case (0):
                    imcigual++;
                    break;
                case (1):
                    imcmayor++;
                    break;
            }
            System.out.println("-------------------");
            ps.mostrarPersona(p1[i]);
            System.out.println("---entidad---");
            System.out.println(p1[i].toString());
            System.out.println("---servicio---");
            System.out.println(ps.toString(p1[i]));
        }

        System.out.println("-------------------");
        System.out.println("el porcentaje de personas mayores de edad es: " + contadormayor * 100 / dim + "%");
        System.out.println("el porcentaje de personas menores de edad es: " + contadormenor * 100 / dim + "%");
        System.out.println("el porcentaje de personas con IMC bajo es: " + imcmenor * 100 / dim + "%");
        System.out.println("el porcentaje de personas con IMC alto es: " + imcmayor * 100 / dim + "%");
        System.out.println("el porcentaje de personas con IMC bien es: " + imcigual * 100 / dim + "%");
    }

}