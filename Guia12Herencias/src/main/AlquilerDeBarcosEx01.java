

import entidades.AlquilerEx01;
import entidades.BarcoEx01;
import entidades.YateEx01;
import entidades.barcoMotorEx01;
import entidades.veleroEx01;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.servAlquilerEx01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class AlquilerDeBarcosEx01 {

    /**
     * @param args the command line arguments
     * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
     */

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servAlquilerEx01 alquilerServicios = new servAlquilerEx01();

        ArrayList<BarcoEx01> barcoArrayList = new ArrayList<>();

        veleroEx01 veleroObj = new veleroEx01("MAX789", 20d, 2020, 3);
        barcoArrayList.add(veleroObj);
        barcoMotorEx01 barcoObJ = new barcoMotorEx01("MAX123", 50d, 2012, 10);
        barcoArrayList.add(barcoObJ);
        YateEx01 yateObj = new YateEx01("MAX456", 30d, 2022, 110, 3);
        barcoArrayList.add(yateObj);

        System.out.println("Qué tipo de barco desea amarrar");
        System.out.println("");
        for (BarcoEx01 aux : barcoArrayList) {
            if (aux instanceof veleroEx01) {
                System.out.println("Velero: "+"Nº de Matricula " + aux.getMatricula()+ " Año de Fabricacion: "+aux.getAnioFabricacion()+" Mastil Nº "+((veleroEx01) aux).getNumMastiles()+" Espora "+aux.getEslora());
           System.out.println("");
            }
            if (aux instanceof barcoMotorEx01) {
                System.out.println("Barco a Motor: Nº de matricula " + aux.getMatricula()+" Año de Fabricacion: "+aux.getAnioFabricacion()+" Potencia: "+((barcoMotorEx01) aux).getPotenciaCV()+" Espora "+aux.getEslora());
            System.out.println("");
            }
            if (aux instanceof YateEx01) {
                System.out.println("Yate: Nº de Matricula  " + aux.getMatricula()+" Año de Fabricacion: "+aux.getAnioFabricacion()+" Cantidad de Camarotes: "+((YateEx01) aux).getNumCamarotes()+" Potencia: "+((YateEx01) aux).getPotenciaCV());
                System.out.println("");
                System.out.println("Ingreses la matricula del barco a amarrar");
            }
        }
        String barcoAlquiler = leer.next();
        for (BarcoEx01 aux : barcoArrayList) {
            if (aux.getMatricula().equalsIgnoreCase(barcoAlquiler)) {
                AlquilerEx01 alquiler = new AlquilerEx01();
                AlquilerEx01 alquilerBarco = alquiler.alquiler(aux);
                aux.setAlquiler(alquilerBarco);
                aux.totalAlquiler();
            }
        }
        alquilerServicios.mostrarAlquileres(veleroObj);
        alquilerServicios.mostrarAlquileres(barcoObJ);
        //DONE
    }
    
}