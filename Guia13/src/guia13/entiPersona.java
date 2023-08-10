/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13;

/**
 *
 * @author Sangre
 * *Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.*/
 
public class entiPersona {

   
    
    private String Nombre;
    private int Edad;
    private String sexo;
    private float peso;
    private float altura;
    
    public entiPersona(){}

    public entiPersona(String Nombre, int Edad, String sexo, float peso, float altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "te mando esto de entidad personas{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
     }
