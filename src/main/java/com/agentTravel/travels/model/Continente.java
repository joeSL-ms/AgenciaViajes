package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "continentes")
public class Continente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontinente")
    private Long idContinente;
    @Column(name = "nombrecontinente")
    private String nombreContinente;
    @Column(name = "palabrasclace")
    private  String palabrasClaves;
    @OneToMany(mappedBy = "continente" ,cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pais> paises;
}
