package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.Date;
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
    private Date fechaNacimiento;
    @OneToOne
    @JoinColumn(name = "iddocumentacion", nullable = false)
    private Documentacion documentacion;
    @ManyToOne
    @JoinColumn(name = "idgenero", nullable = false)
    private Genero genero;
    @OneToMany(mappedBy = "pasajero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Billete> billetes;

}
