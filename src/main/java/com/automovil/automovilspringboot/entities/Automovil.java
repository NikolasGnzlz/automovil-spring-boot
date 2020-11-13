package com.automovil.automovilspringboot.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "automovil")
public class Automovil implements Serializable {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Integer id;

        @OneToOne
        @JoinColumn(name = "idModeloAuto", referencedColumnName = "idModelo")
        private Modelo modelo;

        @Column(name= "Cantidad_Opciones")
        private Integer cantOpciones;

        @Column(name = "Precio_Total")
        private Integer precioTotal = 0;

    public Automovil() {

    }

    public Automovil(Integer id, Modelo modelo, Integer cantOpciones, Integer precioTotal) {
        this.id = id;
        this.modelo = modelo;
        this.cantOpciones = cantOpciones;
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", modelo=" + modelo +
                ", cantOpciones=" + cantOpciones +
                ", precioTotal=" + precioTotal +
                '}';
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
