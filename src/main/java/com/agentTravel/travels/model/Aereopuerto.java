package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aeropuertos")
public class Aereopuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaeropuerto")
    private Long idAeropuerto;
    @Column(name = "nombreaeropuerto")
    private String nombreAeropuerto;
    private String identidad;
    @ManyToOne
    @JoinColumn(name = "tipoaeropuerto",nullable = false)
    private TipoAeropuerto tipoAeropuerto;
    @ManyToOne
    @JoinColumn(name = "idregion",nullable = false)
    private Region region;
    @ManyToOne
    @JoinColumn(name = "idmunicipalidad")
    private Municipalidad municipalidad;
    private double longitud;
    private double latitud;
    @OneToMany(mappedBy = "origen", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Billete> billetesOrigen = new ArrayList<>();
    @OneToMany(mappedBy = "destino", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Billete> billetesDestino = new ArrayList<>();

    public Aereopuerto(){}

    public Aereopuerto(Long idAeropuerto, String nombreAeropuerto, String identidad, TipoAeropuerto tipoAeropuerto, Region region, Municipalidad municipalidad, double longitud, double latitud, List<Billete> billetesOrigen, List<Billete> billetesDestino) {
        this.idAeropuerto = idAeropuerto;
        this.nombreAeropuerto = nombreAeropuerto;
        this.identidad = identidad;
        this.tipoAeropuerto = tipoAeropuerto;
        this.region = region;
        this.municipalidad = municipalidad;
        this.longitud = longitud;
        this.latitud = latitud;
        this.billetesOrigen = billetesOrigen;
        this.billetesDestino = billetesDestino;
    }

    //Getters

    public Long getIdAeropuerto() {
        return idAeropuerto;
    }

    public String getNombreAeropuerto() {
        return nombreAeropuerto;
    }

    public String getIdentidad() {
        return identidad;
    }

    public TipoAeropuerto getTipoAeropuerto() {
        return tipoAeropuerto;
    }

    public Region getRegion() {
        return region;
    }

    public Municipalidad getMunicipalidad() {
        return municipalidad;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public List<Billete> getBilletesOrigen() {
        return billetesOrigen;
    }

    public List<Billete> getBilletesDestino() {
        return billetesDestino;
    }
    //setters

    public void setIdAeropuerto(Long idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setTipoAeropuerto(TipoAeropuerto tipoAeropuerto) {
        this.tipoAeropuerto = tipoAeropuerto;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setMunicipalidad(Municipalidad municipalidad) {
        this.municipalidad = municipalidad;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setBilletesOrigen(List<Billete> billetesOrigen) {
        this.billetesOrigen = billetesOrigen;
    }

    public void setBilletesDestino(List<Billete> billetesDestino) {
        this.billetesDestino = billetesDestino;
    }
    //Methods
}
