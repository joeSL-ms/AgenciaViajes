package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(name = "primerapellido")
    private String primerApellido;
    @Column(name = "segundoapellido")
    private String segundoApellido;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    private String telefono;
    @OneToOne
    @JoinColumn(name = "iddocumentacion")
    private Documentacion documentacion;
    @ManyToOne
    @JoinColumn(name = "idgenero", nullable = false)
    private Genero genero;
    private String email;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;

    public Usuario() {
    }
}
