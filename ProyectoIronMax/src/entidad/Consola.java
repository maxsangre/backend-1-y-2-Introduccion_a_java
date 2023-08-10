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
public class Consola {
    
  private float consumo = 1;

    public Consola() {
    }

    public Consola(float consumo) {
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
        return "Consola{" +
                "consumo=" + consumo +
                '}';
    }
}
