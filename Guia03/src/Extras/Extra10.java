package Extras;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Extra10 {

    /**MaxSangre
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos 
     * números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta 
     * es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta 
     * nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     */

    public static void main(String[] args) {
     int sangre1 = (int) (Math.random() * 10) + 1;
        int sangre2 = (int) (Math.random() * 10) + 1;
        int rto = sangre1 * sangre2;
        System.out.println("Numero 1: " + sangre1);
        System.out.println("Numero 2: " + sangre2);
        System.out.println("Resultado: " + rto);
        JOptionPane.showMessageDialog(null, "Vamos a jugar al Nuevo MaxGame!");
        JOptionPane.showMessageDialog(null, "Adivinar el resultado de la multiplicacion de dos numeros entre 0 y 10.");

        do {
            int rta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el resultado de la multiplicacion:"));
            if (rta == rto) {
                JOptionPane.showMessageDialog(null, "Adivinaste Muy Bien, No eres tan Gil como Pense..!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ese no es el resultado, BABOSO.. vamos nuevamente...");
            }
        } while (true);
    }
}
    


