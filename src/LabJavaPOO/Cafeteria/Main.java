package LabJavaPOO.Cafeteria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Manzana", 2500, 50);
        Producto producto2 = new Producto("Pera", 3000, 20);
        Producto producto3 = new Producto("Arandanos", 7800, 10);

        Pedido pedido1 = new Pedido(123, producto1, 5);
        Pedido pedido11 = new Pedido(123, producto2, 1);
        Pedido pedido12 = new Pedido(123, producto3, 2);
        Pedido pedido2 = new Pedido(456, producto2, 2);
        Pedido pedido3 = new Pedido(789, producto3, 3);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido11);
        pedidos.add(pedido12);

        Cafeteria cafeteria1 = new Cafeteria("Dulcesitos", pedidos);
        cafeteria1.pedidosRegistrados();
    }
}
