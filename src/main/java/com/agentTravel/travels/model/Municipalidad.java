package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "municipalidades")
public class Municipalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmunicipalidad")
    private Long idMunicipalidad;
    @Column(name = "nombremunicipalidad")
    private String nombreMunicipalidad;
    @OneToMany(mappedBy = "municipalidad", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aereopuerto> aereopuertos = new ArrayList<>();

    public Municipalidad(){}

    public Municipalidad(Long idMunicipalidad, String nombreMunicipalidad) {
        this.idMunicipalidad = idMunicipalidad;
        this.nombreMunicipalidad = nombreMunicipalidad;
    }
    //Getters

    public Long getIdMunicipalidad() {
        return idMunicipalidad;
    }

    public String getNombreMunicipalidad() {
        return nombreMunicipalidad;
    }

    public List<Aereopuerto> getAereopuertos() {
        return aereopuertos;
    }

    //Setters

    public void setIdMunicipalidad(Long idMunicipalidad) {
        this.idMunicipalidad = idMunicipalidad;
    }

    public void setNombreMunicipalidad(String nombreMunicipalidad) {
        this.nombreMunicipalidad = nombreMunicipalidad;
    }

    public void setAereopuertos(List<Aereopuerto> aereopuertos) {
        this.aereopuertos = aereopuertos;
    }

    //Methods
}
