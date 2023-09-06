/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.prueba.PruebaTaller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author cg_sa
 */
@Entity 
@Table(name="marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String nombre;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
}
