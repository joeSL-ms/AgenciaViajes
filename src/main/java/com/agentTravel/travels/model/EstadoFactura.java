package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estadofacturas")
public class EstadoFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestado")
    private Long idEstado;
    private String estado;
    @OneToMany(mappedBy = "estadoFactura", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Factura> facturas;
}
