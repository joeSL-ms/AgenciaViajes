package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tipospago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipopago")
    private Long idTipoPago;
    private String metodo;
    @OneToMany(mappedBy = "tipoPago", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas = new ArrayList<>();

    public TipoPago(){}

    public TipoPago(Long idTipoPago, String metodo) {
        this.idTipoPago = idTipoPago;
        this.metodo = metodo;
    }
    //Getters

    public Long getIdTipoPago() {
        return idTipoPago;
    }

    public String getMetodo() {
        return metodo;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    //Setters

    public void setIdTipoPago(Long idTipoPago) {
        this.idTipoPago = idTipoPago;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    //Methods
}
