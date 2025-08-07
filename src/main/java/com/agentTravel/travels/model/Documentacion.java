package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "documentos")
public class Documentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddocumento")
    private Long idDocumento;
    @Column(name = "numerodocumento")
    private String numeroDocumento;
    @Column(name = "fechaexpedicion")
    private LocalDate fechaExpedicion;
    @ManyToOne
    @JoinColumn(name = "idtipodocumento", nullable = false)
    private TipoDocumento tipoDocumentacion;

    public Documentacion() {
    }

    public Documentacion(Long idDocumento, String numeroDocumento, LocalDate fechaExpedicion, TipoDocumento tipoDocumentacion) {
        this.idDocumento = idDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaExpedicion = fechaExpedicion;
        this.tipoDocumentacion = tipoDocumentacion;
    }
    //Getters

    public Long getIdDocumento() {
        return idDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public TipoDocumento getTipoDocumentacion() {
        return tipoDocumentacion;
    }

    //Setters

    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public void setTipoDocumentacion(TipoDocumento tipoDocumentacion) {
        this.tipoDocumentacion = tipoDocumentacion;
    }
}

