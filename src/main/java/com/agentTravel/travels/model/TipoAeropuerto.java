package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
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
    private List<Aereopuerto> aereopuertos = new ArrayList<>();

    public TipoAeropuerto(){}

    public TipoAeropuerto(Long idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
    }

    //Getters

    public Long getIdTipo() {
        return idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public List<Aereopuerto> getAereopuertos() {
        return aereopuertos;
    }

    //Setters

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public void setAereopuertos(List<Aereopuerto> aereopuertos) {
        this.aereopuertos = aereopuertos;
    }
    //Methods
}
