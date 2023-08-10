/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.entidades;

/**
 *
 * @author Sangre
 */
public class entiVehiculoEx03 {
      private String marca;
    private String modelo;
    private int anio;
    private double numeroMotor;
    private String chasis;
    private String color;
    private String tipo;
    private entiPolizaEx03 poliza;
    private entiClienteEx03 cliente;

    public entiVehiculoEx03() {
    }

    public entiVehiculoEx03(String marca, String modelo, int anio, double numeroMotor, String chasis, String color, String tipo, entiPolizaEx03 poliza) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.poliza = poliza;
    }

    public entiClienteEx03 getCliente() {
        return cliente;
    }

    public void setCliente(entiClienteEx03 cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(double numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public entiPolizaEx03 getPoliza() {
        return poliza;
    }

    public void setPoliza(entiPolizaEx03 poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Entidad.entiVehiculoEx03{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", numeroMotor=" + numeroMotor +
                ", chasis='" + chasis + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                ", poliza=" + poliza +
                ", cliente=" + cliente +
                '}';
    }
}

