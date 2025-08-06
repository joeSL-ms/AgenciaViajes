package com.agentTravel.travels.model;

import jakarta.persistence.*;
import jdk.jfr.Unsigned;

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
    private List<Region> regiones;
}
