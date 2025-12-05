package LabJavaPOO.Cafeteria;

public class Pedido {
    int id, cantComprada;
    Producto producto;
    boolean entregado = false;


    public Pedido() {
    }

    public Pedido(int id, Producto producto,int cantComprada) {
        this.id = id;
        this.cantComprada = cantComprada;
        this.producto = producto;
    }

    public void entregado() {
        entregado = true;
        System.out.println("El pedido fue entregado");
        producto.venta();
        cantComprada = producto.cantidadVendida;
        System.out.println("Se compró " +cantComprada+" unidades de "+producto.nombre);
    }

    public void total(){
        double total = producto.precio*cantComprada;
        System.out.println("Total: "+ total);
    }

    public void mostrar() {
        System.out.println("***Detalles del Pedido***");
        System.out.println("Producto: " + producto.nombre);
        System.out.println("Precio: " + producto.precio);
        total();
    }
}
