/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.entiCurso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sangre
 */
public class servCurso {
     Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos() {
        /*Este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.*/
        String[] alumnos = new String[5];
        System.out.println("Ingrese los nombres de los Pichones:");
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public entiCurso crearCurso() {
        /*El método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos*/
        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia:");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de dias por semana:");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el horario del curso: (Mañana o Tarde)");
        String turno = leer.next();
        System.out.println("Ingrese el precio por hora: (Int)");
        int precioPorHora = leer.nextInt();
        String[] alumnos = cargarAlumnos();
        return new entiCurso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, alumnos);
    }

    public void calcularGananciaSemanal(entiCurso curso) {
        /*Este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.*/
        int gananciasSemanales;
        gananciasSemanales = (curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getPrecioPorHora() * 5);
        System.out.println("Ganancias semanales: $" + gananciasSemanales);
    }

    public void resumenCurso(entiCurso curso) {
        System.out.println("Nombre del curso: " + curso.getNombreCurso());
        System.out.println("Pichones: ");
        System.out.println(Arrays.toString(curso.getAlumnos()));
        System.out.println("Cantidad de horas por dia: " + curso.getCantidadHorasPorDia());
        System.out.println("Cantidad de dias por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: $" + curso.getPrecioPorHora());
        calcularGananciaSemanal(curso);
    }
}

