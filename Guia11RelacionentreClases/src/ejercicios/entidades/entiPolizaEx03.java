/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.entidades;

import java.util.Calendar;

/**
 *
 * @author Sangre
 */
public class entiPolizaEx03 {
     private int numeroPoliza;
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private int cantidadCuotas;
    private String formaPago;
    private double montoAsegurado;
    private boolean granizo;
    private double montoMaximoGranizo;
    private String tipoCobertura;
    private entiVehiculoEx03 vehiculo;
    private entiClienteEx03 cliente;
    private boolean pagada;

    public entiPolizaEx03() {
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public entiVehiculoEx03 getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(entiVehiculoEx03 vehiculo) {
        this.vehiculo = vehiculo;
    }

    public entiClienteEx03 getCliente() {
        return cliente;
    }

    public void setCliente(entiClienteEx03 cliente) {
        this.cliente = cliente;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    @Override
    public String toString() {
        return "Entidad.entiPolizaEx03{" +
                "numeroPoliza=" + numeroPoliza +
                '}';
    }
}

