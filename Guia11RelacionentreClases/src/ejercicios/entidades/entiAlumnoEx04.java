/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.entidades;

/**
 *
 * @author Sangre
 */
public class entiAlumnoEx04 {
      private String nombreCompleto;
    private String dni;
    private int votos;

    public entiAlumnoEx04() {
    }

    public entiAlumnoEx04(String nombreCompleto, String dni, int votos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.votos = votos;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return nombreCompleto + ", " + dni +
                ", Votos:" + votos;
    }
}

