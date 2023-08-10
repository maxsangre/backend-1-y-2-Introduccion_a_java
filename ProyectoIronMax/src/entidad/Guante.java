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
public class Guante {
    
  private float consumo = 1;
    private boolean sano = true;
    private boolean destruido = false;

    private Propulsor propulsorGuante = new Propulsor();

    public Guante() {
    }

    public Guante(float consumo, boolean sano, boolean destruido) {
        this.consumo = consumo;
        this.sano = sano;
        this.destruido = destruido;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    public Propulsor getPropulsorGuante() {
        return propulsorGuante;
    }

    public void setPropulsorGuante(Propulsor propulsorGuante) {
        this.propulsorGuante = propulsorGuante;
    }

    @Override
    public String toString() {
        return "Guante{" +
                "consumo=" + consumo +
                ", sano=" + sano +
                ", destruido=" + destruido +
                ", propulsorGuante=" + propulsorGuante +
                '}';
    }
}
