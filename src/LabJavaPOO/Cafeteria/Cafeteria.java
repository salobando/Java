package LabJavaPOO.Cafeteria;

import java.util.ArrayList;

public class Cafeteria {
    String nombre;
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cafeteria(){
    }

    public Cafeteria(String nombre, ArrayList<Pedido> pedidos ){
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    public void pedidosRegistrados(){
        System.out.println("\nPedidos registrados en la cafeteria " + nombre);
        for (int i = 0; i<pedidos.toArray().length;i++){
            pedidos.get(i).mostrar();
        }
    }

    public void ventas(){
        for (int i = 0; i<pedidos.toArray().length;i++){
            if (pedidos.get(i).entregado){

            }
        }

    }
}
