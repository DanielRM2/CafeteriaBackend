package org.urban.springbootcafeteria.Entitie;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "MetodoEntrega")
@Data
public class MetodoEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMetodoEntrega;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(precision = 10, scale = 2)
    private BigDecimal costo;

}
