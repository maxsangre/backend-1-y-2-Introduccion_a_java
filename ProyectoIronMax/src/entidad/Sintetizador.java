/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Sangre
 */
public class Sintetizador {
    
   private float consumo = 1;

    public Sintetizador() {
    }

    public Sintetizador(float consumo) {
        this.consumo = consumo;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "Sintetizador{" +
                "consumo=" + consumo +
                '}';
    }
}
