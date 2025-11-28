package LabJavaControlFlow;

import java.util.Scanner;

public class Operaciones {
    public static void descuentosSupermercado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el valor de tu compra: ");
        double valor = scanner.nextInt();
        System.out.println("Cantidad de productos: ");
        int cantidad = scanner.nextInt();
        System.out.println("Tiene Membresía?(true/false): ");
        boolean membresia = scanner.nextBoolean();

        double total = 0;
        if (membresia) {
            total = valor - (valor * 0.10);
        } else {
            total = valor;
        }
        if (cantidad >= 10) {
            total -= (valor * 0.05);
        }
        System.out.println(total);
    }

    public static void clasificacionMascotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de animal (perro, gato, ave, otro): ");
        String tipo = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese la edad del animal: ");
        int edad = scanner.nextInt();

        String mensaje = "";

        switch (tipo) {
            case "PERRO":
                mensaje = "canino";
                System.out.println("Dirigase con el mensaje " + mensaje);
                break;
            case "GATO":
                mensaje = "felino";
                System.out.println("Dirigase con el mensaje " + mensaje);
                break;
            case "AVE":
                mensaje = "animales exóticos";
                System.out.println("Dirigase con el mensaje de " + mensaje);
                break;
            case "OTRO":
                mensaje = "general";
                System.out.println("Dirigase con el mensaje " + mensaje);
                break;
            default:
                System.out.println("Ingrese de nuevo su mascota");
                break;
        }
        if ((edad > 5) && ((tipo.equals("PERRO")) || (tipo.equals("GATO")))) {
            System.out.println("Su mascota requiere una vacuna adicional debido a su edad");
        }
    }

    public static void accesoParqueadero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo (auto, moto, bicicleta): ");
        String tipoV = scanner.nextLine().toUpperCase();
        System.out.println("Ingrese la hora de llegada (0–23): ");
        int hora = scanner.nextInt();
        double costo = 0;
        if (tipoV.equals("AUTO")) {
            costo = 5.000;
        } else if (tipoV.equals("MOTO")) {
            costo = 3.000;
        } else if (tipoV.equals("BICICLETA")) {
            costo = 1.000;
        } else {
            System.out.println("Ingrese nuevamente su vehiculo");
        }
        if(hora  > 20){
            costo += costo*0.20;
        }
        System.out.println("Costo Final: "+costo);
    }
}




