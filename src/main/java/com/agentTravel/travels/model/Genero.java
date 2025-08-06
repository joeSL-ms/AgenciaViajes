package com.agentTravel.travels.model;


import jakarta.persistence.*;
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
    private List<Usuario> usuarios;
    @OneToMany(mappedBy = "genero")
    private List<Empleado> empleados;
    // Si querés más relaciones
    @OneToMany(mappedBy = "genero")
    private List<Pasajero> pasajeros;

    public Genero() {
    }

}

