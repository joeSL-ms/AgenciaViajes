package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipoaeropuertos")
public class TipoAeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo")
    private Long idTipo;
    @Column(name = "nombretipo")
    private String nombreTipo;
    @OneToMany(mappedBy = "tipoAeropuerto",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Aereopuerto> aereopuertos;
}
