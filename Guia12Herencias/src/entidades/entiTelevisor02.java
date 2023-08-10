/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Sangre
 */

  public class entiTelevisor02 extends entiElectrodomestico02 {
    protected int pulgadas;
    protected boolean tdt;

    public entiTelevisor02() {
    }

    public entiTelevisor02(Double precio, String color, Character consumoEnergetico, Double peso, int pulgadas, boolean tdt) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }



    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        
        
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        pulgadas = leer.nextInt();
        
        System.out.println("Ingrese si tiene TDT (true/false)");
      tdt = leer.nextBoolean();
           

        precioFinal();
        }
        

       
    public void precioFinal() {
        super.precioFinal();
        if (pulgadas > 40) {
            precio += precio * 0.3;
        }
        if (tdt) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Smart Tv{" +
                "pulgadas=" + pulgadas +
                ", tdt=" + tdt +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}  

