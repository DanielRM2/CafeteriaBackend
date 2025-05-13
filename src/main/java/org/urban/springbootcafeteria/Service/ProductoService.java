package org.urban.springbootcafeteria.Service;

import org.urban.springbootcafeteria.DTO.ProductoResponse;
import org.urban.springbootcafeteria.Entitie.Producto;
import org.urban.springbootcafeteria.Repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductoResponse> listarTodosLosProductos() {
        return productoRepository.findAll().stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    public List<ProductoResponse> listarProductosPorCategoria(Integer idCategoria) {
        return productoRepository.findByCategoria(idCategoria).stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }

    private ProductoResponse convertToResponse(Producto producto) {
        ProductoResponse response = new ProductoResponse();
        response.setIdProducto(producto.getIdProducto());
        response.setNombre(producto.getNombre());
        response.setDescripcion(producto.getDescripcion());
        response.setPrecio(producto.getPrecio());
        response.setImagen(producto.getImagen());

        if(producto.getCategoriaProducto() != null) {
            response.setIdCategoriaProducto(producto.getCategoriaProducto().getIdCategoriaProducto());
            response.setNombreCategoria(producto.getCategoriaProducto().getNombreCategoria());
        }

        return response;
    }
}