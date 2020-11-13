package com.automovil.automovilspringboot.dtos;

import com.automovil.automovilspringboot.entities.Modelo;
import com.automovil.automovilspringboot.entities.Opcion;

import java.io.Serializable;
import java.util.Set;

public class AutomovilDTO implements Serializable {

    private Integer id;

    private Modelo modelo;

    private Integer cantOpciones;

    private Integer precioTotal = 0;

    public AutomovilDTO() {

    }

    public AutomovilDTO(Integer id, Modelo modelo, Integer cantOpciones, Integer precioTotal) {
        this.id = id;
        this.modelo = modelo;
        this.cantOpciones = cantOpciones;
        this.precioTotal = precioTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Integer getCantOpciones() {
        return cantOpciones;
    }

    public void setCantOpciones(Integer cantOpciones) {
        this.cantOpciones = cantOpciones;
    }

    public Integer getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }


}

