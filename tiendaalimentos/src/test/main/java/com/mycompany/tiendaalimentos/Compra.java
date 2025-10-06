/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaalimentos;

/**
 * Representa una transacción de compra.
 * Contiene datos específicos como el producto, cantidad y precio.
 * 
 * @author Angel Velasquez
 */
public class Compra extends Transaccion {
    private int idProducto;
    private int cantidad;
    private double precioUnitario;

    public Compra(int id, int idSucursal, int idProducto, int cantidad, double precioUnitario) {
        super(id, idSucursal);
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double totalCompra() {
        return cantidad * precioUnitario;
    }

    @Override
    public String toString() {
        return "Compra: Producto ID=" + idProducto + ", Cantidad=" + cantidad +
               ", Precio unitario=" + precioUnitario + ", Total=" + totalCompra();
    }
}

