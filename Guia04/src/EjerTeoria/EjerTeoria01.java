package EjerTeoria;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class EjerTeoria01 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    
   
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese palabra"); 
      
        String palabra=leer.nextLine();
        
      String respuesta=codificar(palabra);
      
        System.out.println(respuesta);
      
    }
    
    public static String codificar(String palabra) {
          String letra,resultado="";
        String palabraminuscula = palabra.toLowerCase();
        int longitud = palabra.length();

        for (int i = 0; i < longitud; i++) {
            letra = palabraminuscula.substring(i, (i + 1));
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
             resultado=resultado.concat(letra);
        }
        String respuesta=resultado;
        return respuesta;
    }
}
    


