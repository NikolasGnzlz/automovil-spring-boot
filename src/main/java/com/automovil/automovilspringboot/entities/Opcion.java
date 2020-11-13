package com.automovil.automovilspringboot.entities;

import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "opciones" )
public class Opcion  implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "Precio")
    private Integer precio;



    public Opcion() {
        super();
    }

    public Opcion(Integer id, String descripcion, Integer precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Opcion{" +
                ", idOpcion=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }





}
