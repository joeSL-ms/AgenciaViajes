package com.agentTravel.travels.model;

import jakarta.persistence.*;

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
    private List<Billete> billetes;
}
