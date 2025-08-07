package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tipodocumentaciones")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddocumentacion")
    private Long idDocumentacion;
    @Column(name = "nombredocumentacion")
    private String nombreDocumentacion;
    @OneToMany(mappedBy = "tipoDocumentacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Documentacion> documentaciones = new ArrayList<>();
    public TipoDocumento() {}

    public TipoDocumento(Long idDocumentacion, String nombreDocumentacion) {
        this.idDocumentacion = idDocumentacion;
        this.nombreDocumentacion = nombreDocumentacion;
    }
    //Getters

    public Long getIdDocumentacion() {
        return idDocumentacion;
    }

    public String getNombreDocumentacion() {
        return nombreDocumentacion;
    }

    public List<Documentacion> getDocumentaciones() {
        return documentaciones;
    }

    //Setters

    public void setIdDocumentacion(Long idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public void setNombreDocumentacion(String nombreDocumentacion) {
        this.nombreDocumentacion = nombreDocumentacion;
    }

    public void setDocumentaciones(List<Documentacion> documentaciones) {
        this.documentaciones = documentaciones;
    }
    //Methods
}

