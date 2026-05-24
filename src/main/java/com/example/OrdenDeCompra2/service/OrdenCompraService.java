package com.example.OrdenDeCompra2.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrdenDeCompra2.model.OrdenCompra;
import com.example.OrdenDeCompra2.repository.OrdenCompraRepository;

@Service
public class OrdenCompraService {
    @Autowired
    private OrdenCompraRepository ordenRepository;
    public void crearOrden(OrdenCompra orden) {
        orden.setFechaOrden(new Date());
        orden.setEstado("PENDIENTE");
        ordenRepository.save(orden);
    }

    
    public void cancelarOrden(Long idOrden) {
        Optional<OrdenCompra> ordenOpt = ordenRepository.findById(idOrden);
        
        if (ordenOpt.isPresent()) {
            OrdenCompra orden = ordenOpt.get();
            orden.setEstado("CANCELADA");
            ordenRepository.save(orden);
        } else {
            throw new RuntimeException("La orden con ID " + idOrden + " no existe.");
        }
    }

    
    public void actualizarEstado(Long idOrden, String nuevoEstado) {
        Optional<OrdenCompra> ordenOpt = ordenRepository.findById(idOrden);
        
        if (ordenOpt.isPresent()) {
            OrdenCompra orden = ordenOpt.get();
            orden.setEstado(nuevoEstado);
            ordenRepository.save(orden);
        } else {
            throw new RuntimeException("La orden con ID " + idOrden + " no existe.");
        }
    }

    // + getOrden() : OrdenCompra
    public OrdenCompra getOrden(Long idOrden) {
        Optional<OrdenCompra> ordenOpt = ordenRepository.findById(idOrden);
        
        if (ordenOpt.isPresent()) {
            return ordenOpt.get();
        } else {
        
            throw new RuntimeException("Orden no encontrada"); 
        }
    }
}
