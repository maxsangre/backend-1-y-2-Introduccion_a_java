/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.entidades;

import java.util.ArrayList;

/**
 *
 * @author Sangre
 */
public class entiClienteEx03 {
     private String nombre;
    private String apellido;
    private double documento;
    private String mail;
    private String domicilio;
    private String telefono;
    private ArrayList<entiVehiculoEx03> vehiculoArrayList = new ArrayList<>();
    private ArrayList<entiPolizaEx03> polizaArrayList = new ArrayList<>();

    public entiClienteEx03() {

    }

    public entiClienteEx03(String nombre, String apellido, double documento, String mail, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public ArrayList<entiPolizaEx03> getPolizaArrayList() {
        return polizaArrayList;
    }

    public void setPolizaArrayList(ArrayList<entiPolizaEx03> polizaArrayList) {
        this.polizaArrayList = polizaArrayList;
    }

    public ArrayList<entiVehiculoEx03> getVehiculoArrayList() {
        return vehiculoArrayList;
    }

    public void setVehiculoArrayList(ArrayList<entiVehiculoEx03> vehiculoArrayList) {
        this.vehiculoArrayList = vehiculoArrayList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Entidad.entiClienteEx03{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", mail='" + mail + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                ", vehiculoArrayList=" + vehiculoArrayList +
                ", polizaArrayList=" + polizaArrayList +
                '}';
    }
}

