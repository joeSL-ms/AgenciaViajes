package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tipopasajeros")
public class TipoPasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipospasajeros")
    private Long idTipoPasajeros;
    @Column(name = "tipopasajero")
    private String tipoPasajero;
    private int descuento;
    @OneToMany(mappedBy = "tipoPasajero", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Billete> billetes = new ArrayList<>();

    public TipoPasajero(){}

    public TipoPasajero(Long idTipoPasajeros, String tipoPasajero, int descuento) {
        this.idTipoPasajeros = idTipoPasajeros;
        this.tipoPasajero = tipoPasajero;
        this.descuento = descuento;
    }
    //Getters

    public Long getIdTipoPasajeros() {
        return idTipoPasajeros;
    }

    public String getTipoPasajero() {
        return tipoPasajero;
    }

    public int getDescuento() {
        return descuento;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    //Setters

    public void setIdTipoPasajeros(Long idTipoPasajeros) {
        this.idTipoPasajeros = idTipoPasajeros;
    }

    public void setTipoPasajero(String tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }
    //Methods
}
