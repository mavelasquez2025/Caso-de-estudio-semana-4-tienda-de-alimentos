/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaalimentos;

/**
 * Representa una transacción de venta.
 * Similar a compra, pero usada para salida de productos.
 * 
 * @author Angel Velasquez
 */
public class Venta extends Transaccion {
    private int idProducto;
    private int cantidad;
    private double precioUnitario;

    public Venta(int id, int idSucursal, int idProducto, int cantidad, double precioUnitario) {
        super(id, idSucursal);
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double totalVenta() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "Venta: Producto ID=" + idProducto + ", Cantidad=" + cantidad +
               ", Precio unitario=" + precioUnitario + ", Total=" + totalVenta();
    }
}
