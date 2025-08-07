package com.agentTravel.travels.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "generos")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgenero")
    private Long idGenero;
    @Column(name = "nombregenero")
    private String nombreGenero;
    @OneToMany(mappedBy = "genero")
    private List<Usuario> usuarios = new ArrayList<>();
    @OneToMany(mappedBy = "genero")
    private List<Empleado> empleados = new ArrayList<>();
    // Si querés más relaciones
    @OneToMany(mappedBy = "genero")
    private List<Pasajero> pasajeros = new ArrayList<>();

    public Genero() {
    }

    public Genero(Long idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.nombreGenero = nombreGenero;
    }
    //Getters

    public Long getIdGenero() {
        return idGenero;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    //Setters

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
    //Methods
}

