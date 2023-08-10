
import entidades.entiCirculo04;
import entidades.entiRectangulo04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Calculos04 {

    /**
     * @param args the command line arguments
     * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
     * de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a 
* repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que
* tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
* interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y 
* se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
     */

    public static void main(String[] args) {
       /**
         * En el main se crearán las formas y se mostrará el
         * resultado final.
         */
        entiRectangulo04 rectanguloMax1 = new entiRectangulo04(5d, 10d);
        System.out.println("Area del rectangulo: " + rectanguloMax1.calcularArea() + " Perimetro: " + rectanguloMax1.calcularPerimetro());
        entiRectangulo04 rectanguloMax2 = new entiRectangulo04(42d, 20d);
        System.out.println("Area del rectangulo: " + rectanguloMax2.calcularArea() + " Perimetro: " + rectanguloMax2.calcularPerimetro());
        entiCirculo04 circuloMax1 = new entiCirculo04(15d);
        System.out.println("Area del circulo: " + circuloMax1.calcularArea() + " Perimetro: " + circuloMax1.calcularPerimetro());
        entiCirculo04 circuloMax2 = new entiCirculo04(25d);
        System.out.println("Area del circulo: " + circuloMax2.calcularArea() + " Perimetro: " + circuloMax2.calcularPerimetro());
    }
}
    


