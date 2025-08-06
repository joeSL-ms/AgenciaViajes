package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfactura")
    private Long idFactura;
    @Column(name = "fechaemision")
    private Date fechaEmision;
    @Column(name = "preciototal")
    private BigDecimal precioTotal;
    @ManyToOne
    @JoinColumn(name = "idestado", nullable = false)
    private EstadoFactura estadoFactura;
    @ManyToOne
    @JoinColumn(name = "idtipopago",nullable = false)
    private TipoPago tipoPago;
    @ManyToOne
    @JoinColumn(name = "idempleado",nullable = false)
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "idusuario",nullable = false)
    private Usuario usuario;
    @Column(name = "fechacreacion")
    private Date fechaCreacion;
    @Column(name = "fechamodificacion")
    private Date fechaModificacion;
    @OneToMany(mappedBy = "factura",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<DetalleFacturaBillete> detalleFacturaBilletes;
}
