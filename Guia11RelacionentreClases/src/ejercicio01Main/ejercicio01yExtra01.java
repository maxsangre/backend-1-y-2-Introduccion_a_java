package ejercicio01Main;


import ejercicios.entidades.entiPerro01;
import ejercicios.entidades.entiPersona01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ejerciciosServicios.servAdopcion01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class ejercicio01yExtra01 {

    /**MaxSangre
     * @param args the command line arguments
     * Realizar un programa para que una Persona pueda adoptar un Perro. 
     * Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
* y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, 
* vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y 
* por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
     * 
     */

    public static void main(String[] args) {
     Scanner max2 = new Scanner(System.in).useDelimiter("\n");
     servAdopcion01 adopcion=new servAdopcion01();
     List<entiPersona01>personas=new ArrayList();
     List<entiPerro01>perros=new ArrayList();
     
     //Carga de Persona
     System.out.println("Carga de Persona");
        for (int i = 0; i < 2; i++) {
            System.out.println("Persona"+(i+1)+":");
            personas.add(adopcion.crearPersona());
            }
        //Cargar Perro
        System.out.println("Carga de Perro");
        for (int i = 0; i < 2; i++) {
            System.out.println("Perro "+(i+1)+":");
            perros.add(adopcion.crearPerro());
             }
        System.out.println("Adopcion del Can:");
        for (entiPersona01 max3:personas) {
            System.out.println("Para el gil de Nombre: "+max3.getNombre()+" Apellido: "+max3.getApellido()+" Documento: "+max3.getDocumento());
            for (entiPerro01 max4:perros) {
                System.out.println("Nombre: "+max4.getNombre()+"- Raza: "+max4.getRaza()+" - Tamaño: "+max4.getTamanio());
                            
            }
            System.out.println("Ingrese en nombre del Can que desea ");
            String Adoptable=max2.next();
                    int control=0;
                    for (int i = 0; i < perros.size(); i++) {
                        if(Adoptable.equalsIgnoreCase(perros.get(i).getNombre())){
                            max3.setPerro(perros.get(i));
                            control++;
                            perros.remove(i);
                            
                        }
                            }
                    if(control==0){
                        System.out.println("No se ha adoptado un perro valido.");
                    }
                           }
        System.out.println("");
        System.out.println("Las siguientes personas han arruinado su vida o mejorado depende de lo que adoptaron.");
        for(entiPersona01 max3:personas){
            if(max3.getPerro()==null){
                System.out.println("Nombre: "+max3.getNombre()+" Apellido: "+max3.getApellido()+" No ha adoptado a ningun Can.");
            }else{
                System.out.println("Nombre: "+max3.getNombre()+" Apellido: "+max3.getApellido()+" Documento: "+max3.getDocumento()+" Ha Adoptado a "+max3.getPerro().getNombre()+" de Raza: "+max3.getPerro().getRaza()+" Tamaño: "+max3.getPerro().getTamanio()+"Edad: "+max3.getPerro().getEdad());
                
            }
            
        }
    
     
    }

}
