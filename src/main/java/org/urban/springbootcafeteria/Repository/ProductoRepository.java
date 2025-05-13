package org.urban.springbootcafeteria.Repository;

import org.urban.springbootcafeteria.Entitie.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    // Metodo para listar productos por categoría
    @Query("SELECT p FROM Producto p WHERE p.categoriaProducto.idCategoriaProducto = :idCategoria")
    List<Producto> findByCategoria(@Param("idCategoria") Integer idCategoria);

}