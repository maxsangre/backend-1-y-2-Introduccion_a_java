/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.*;

/**
 *
 * @author Sangre
 */

 @Entity    
@Table(name="autor")
 
public class entiAutor {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
@Column(name="nombre")
private String nombre;
@Column(name="alta")
private Boolean alta=true;

public entiAutor(){
}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

  

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }
  @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alta=" + alta +
                '}';
   
    
    }
    }




