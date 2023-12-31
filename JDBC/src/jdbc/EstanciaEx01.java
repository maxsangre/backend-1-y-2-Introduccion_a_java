
import java.util.Scanner;
import servicio.ServFamiliasEx01;
import servicio.servCasaEx01;
import servicio.servClientesEx01;
import servicio.servComentariosEx01;
import servicio.servEstanciaEx01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class EstanciaEx01 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
      
        /**
         * Nos han pedido que hagamos una aplicación Java de consola para una
         * pequeña empresa que se dedica a organizar estancias en el extranjero
         * dentro de una familia. El objetivo es el desarrollo del sistema de
         * reserva de casas para realizar estancias en el exterior, utilizando
         * el lenguaje JAVA, una base de datos MySQL y JDBC para realizar la
         * ejecución de operaciones sobre la base de datos (BD).
         */
        /*
        Realizar un menú en java a través del cual se permita elegir qué consulta se desea realizar. 
        Las consultas a realizar sobre la BD son las siguientes:
        a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
        b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 
        2020 y el 31 de agosto de 2020 en Reino Unido.
        c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
        d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada 
        y un número de días específico.
        e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la 
        descripción de la casa donde la realizaron.
        17
        f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y 
        ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a 
        la anterior
        g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el 
        precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios 
        actualizados.
        h) Obtener el número de casas que existen para cada uno de los países diferentes.
        i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) 
        que están ‘limpias’.
        j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
         */

        servCasaEx01 casasS = new servCasaEx01();
        servClientesEx01 clienteS = new servClientesEx01();
        servComentariosEx01 comentS = new servComentariosEx01();
        servEstanciaEx01 estanS = new servEstanciaEx01();
        ServFamiliasEx01 famiS = new ServFamiliasEx01();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            String opc;
            do{
            mostrarMenu();
            opc = leer.next().toLowerCase();

            switch (opc) {
                case "1":
                    famiS.listarFamilias(opc);
                    break;
                case "2":
                    casasS.listarCasas(opc);
                    break;
                case "3":
                    famiS.listarFamilias(opc);
                    break;
                case "4":
                    casasS.listarCasas(opc);
                    break;
                case "5":
                case "6":
                case "7":
                    casasS.listarCasas(opc);
                    break;
                case "8":
                    casasS.listarCasas(opc);
                    break;
                case "9":
                    casasS.listarCasas(opc);
                    break;
                case "10":
                case "s":
                    System.out.println("Nos vemos Amiguin...");
                    break;
                default:
                    System.out.println("OPCION INVALIDA vuelva a ingresar Gil : ");
                    opc = leer.next().toLowerCase();               
            }
            }while ( !"k".equals(opc) );
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void mostrarMenu() {

        System.out.println("\n 1) Familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años."
                + "        \n 2) Casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido."
                + "        \n 3) Familias cuya dirección de mail sea de Hotmail."
                + "        \n 4) Casas disponibles a partir de una fecha dada y un número de días específico."
                + "        \n 5) Datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron"
                + "        \n 6) Mostrar las estancias que han sido reservadas por un cliente, información de la casa que reservó."
                + "        \n 7) Incrementar el precio por día en un 5% de todas las casas del Reino Unido."
                + "        \n 8) Obtener el número de casas que existen para cada uno de los países diferentes."
                + "        \n 9) Casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’."
                + "        \n 10) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas."
                + "        \n S) Salir"
                + " \n Ingrese la Opcicion Deseada : ");

    }

}
    


