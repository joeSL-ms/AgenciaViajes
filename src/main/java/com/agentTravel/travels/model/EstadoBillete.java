package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
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
    private List<Billete> billetes = new ArrayList<>();

    public EstadoBillete(){}

    public EstadoBillete(Long idEstadoBillete, String estado) {
        this.idEstadoBillete = idEstadoBillete;
        this.estado = estado;
    }

    //Getters

    public Long getIdEstadoBillete() {
        return idEstadoBillete;
    }

    public String getEstado() {
        return estado;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    //Setters

    public void setIdEstadoBillete(Long idEstadoBillete) {
        this.idEstadoBillete = idEstadoBillete;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }

    //Methods
}
