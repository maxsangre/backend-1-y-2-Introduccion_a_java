
import Ejercicio04.entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class ejercicio04 {

    /**MaxSangre
     * @param args the command line arguments
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un
     * atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo
     * dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para 
     * calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos
     * usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
     */

    public static void main(String[] args) {
           entidad sangre2 = new entidad();
        
        sangre2.crearRectángulo();
        sangre2.superficie();
        sangre2.perimetro();
        sangre2.diagrama();
    }
}
    


