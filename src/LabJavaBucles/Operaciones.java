package LabJavaBucles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Operaciones {
    public static void cajaRegistradora() {
        Scanner scanner = new Scanner(System.in);
        int opcion, suma = 0;
        String guargar = "";
        do {
            System.out.println("Menu");
            System.out.println("1. Hamburguesa $50");
            System.out.println("2. Papas $30");
            System.out.println("3. Refresco $20");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Elegiste una Hamburguesa de $50, desea algo más? ");
                    guargar += "\n Lleva Hamburguesa";
                    suma += 50;
                    break;
                case 2:
                    System.out.println("Elegiste Papas de $30, desea algo más? ");
                    guargar += "\n Lleva Papas";
                    suma += 30;
                    break;
                case 3:
                    System.out.println("Elegiste un Refresco de $20, desea algo más? ");
                    guargar += "\n Lleva Refresco";
                    suma += 20;
                    break;
                case 4:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 4);
        System.out.println(guargar);
        double pago;
        System.out.println("Con cuanto va a cancelar? ");
        pago = scanner.nextDouble();
        System.out.println("Total a pagar: " + suma);
        System.out.println("Cambio: " + (pago - suma));
    }

    public static void calcularDescuentos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        double[] descuentos = {0.10, 0.20, 0.30, 0.40, 0.50};
        double total = 0;
        int cont = 10;
        for (int i = 0; i < descuentos.length; i++) {
            total = precio - (precio * descuentos[i]);
            System.out.println("Descuento del " + cont + "% : " + total);
            cont += 10;
        }
    }

    public static void tablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 10: ");
        int numero = scanner.nextInt();
        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabla del " + numero);
            int cont = 1;
            while (cont <= 10) {
                System.out.println(numero + " * " + cont + " = " + (numero * cont));
                cont++;
            }
        }
    }

    public static void cajeroAutomatic() {
        Scanner scanner = new Scanner(System.in);
        int opcion, suma = 0;
        double saldo = 4500000;
        do {
            System.out.println("Menu");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("**Consultar saldo**");
                    System.out.println("Su saldo actual es de: " + saldo);
                    break;
                case 2:
                    System.out.println("Retirar ");
                    System.out.println("Cuanto desea retirar?");
                    double retirar = scanner.nextDouble();
                    saldo -= retirar;
                    break;
                case 3:
                    System.out.println("Depositar ");
                    System.out.println("Cuanto desea depositar?");
                    double depositar = scanner.nextDouble();
                    saldo += depositar;
                    break;
                case 4:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opcion != 4);
    }

    public static void generaContrasena() {

    }

    public static void asistenciaClase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos estudiantes hay en el curso: ");
        int numEs = scanner.nextInt();
        scanner.nextLine();
        String[] lista = new String[numEs];
        for (int i = 0; i < numEs; i++) {
            System.out.println("Nombre del estudiante " + i);
            String nombre = scanner.nextLine();
            System.out.println("Esta " + nombre + " presente o ausente");
            String presente = scanner.nextLine();
            lista[i] = nombre + " esta " + presente;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public static void calcularPromedios(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas calificaciones desea ingresar? ");
        int cantidad = scanner.nextInt();
        int nota,promedio=0;
        for (int i = 1; i <= cantidad; i++){
            System.out.println("Ingresa Nota " + i);
            nota = scanner.nextInt();
            promedio += nota;
        }
        int total = promedio/cantidad;
        if (total < 6){
            System.out.println("Reprobado");
        } else if ((total >= 6) && (total <= 7.9)){
            System.out.println("Aprobado");
        }else{
            System.out.println("Excelente");
        }
    }
}
