package org.example;

import java.time.LocalDate;

public class Tipo3 extends Medicamento {
    private Double descuento = 0.08;
    public Tipo3(String nombre, Double precio, String fabricante, String invima, LocalDate fechaVencimiento, LocalDate fechaCreacion, Double cantidad) {
        super(nombre, precio, fabricante, invima, fechaVencimiento, fechaCreacion, cantidad);
    }

    @Override
    public Double calcularCosto() {
        Double costoProducto = this.getPrecio()*this.getCantidad();
        Double valorDescuento = costoProducto*descuento;
        Double valorTotal = costoProducto-valorDescuento;
        return valorTotal ;
    }

    @Override
    public Double calcularDescuento() {
        Double costoProducto = this.getPrecio()*this.getCantidad();
        Double valorDescuento = costoProducto*descuento;
        Double valorTotal = costoProducto-valorDescuento;
        return valorDescuento ;
    }
}
