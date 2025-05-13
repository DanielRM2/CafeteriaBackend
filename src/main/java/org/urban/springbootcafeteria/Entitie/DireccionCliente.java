package org.urban.springbootcafeteria.Entitie;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DireccionCliente")
@Data
public class DireccionCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDireccion;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @Column(nullable = false, length = 255)
    private String direccion;

    @Column(length = 100)
    private String referencia;

    @Column(length = 50)
    private String distrito;
}