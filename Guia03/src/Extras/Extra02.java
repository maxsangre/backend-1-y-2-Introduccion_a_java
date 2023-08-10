package Extras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra02 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle
     * un valor diferente a cada una. A continuación, realizar las instrucciones 
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
     * tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar 
     * sólo una variable auxiliar
     */

    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
          int c = 3;
        int d = 4;
        
        System.out.println("Valores Iniciales;");
        System.out.println("a:" + a + ",b:" + b + ",c:" + c + ",d:" + d);
        
        int interna = b;
        b = c;
        c = a;
        a = d;
        int temperatura;
        d = interna ;
        
        System.out.println("valores finales");
        System.out.println("a:" + a + ",b:" + b + ",c:" + c + ",d:" + d);
    }
    

    private static class Temperatura {

        public Temperatura() {
        }
    }
}
                
        
        
        
     
     
    


