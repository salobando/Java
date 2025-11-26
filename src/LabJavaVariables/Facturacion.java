package LabJavaVariables;

import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {
        String nomProduct;
        double precioProduct, dinero;
        final double impuesto = 0.21;
        int cantProduct;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombre del producto: ");
        nomProduct = scanner.nextLine();
        System.out.println("Ingresa precio del producto: ");
        precioProduct = scanner.nextInt();
        System.out.println("Ingresa cantidad del producto: ");
        cantProduct = scanner.nextInt();
        System.out.println("Ingresa el dinero que traes: ");
        dinero = scanner.nextInt();

        double subtotal = precioProduct * cantProduct;
        double totalAPagar = subtotal + (subtotal*impuesto);
        //casting del total por la promocion
        int totalRedondeado = (int) totalAPagar;

        boolean puedeComprar;

        if (dinero >= totalAPagar) {
            puedeComprar = true;
            System.out.println("Si te alcanza");
        } else {
            puedeComprar = false;
            System.out.println("No te alcanza");
        }
        System.out.println("\n********TICKET*******");
        System.out.println("Producto: " + nomProduct);
        System.out.println("Precio: " + precioProduct);
        System.out.println("Cantidad: " + cantProduct);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("TOTAL: " + totalAPagar);
        System.out.println("Compra aprobada? " + puedeComprar);
    }

    }

