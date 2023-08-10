/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosServicios;

import Max1.ApellidosExt02;
import Max1.NombresEx02;
import ejercicios.entidades.entiButacasEx02;
import ejercicios.entidades.entiCineEx02;
import ejercicios.entidades.entiEspectadorEX02;
import ejercicios.entidades.entiPeliculaEx02;
import ejercicios.entidades.entiSalaEx02;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Sangre
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
public class servCineEx02 {
 entiButacasEx02[][] asientos = new entiButacasEx02[8][6];
    String[] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
    String[] columnas = {"A", "B", "C", "D", "E", "F"};
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public entiPeliculaEx02 crearPelicula() {
        entiPeliculaEx02 peliculaX = new entiPeliculaEx02();
        System.out.println("Ingrese el nombre de la Pelicula:");
        peliculaX.setTitulo(leer.next());
        System.out.println("Ingrese la duracion de la Pelicula:");
        peliculaX.setDuracion(leer.nextDouble());
        System.out.println("Ingrese la edad minima de la Pelicula:");
        peliculaX.setEdadMinima(leer.nextInt());
        System.out.println("Ingrese el director de la Pelicula:");
        peliculaX.setDirector(leer.next());
        return peliculaX;
    }

    public entiCineEx02 crearCine(entiPeliculaEx02 pelicula, entiSalaEx02 salaCine, double precio) {
        entiCineEx02 cineX = new entiCineEx02(pelicula, salaCine, precio);
        return cineX;
    }

    public entiEspectadorEX02 crearEspectadores() {
        Random random = new Random();
        entiEspectadorEX02 espectadorObj = new entiEspectadorEX02();
        espectadorObj.setNombre(NombresEx02.values()[random.nextInt(NombresEx02.values().length)].name());
        espectadorObj.setApellido(ApellidosExt02.values()[random.nextInt(ApellidosExt02.values().length)].toString());
        espectadorObj.setEdad(random.nextInt(99) + 1);
        espectadorObj.setDineroDisponible(random.nextInt(3000) + 400);
        return espectadorObj;
    }

    public entiSalaEx02 crearSalaCine() {

        entiSalaEx02 salaX = new entiSalaEx02(asientos, filas, columnas);
        //Asignar valores a los asientos
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                Random random = new Random();
                int randomNum = random.nextInt(2);
                if (randomNum == 0) {
                    asientos[i][j] = new entiButacasEx02(filas[i], columnas[j], " ");
                } else {
                    asientos[i][j] = new entiButacasEx02(filas[i], columnas[j], "X");
                }
            }
        }
        salaX.setPelicula(crearPelicula());
        return salaX;
    }

    public void mostrarSalaCine(entiCineEx02 cine, entiSalaEx02 salaCine) {
        System.out.println("Pelicula: " + salaCine.getPelicula().getTitulo());
        System.out.println("Precio : " + cine.getPrecio());
        for (entiButacasEx02[] butacas : salaCine.getButacas()) {
            for (entiButacasEx02 butaca : butacas) {
                System.out.print(butaca);
            }
            System.out.println(" ");
        }
    }

    public void venderButaca(entiCineEx02 cine, entiSalaEx02 salaCine, entiEspectadorEX02 espectador) {
        //Validar que el espectador tenga la edad minima
        boolean mayorEdad = espectador.getEdad() >= salaCine.getPelicula().getEdadMinima();
        if (!mayorEdad) {
            System.out.println("Espectador menor de edad");
        }
        //Validar que el espectador tenga dinero suficiente
        boolean dineroSuficiente = espectador.getDineroDisponible() >= cine.getPrecio();
        if (!dineroSuficiente) {
            System.out.println("Espectador no cuenta con dinero suficiente");
        }
        if (mayorEdad && dineroSuficiente) {
            boolean ubicado = false;
            do {
                System.out.println("Ingrese la fila de la Butaca (1,2,3,4,5,6,7,8)");
                String fila = leer.next();
                int filas = Math.abs(Integer.parseInt(fila) - 8);
                System.out.println("Ingrese la columna de la Butaca (A/1 B/2 C/3 D/4 E/5 F/6)");
                String columna = leer.next();
                int columnas = Integer.parseInt(columna) - 1;
                //Validar Butaca disponible
                if (asientos[filas][columnas].getEstado().equals(" ")) {
                    asientos[filas][columnas].setEstado("X");
                    System.out.println("Se ha vendido la Butaca");
                    espectador.setDineroDisponible(espectador.getDineroDisponible() - cine.getPrecio());
                    ubicado = true;
                } else {
                    System.out.println("Butaca no disponible");
                }
            } while (!ubicado);
            mostrarSalaCine(cine, salaCine);
        }
    }
}

   