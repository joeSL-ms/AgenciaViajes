package com.agentTravel.travels.model;

import jakarta.persistence.*;

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
    private List<Documentacion> documentaciones;
    public TipoDocumento() {}

}

