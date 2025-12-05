package JavaMetodos;

public class Refactorizacion {

    public static void calculando() {
        double precio1 = 100;
        double des = 0.8;
        double descuento = aplicarDescuento(precio1, des);
        double totalIva = aplicarIva(descuento);
        System.out.println("Producto 1: $" + totalIva);

        double precio2 = 350;
        double des2 = 0.9;
        double descuento2 = aplicarDescuento(precio2, des2);
        double totalIva2 = aplicarIva(descuento2);
        System.out.println("Producto 2: $" + totalIva2);
    }

    public static double aplicarDescuento(double precio, double des) {
        double descuento = precio - (precio * des);
        return descuento;
    }

    public static double aplicarIva(double descuento) {
        double iva = descuento + (descuento * 1.19);
        return iva;
    }

}
