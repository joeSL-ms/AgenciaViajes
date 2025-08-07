package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
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
    private List<Aereopuerto> aereopuertos = new ArrayList<>();

    public Region(){}

    public Region(Long idRegion, String codigo, String nombreRegion, Pais pais, String palabrasClave) {
        this.idRegion = idRegion;
        this.codigo = codigo;
        this.nombreRegion = nombreRegion;
        this.pais = pais;
        this.palabrasClave = palabrasClave;
    }

    //Getters

    public Long getIdRegion() {
        return idRegion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public Pais getPais() {
        return pais;
    }

    public String getPalabrasClave() {
        return palabrasClave;
    }

    public List<Aereopuerto> getAereopuertos() {
        return aereopuertos;
    }

    //Setters

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setPalabrasClave(String palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public void setAereopuertos(List<Aereopuerto> aereopuertos) {
        this.aereopuertos = aereopuertos;
    }
    //Methods
}
