/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Sangre
 * Crear una clase llamada Alumno que mantenga información sobre las
 * notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista 
* de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
* Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno 
* y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular 
* su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
* Dentro
del método se usará la lista notas para calcular el promedio final de alumno.
* Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class entiAlumno {
   private String Nombre;
    private ArrayList<Integer> Notas = new ArrayList<>(3);

    public entiAlumno() {
    }

    public entiAlumno(String nombre, ArrayList<Integer> notas) {
        Nombre = nombre;
        Notas = notas;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return Notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        Notas = notas;
    }

    @Override
    public String toString() {
        return "Entidades.Alumno{" +
                "Nombre='" + Nombre + '\'' +
                ", Notas=" + Notas +
                '}';
    }
}