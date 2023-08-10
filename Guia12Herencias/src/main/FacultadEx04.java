
import entidades.entiEmpleadosEx04;
import entidades.entiEstudianteEx04;
import entidades.entiPersonaEx04;
import entidades.entiProfesoresEx04;
import entidades.personalDeServicioEx04;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class FacultadEx04 {

    /**
     * @param args the command line arguments
     * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
     */

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<entiPersonaEx04> personaArrayList = new ArrayList<>();
        entiPersonaEx04 persona = new entiEstudianteEx04("Max", "Ybañez", 498635, "Soltero", "EGG");
        personaArrayList.add(persona);
        entiPersonaEx04 persona2 = new personalDeServicioEx04("Alcides", "Amargo", 167945, "Casado", 2021, 7, "Amargismo");
        personaArrayList.add(persona2);
        entiPersonaEx04 persona3 = new entiProfesoresEx04("Ignacio", "Quiroga", 287619, "viudo", 2021, 7, "Alpedismo");
        personaArrayList.add(persona3);

        persona.cambiarEstadoCivil();
        ((entiEmpleadosEx04) persona2).reasignarDespacho();
        ((entiEstudianteEx04) persona).matricular();
        ((entiProfesoresEx04) persona3).cambioDeDepartamento();

        System.out.println("--------------------");
        for (entiPersonaEx04 personas : personaArrayList) {
            System.out.println(personas);
        }
    }
}

    


