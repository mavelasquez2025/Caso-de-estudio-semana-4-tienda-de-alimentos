/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaalimentos;

import java.time.LocalDateTime;

/**
 * Clase base para representar cualquier tipo de transacción
 * (compra o venta) realizada en una sucursal.
 * 
 * @author Angel Velasquez
 */
public class Transaccion {
    private int id;
    private LocalDateTime fechaHora;
    private int idSucursal;

    public Transaccion(int id, int idSucursal) {
        this.id = id;
        this.idSucursal = idSucursal;
        this.fechaHora = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    @Override
    public String toString() {
        return "Transacción [ID=" + id + ", Fecha=" + fechaHora + ", Sucursal=" + idSucursal + "]";
    }
}
