package com.automovil.automovilspringboot.dtos;


import com.automovil.automovilspringboot.entities.Opcion;
import org.modelmapper.ModelMapper;

import java.io.Serializable;

public class OpcionDTO implements Serializable {


    private Integer id;

    private String descripcion;

    private Integer precio;

    public OpcionDTO() {

    }

    public OpcionDTO(Integer id, String descripcion, Integer precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
