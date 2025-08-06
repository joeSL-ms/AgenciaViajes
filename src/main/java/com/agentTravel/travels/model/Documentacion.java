package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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
    private Date fechaExpedicion;
    @ManyToOne
    @JoinColumn(name = "idtipodocumento", nullable = false)
    private TipoDocumento tipoDocumentacion;

    public Documentacion() {
    }

}

