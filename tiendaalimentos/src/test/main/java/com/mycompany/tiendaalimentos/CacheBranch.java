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
public class CacheBranch {
    
    // HashMap simula el almacenamiento en caché
    private static HashMap<Integer, String> cacheSucursales = new HashMap<>();

    // Método para agregar una sucursal al caché
    public void agregarSucursal(int id, String nombre) {
        cacheSucursales.put(id, nombre);
        System.out.println("Sucursal agregada al caché: " + nombre);
    }

    // Método para obtener una sucursal desde el caché
    public String obtenerSucursal(int id) {
        String sucursal = cacheSucursales.get(id);
        if (sucursal != null) {
            System.out.println("Sucursal obtenida desde caché: " + sucursal);
        } else {
            System.out.println("Sucursal no encontrada en caché.");
        }
        return sucursal;
    }

    // Método para mostrar todas las sucursales almacenadas en caché
    public void mostrarSucursales() {
        System.out.println("Sucursales en caché: " + cacheSucursales);
    }
}

