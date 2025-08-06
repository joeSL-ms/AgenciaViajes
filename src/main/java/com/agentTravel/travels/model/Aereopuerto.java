package com.agentTravel.travels.model;

import jakarta.persistence.*;

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
    private List<Billete> billetesOrigen;
    @OneToMany(mappedBy = "destino", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Billete> billetesDestino;

}
