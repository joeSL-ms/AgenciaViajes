package com.agentTravel.travels.model;

import jakarta.persistence.*;

import java.util.Date;
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
    private Date fechaNacimiento;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;
}
