package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfactura")
    private Long idFactura;
    @Column(name = "fechaemision")
    private LocalDateTime fechaEmision;
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
    private LocalDateTime fechaCreacion;
    @Column(name = "fechamodificacion")
    private LocalDateTime fechaModificacion;
    @OneToMany(mappedBy = "factura",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<DetalleFacturaBillete> detalleFacturaBilletes = new ArrayList<>();

    public Factura(){}

    public Factura(Long idFactura, LocalDateTime fechaEmision, BigDecimal precioTotal, EstadoFactura estadoFactura, TipoPago tipoPago, Empleado empleado, Usuario usuario, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion) {
        this.idFactura = idFactura;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
        this.estadoFactura = estadoFactura;
        this.tipoPago = tipoPago;
        this.empleado = empleado;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }
    //Getters

    public Long getIdFactura() {
        return idFactura;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public EstadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public List<DetalleFacturaBillete> getDetalleFacturaBilletes() {
        return detalleFacturaBilletes;
    }

    //Setters

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setEstadoFactura(EstadoFactura estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setDetalleFacturaBilletes(List<DetalleFacturaBillete> detalleFacturaBilletes) {
        this.detalleFacturaBilletes = detalleFacturaBilletes;
    }

    //Methods
}
