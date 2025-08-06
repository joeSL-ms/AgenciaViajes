package com.agentTravel.travels.model;

import jakarta.persistence.*;

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
    private List<Aereopuerto> aereopuertos;
}
