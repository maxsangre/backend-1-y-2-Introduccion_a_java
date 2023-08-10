
import ejercicios.entidades.entiCineEx02;
import ejercicios.entidades.entiEspectadorEX02;
import ejercicios.entidades.entiSalaEx02;
import ejerciciosServicios.servCineEx02;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Ex02Cine {

    /**MaxSangre
     * @param args the command line arguments
     * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
     */

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        servCineEx02 cineService = new servCineEx02();
        entiSalaEx02 salaCine = cineService.crearSalaCine();
        ArrayList<entiEspectadorEX02> espectadores = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            espectadores.add(cineService.crearEspectadores());
        }

        System.out.println("Ingrese el precio de las peliculas:");
        double precio = leer.nextDouble();

        entiCineEx02 cine = cineService.crearCine(salaCine.getPelicula(), salaCine, precio);
        cineService.mostrarSalaCine(cine, salaCine);
        for (int i = 0; i < espectadores.size(); i++) {
            System.out.println("Vendiendo butaca a: " + espectadores.get(i).getNombre()+ espectadores.get(i).getApellido());
         
            System.out.println("Dinero disponible: " + espectadores.get(i).getDineroDisponible());
            System.out.println("Edad: " + espectadores.get(i).getEdad());
            cineService.venderButaca(cine, salaCine, espectadores.get(i));
        }
    }
}
    


