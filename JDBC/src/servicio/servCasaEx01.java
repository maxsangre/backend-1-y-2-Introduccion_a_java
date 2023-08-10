/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import ENTIDADES.entiCasaEx01;
import java.util.ArrayList;
import persistencia.DaoCasasEx01;

/**
 *
 * @author Sangre
 */
public class servCasaEx01 {
  
    
    public void listarCasas(String opc) throws Exception {

        DaoCasasEx01 max = new DaoCasasEx01();
        ArrayList<entiCasaEx01> casas;
      
        casas = max.listarCasas(opc);
        
        System.out.println("ingrese la calle");
        for (entiCasaEx01 aux : casas) {
            System.out.println(aux.toString());
        }
      
            
        }
    }
    


