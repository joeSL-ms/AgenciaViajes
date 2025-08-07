package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
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
    private List<Pais> paises = new ArrayList<>();

    public Continente(){}

    public Continente(Long idContinente, String nombreContinente, String palabrasClaves) {
        this.idContinente = idContinente;
        this.nombreContinente = nombreContinente;
        this.palabrasClaves = palabrasClaves;
    }

    //Getters

    public Long getIdContinente() {
        return idContinente;
    }

    public String getNombreContinente() {
        return nombreContinente;
    }

    public String getPalabrasClaves() {
        return palabrasClaves;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    //Setters

    public void setIdContinente(Long idContinente) {
        this.idContinente = idContinente;
    }

    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    public void setPalabrasClaves(String palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}
