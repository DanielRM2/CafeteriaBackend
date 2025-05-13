package org.urban.springbootcafeteria.DTO;

import lombok.Data;
import java.util.Date;

@Data
public class ClienteResponse {
    private Integer idCliente;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private Date fechaNacimiento;

    // No incluimos la contraseña por seguridad

}