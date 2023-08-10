
import java.util.Date;
import servicio.servFecha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class fecha {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
      servFecha fecha=new servFecha();
      Date Nac= fecha.fechaNacimiento();
      Date Act= fecha.fechaActual();
       fecha.diferencia(Nac, Act);
    }
    
}
    


