/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaalimentos;


import java.util.HashMap;

/**
 *
 * @author Angel Velasquez
 */
public class CacheProduct {
    
    private static HashMap<Integer, String> cacheProductos = new HashMap<>();

    public void agregarProducto(int id, String nombre) {
        cacheProductos.put(id, nombre);
        System.out.println("Producto agregado al caché: " + nombre);
    }

    public String obtenerProducto(int id) {
        String producto = cacheProductos.get(id);
        if (producto != null) {
            System.out.println("Producto obtenido desde caché: " + producto);
        } else {
            System.out.println("Producto no encontrado en caché.");
        }
        return producto;
    }

    public void mostrarProductos() {
        System.out.println("Productos en caché: " + cacheProductos);
    }
}
