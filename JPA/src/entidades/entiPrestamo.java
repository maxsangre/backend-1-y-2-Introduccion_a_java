/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Sangre
 */
 @Entity
@Table(name = "prestamo")
public class entiPrestamo {
   

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    @OneToOne
    private entiLibros libro;
    @OneToOne
    private entiClientes cliente;

    public entiPrestamo() {
    }

    public entiPrestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, entiLibros libro, entiClientes cliente) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }


    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public entiLibros getLibro() {
        return libro;
    }

    public void setLibro(entiLibros libro) {
        this.libro = libro;
    }

    public entiClientes getCliente() {
        return cliente;
    }

    public void setCliente(entiClientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", libro=" + libro.getTitulo() +
                ", cliente=" + cliente.getNombre() + ", dni=" + cliente.getDocumento() +
                '}';
    }
}
