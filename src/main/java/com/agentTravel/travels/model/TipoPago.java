package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipospago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipopago")
    private Long idTipoPago;
    private String metodo;
    @OneToMany(mappedBy = "tipoPago", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;
}
