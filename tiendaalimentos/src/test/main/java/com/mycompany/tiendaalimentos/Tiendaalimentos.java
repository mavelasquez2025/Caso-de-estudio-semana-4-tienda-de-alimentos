/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaalimentos;

public class Tiendaalimentos {
    public static void main(String[] args) {
        // Crear objetos de compra y venta
        Compra compra1 = new Compra(1, 101, 201, 5, 2500.0);
        Venta venta1 = new Venta(2, 101, 201, 3, 3500.0);

        // Mostrar transacciones
        System.out.println(compra1);
        System.out.println(venta1);

        // Simular envío y recepción de mensajes
        Productor productor = new Productor();
        Consumidor consumidor = new Consumidor();

        productor.enviarMensaje("Transacción realizada: " + compra1);
        consumidor.recibirMensaje("Procesada en sede central: " + compra1);
    }
}
