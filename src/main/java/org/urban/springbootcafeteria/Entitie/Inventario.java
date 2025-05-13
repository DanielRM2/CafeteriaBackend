package org.urban.springbootcafeteria.Entitie;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Inventario")
@Data
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInventario;

    @OneToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidadDisponible = 0;
}
