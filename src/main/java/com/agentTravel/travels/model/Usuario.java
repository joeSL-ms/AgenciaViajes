package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
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
    private LocalDate fechaNacimiento;
    private String telefono;
    @OneToOne
    @JoinColumn(name = "iddocumentacion")
    private Documentacion documentacion;
    @ManyToOne
    @JoinColumn(name = "idgenero", nullable = false)
    private Genero genero;
    private String email;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, String telefono, Documentacion documentacion, Genero genero, String email) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.documentacion = documentacion;
        this.genero = genero;
        this.email = email;
    }
    //Getters

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public Documentacion getDocumentacion() {
        return documentacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDocumentacion(Documentacion documentacion) {
        this.documentacion = documentacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    //Methods
}

