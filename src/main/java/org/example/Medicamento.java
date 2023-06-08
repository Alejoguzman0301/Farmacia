package org.example;

import java.time.LocalDate;

public abstract class  Medicamento {
    private String nombre;
    private Double precio;
    private String fabricante;
    private String invima;
    private LocalDate fechaVencimiento;
    private LocalDate fechaCreacion;
    private Double  cantidad;



    public Medicamento(String nombre, Double precio, String fabricante, String invima, LocalDate fechaVencimiento, LocalDate fechaCreacion, Double  cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
        this.invima = invima;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaCreacion = fechaCreacion;
        this.cantidad = cantidad;
    }

    public abstract Double calcularCosto();
    public abstract Double calcularDescuento();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getInvima() {
        return invima;
    }

    public void setInvima(String invima) {
        this.invima = invima;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Double  getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
