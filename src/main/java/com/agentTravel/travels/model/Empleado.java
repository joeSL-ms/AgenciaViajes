package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempleado")
    private Long idEmpleado;
    private String nombre;
    @Column(name = "primerapellido")
    private  String primerApellido;
    @Column(name = "segundoapellido")
    private  String segundoApellido;
    @ManyToOne
    @JoinColumn(name = "idgenero", nullable = false)
    private  Genero genero;
    @Column(name = "fechanacimento")
    private LocalDate fechaNacimiento;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas = new ArrayList<>();

    public Empleado(){}

    public Empleado(Long idEmpleado, String nombre, String primerApellido, String segundoApellido, Genero genero, LocalDate fechaNacimiento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters

    public Long getIdEmpleado() {
        return idEmpleado;
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

    public Genero getGenero() {
        return genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    //Setters

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    //Methods
}
