
import entidades.Raices;
import servicios.RaizServicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class extra01Raices {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
      
        RaizServicio a1 = new RaizServicio();
        
        Raices aux = a1.init();
        
        System.out.println(aux);
        
        //System.out.println("El valor del metodo discriminante es:  " +  a1.getDiscriminante(aux));
        
        //System.out.println("Tiene dos soluciones = " + a1.tieneRaices(aux));
        
        //Calculamos el valor de las raices
        //a1.obtenerRaices(aux);
        
        //Calculamos el valor de una sola raiz
        //a1.obtenerRaiz(aux);
        
        //Hace todo
        a1.calcular(aux);
    }
    
}
    


