/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.entidades;

import java.util.ArrayList;

/**
 *
 * @author Sangre
 */
public class entiVotosEx04 {
     private entiAlumnoEx04 alumno;
    private ArrayList<entiAlumnoEx04> alumnosVotados;

    public entiVotosEx04() {
    }

    public entiVotosEx04(entiAlumnoEx04 alumno, ArrayList<entiAlumnoEx04> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public entiAlumnoEx04 getAlumno() {
        return alumno;
    }

    public void setAlumno(entiAlumnoEx04 alumno) {
        this.alumno = alumno;
    }

    public ArrayList<entiAlumnoEx04> getListaAlumnos() {
        return alumnosVotados;
    }

    public void setListaAlumnos(ArrayList<entiAlumnoEx04> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return alumno + " votó a:  \n" + alumnosVotados;
    }
}

