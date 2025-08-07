package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pasajeros")
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpasajero")
    private Long idPasajero;
    @Column(name = "nombrepasajero")
    private String nombrePasajero;
    @Column(name = "primerapellido")
    private String primerApellido;
    @Column(name = "segundoapellido")
    private String segundoApellido;
    @Column(name = "fechanacimiento")
    private LocalDate fechaNacimiento;
    @OneToOne
    @JoinColumn(name = "iddocumentacion", nullable = false)
    private Documentacion documentacion;
    @ManyToOne
    @JoinColumn(name = "idgenero", nullable = false)
    private Genero genero;
    @OneToMany(mappedBy = "pasajero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Billete> billetes = new ArrayList<>();

    public Pasajero(){}

    public Pasajero(Long idPasajero, String nombrePasajero, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, Documentacion documentacion, Genero genero) {
        this.idPasajero = idPasajero;
        this.nombrePasajero = nombrePasajero;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.documentacion = documentacion;
        this.genero = genero;
    }

    //Getters

    public Long getIdPasajero() {
        return idPasajero;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Documentacion getDocumentacion() {
        return documentacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    //Setters

    public void setIdPasajero(Long idPasajero) {
        this.idPasajero = idPasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDocumentacion(Documentacion documentacion) {
        this.documentacion = documentacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }
    //Methods
}
