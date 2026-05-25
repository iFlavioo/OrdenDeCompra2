package com.example.OrdenDeCompra2.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table ( name = "orden de compra") 
public class OrdenCompra {

    private Long idOrden;
    private Long proveedorId;
    private String productoNombre;
    private int cantidad;
    private Date fechaOrden;
    private String estado;
}
