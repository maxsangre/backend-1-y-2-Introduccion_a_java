
import guia13.servPersona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class ejericicio01 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
     servPersona persona=new servPersona();
     try{
         persona.crearPersona1(-1);
         
         
     }catch(Exception a){
         System.out.println(a.getMessage());
                
     }
    }

}
