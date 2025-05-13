package org.urban.springbootcafeteria.Controller;

import org.springframework.web.bind.annotation.*;
import org.urban.springbootcafeteria.DTO.ProductoResponse;
import org.urban.springbootcafeteria.Service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoResponse> listarTodosLosProductos() {
        return productoService.listarTodosLosProductos();
    }

    @GetMapping("/categoria/{idCategoria}")
    public List<ProductoResponse> listarProductosPorCategoria(@PathVariable Integer idCategoria) {
        return productoService.listarProductosPorCategoria(idCategoria);
    }
}