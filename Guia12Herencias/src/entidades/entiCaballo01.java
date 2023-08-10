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

    public class entiCaballo01 extends entiAnimal01 {
    public entiCaballo01() {
    }

    public entiCaballo01(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getAlimento() {
        return super.getAlimento();
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento);
    }

    @Override
    public Integer getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(Integer edad) {
        super.setEdad(edad);
    }

    @Override
    public String getRaza() {
        return super.getRaza();
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza);
    }

    @Override
    public void alimentarse() {
//        super.alimentarse();
        System.out.println(this.nombre + " se alimenta de " + this.alimento);
    }
}

