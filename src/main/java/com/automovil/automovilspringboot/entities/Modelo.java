package com.automovil.automovilspringboot.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Embeddable
@Table(name = "modelo")
public class Modelo implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idModelo")
    private Integer idModelo;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Precio")
    private Integer precio;

    public Modelo() {

    }

    public Modelo(Integer idModelo, String nombre, Integer precio) {
        this.idModelo = idModelo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "idModelo=" + idModelo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Integer getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
