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
}
