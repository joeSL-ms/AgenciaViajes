package com.agentTravel.travels.model;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paises")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpais")
    private Long idPais;
    @Column(name = "codigopais")
    private String codigoPais;
    @Column(name = "nombrepais")
    private  String nombrePais;
    @ManyToOne
    @JoinColumn(name = "idcontinente", nullable = false)
    private Continente continente;
    @OneToMany(mappedBy = "pais",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Region> regiones = new ArrayList<>();

    public Pais(){}

    public Pais(Long idPais, String codigoPais, String nombrePais, Continente continente) {
        this.idPais = idPais;
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
        this.continente = continente;
    }
    //Getters

    public Long getIdPais() {
        return idPais;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public Continente getContinente() {
        return continente;
    }

    public List<Region> getRegiones() {
        return regiones;
    }

    //Setters

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public void setRegiones(List<Region> regiones) {
        this.regiones = regiones;
    }
    //Methods
}
