/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Sangre
 */
@Entity
@Table(name = "libro")
public class entiLibros {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long isbn;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "year")
    private Integer year;
    @Column(name = "ejemplares")
    private Integer ejemplares;
    @Column(name = "ejemplaresPrestados")
    private Integer ejemplaresPrestados;
    @Column(name = "ejemplaresRestantes")
    private Integer ejemplaresRestantes;
    @Column(name = "alta")
    private Boolean alta = true;
    @OneToOne
    @JoinColumn(name = "autor_id")
    private entiAutor autor;
    @OneToOne
    @JoinColumn(name = "editorial_id")
    private entiEditorial editorial;

    public entiLibros() {
    }


    public long getIsbn() {
        return isbn;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public entiAutor getAutor() {
        return autor;
    }

    public void setAutor(entiAutor autor) {
        this.autor = autor;
    }

    public entiEditorial getEditorial() {
        return editorial;
    }

    public void setEditorial(entiEditorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", year=" + year +
                ", ejemplares=" + ejemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                ", ejemplaresRestantes=" + ejemplaresRestantes +
                ", alta=" + alta +
                ", autor=" + autor.getNombre() +
                ", editorial=" + editorial.getNombre() +
                '}';
    }


}

