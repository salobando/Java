package LabJavaPOO.Cafeteria;

public class Producto {
    String nombre;
    double precio;
    int cantidadVendida;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadVendida) {
        this.nombre = nombre;
        this.cantidadVendida = cantidadVendida;
        this.precio = precio;
    }

    public void venta() {
        System.out.println("Se vendió " +cantidadVendida+" unidades de "+nombre);
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad Vendida: " + cantidadVendida);
    }
}
