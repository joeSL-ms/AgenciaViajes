package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "detallefacturabilletes")
public class DetalleFacturaBillete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalle")
    private Long idDetalle;
    @ManyToOne
    @JoinColumn(name = "idfactura", nullable = false)
    private Factura factura;
    @ManyToOne
    @JoinColumn(name = "idbillete",nullable = false)
    private Billete billete;
    @Column(name = "preciounitario")
    private BigDecimal precioUnitario;
    private int cantidad;

    public DetalleFacturaBillete(){}

    public DetalleFacturaBillete(Long idDetalle, Factura factura, Billete billete, BigDecimal precioUnitario, int cantidad) {
        this.idDetalle = idDetalle;
        this.factura = factura;
        this.billete = billete;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    //Getters

    public Long getIdDetalle() {
        return idDetalle;
    }

    public Factura getFactura() {
        return factura;
    }

    public Billete getBillete() {
        return billete;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Setters

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setBillete(Billete billete) {
        this.billete = billete;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
