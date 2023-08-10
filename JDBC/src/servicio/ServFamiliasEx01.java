/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import ENTIDADES.entiFamiliasEx01;
import java.util.ArrayList;
import persistencia.DaoFamiliaEx01;

/**
 *
 * @author Sangre
 */
public class ServFamiliasEx01 {
    

    public void listarFamilias(String opc) throws Exception {

        DaoFamiliaEx01 max1 = new DaoFamiliaEx01();
        ArrayList<entiFamiliasEx01> familias = new ArrayList();
        if (opc.equals("a")) {
            familias = max1.listarfamilia(opc);
        }
        if (opc.equals("d")) {
            familias = max1.listarfamilia(opc);
        }
        for (entiFamiliasEx01 aux : familias) {
            System.out.println(aux.toString());
        }
    }
}

