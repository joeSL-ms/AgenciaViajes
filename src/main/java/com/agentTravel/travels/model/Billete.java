package com.agentTravel.travels.model;

import com.fasterxml.jackson.datatype.jsr310.deser.JSR310DateTimeDeserializerBase;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "billetes")
public class Billete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbillete")
    private Long idBillete;
    @Column(name = "fechaida")
    private Date fechaIda;
    @Column(name = "fechavuelta")
    private  Date fechaVuelta;
    private String asiento;
    @ManyToOne
    @JoinColumn(name = "tipopasajero",nullable = false)
    private TipoPasajero tipoPasajero;
    @ManyToOne
    @JoinColumn(name = "idpasajero", nullable = false)
    private Pasajero pasajero;
    @ManyToOne
    @JoinColumn(name = "idestadobillete")
    private EstadoBillete estadoBillete;
    private BigDecimal precio;
    @Column(name = "fechacreacion")
    private LocalDateTime  fechaCreacion;
    @Column(name = "fechamodificacion")
    private LocalDateTime fechaModificacion;
    @ManyToOne
    @JoinColumn(name = "idorigen", nullable = false)
    private Aereopuerto origen;
    @ManyToOne
    @JoinColumn(name = "iddestino", nullable = false)
    private Aereopuerto destino;
    @OneToMany(mappedBy = "billete", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<DetalleFacturaBillete> detalleFacturaBilletes;
}
