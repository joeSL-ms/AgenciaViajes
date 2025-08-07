package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "billetes")
public class Billete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbillete")
    private Long idBillete;
    @Column(name = "fechaida")
    private LocalDate fechaIda;
    @Column(name = "fechavuelta")
    private  LocalDate fechaVuelta;
    private String asiento;
    @ManyToOne
    @JoinColumn(name = "tipopasajero",nullable = false)
    private TipoPasajero tipoPasajero;
    @ManyToOne
    @JoinColumn(name = "idpasajero", nullable = false)
    private Pasajero pasajero;
    @ManyToOne
    @JoinColumn(name = "idestadobillete")
    private EstadoBillete estadoBillete;
    private BigDecimal precio;
    @Column(name = "fechacreacion")
    private LocalDateTime  fechaCreacion;
    @Column(name = "fechamodificacion")
    private LocalDateTime fechaModificacion;
    @ManyToOne
    @JoinColumn(name = "idorigen", nullable = false)
    private Aereopuerto origen;
    @ManyToOne
    @JoinColumn(name = "iddestino", nullable = false)
    private Aereopuerto destino;
    @OneToMany(mappedBy = "billete", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<DetalleFacturaBillete> detalleFacturaBilletes = new ArrayList<>();

    public Billete(){}

    public Billete(Long idBillete, LocalDate fechaIda, LocalDate fechaVuelta, String asiento, TipoPasajero tipoPasajero, Pasajero pasajero, EstadoBillete estadoBillete, BigDecimal precio, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion, Aereopuerto origen, Aereopuerto destino) {
        this.idBillete = idBillete;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.asiento = asiento;
        this.tipoPasajero = tipoPasajero;
        this.pasajero = pasajero;
        this.estadoBillete = estadoBillete;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.origen = origen;
        this.destino = destino;
    }

    //Getters

    public Long getIdBillete() {
        return idBillete;
    }

    public LocalDate getFechaIda() {
        return fechaIda;
    }

    public LocalDate getFechaVuelta() {
        return fechaVuelta;
    }

    public String getAsiento() {
        return asiento;
    }

    public TipoPasajero getTipoPasajero() {
        return tipoPasajero;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public EstadoBillete getEstadoBillete() {
        return estadoBillete;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public Aereopuerto getOrigen() {
        return origen;
    }

    public Aereopuerto getDestino() {
        return destino;
    }

    public List<DetalleFacturaBillete> getDetalleFacturaBilletes() {
        return detalleFacturaBilletes;
    }

    //Setters

    public void setIdBillete(Long idBillete) {
        this.idBillete = idBillete;
    }

    public void setFechaIda(LocalDate fechaIda) {
        this.fechaIda = fechaIda;
    }

    public void setFechaVuelta(LocalDate fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void setTipoPasajero(TipoPasajero tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setEstadoBillete(EstadoBillete estadoBillete) {
        this.estadoBillete = estadoBillete;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public void setOrigen(Aereopuerto origen) {
        this.origen = origen;
    }

    public void setDestino(Aereopuerto destino) {
        this.destino = destino;
    }

    public void setDetalleFacturaBilletes(List<DetalleFacturaBillete> detalleFacturaBilletes) {
        this.detalleFacturaBilletes = detalleFacturaBilletes;
    }

    //Methods
}
