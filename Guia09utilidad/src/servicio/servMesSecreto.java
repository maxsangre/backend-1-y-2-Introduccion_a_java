/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Sangre
 * Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los
 * doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y 
 * hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario
 * que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a
 * intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
public class servMesSecreto {
    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio","agosto","septiembre","octubre","noviembre","diciembre"};
//String mesSecreto;
String mesSecreto = mes[3];
public servMesSecreto() {
        }

        public servMesSecreto(String[] mes, String mesSecreto) {
                this.mes = mes;
                this.mesSecreto = mesSecreto;
        }

        public String[] getMes() {
        return mes;
        }

public void setMes(String[] mes) {
        this.mes = mes;
        }

        

        public String getMesSecreto() {
                return mesSecreto;
        }

        public void setMesSecreto(String mesSecreto) {
                this.mesSecreto = mesSecreto;
        }
}

