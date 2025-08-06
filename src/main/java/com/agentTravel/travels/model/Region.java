package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "regiones")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idregion")
    private Long idRegion;
    private String codigo;
    @Column(name = "nombreregion")
    private String nombreRegion;
    @ManyToOne
    @JoinColumn(name = "idpais", nullable = false)
    private Pais pais;
    @Column(name = "palabrasclaves")
    private String palabrasClave;
    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Aereopuerto> aereopuertos;
}
