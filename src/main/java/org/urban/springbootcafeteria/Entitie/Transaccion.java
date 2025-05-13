package org.urban.springbootcafeteria.Entitie;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Transaccion")
@Data
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransaccion;

    @OneToOne
    @JoinColumn(name = "idPedido", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "idTipoPago", nullable = false)
    private TipoPago tipoPago;

    @Column(length = 50, columnDefinition = "VARCHAR(50) DEFAULT 'Pendiente'")
    private String estado;

    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date fechaTransaccion;

    @Column(length = 50)
    private String codigoOperacion;

    @Column(length = 255)
    private String comprobanteUrl;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal monto;

}