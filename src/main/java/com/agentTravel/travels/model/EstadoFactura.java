package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "estadofacturas")
public class EstadoFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestado")
    private Long idEstado;
    private String estado;
    @OneToMany(mappedBy = "estadoFactura", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Factura> facturas = new ArrayList<>();

    public EstadoFactura(){}

    public EstadoFactura(Long idEstado, String estado) {
        this.idEstado = idEstado;
        this.estado = estado;
    }

    //Getters

    public Long getIdEstado() {
        return idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    //Setters

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    //Methods
}
