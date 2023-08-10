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
public class Reactor {
    
  private float cargaReactor = 10000f;

    public Reactor() {
    }

    public Reactor(float cargaReactor) {
        this.cargaReactor = cargaReactor;
    }

    public float getCargaReactor() {
        return cargaReactor;
    }

    public void setCargaReactor(float cargaReactor) {
        this.cargaReactor = cargaReactor;
    }

    @Override
    public String toString() {
        return "Reactor{" +
                "cargaReactor=" + cargaReactor +
                '}';
    }
}
