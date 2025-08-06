package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "estadobilletes")
public class EstadoBillete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestadobillete")
    private Long idEstadoBillete;
    private String estado;
    @OneToMany(mappedBy = "estadoBillete", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Billete> billetes;
}
