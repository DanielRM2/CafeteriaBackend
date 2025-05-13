package org.urban.springbootcafeteria.Entitie;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Pedido")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idMetodoEntrega", nullable = false)
    private MetodoEntrega metodoEntrega;

    @ManyToOne
    @JoinColumn(name = "idDireccion")
    private DireccionCliente direccion;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date fechaPedido;

    private Date fechaEntrega;

    @Column(length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'Pendiente'")
    private String estado;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

}
