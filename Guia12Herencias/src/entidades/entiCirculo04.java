/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Sangre
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class entiCirculo04 {
     protected double radio;
    protected double pi = 3.14;
    protected double area;
    protected double perimetro;

    public entiCirculo04(double radio) {
        this.radio = radio;
    }

    public entiCirculo04() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

  
    public double calcularArea() {
        this.area = pi * Math.pow(radio, 2);
        return area;
    }


    public double calcularPerimetro() {
        this.perimetro = 2 * pi * radio;
        return perimetro;
 
    }

    @Override
    public String toString() {
        return "entiCirculo04{" + "radio=" + radio + ", pi=" + pi + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
}

