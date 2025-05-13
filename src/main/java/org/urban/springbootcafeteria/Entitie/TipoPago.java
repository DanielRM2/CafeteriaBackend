package org.urban.springbootcafeteria.Entitie;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TipoPago")
@Data
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoPago;

    @Column(nullable = false, unique = true, length = 50)
    private String nombre;

}
