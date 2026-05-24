package com.example.OrdenDeCompra2.model;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrdenCompra {

    private Long idOrden;
    private Long proveedorId;
    private String productoNombre;
    private int cantidad;
    private Date fechaOrden;
    private String estado;
}
