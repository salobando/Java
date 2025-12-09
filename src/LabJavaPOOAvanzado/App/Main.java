package LabJavaPOOAvanzado.App;

import LabJavaPOOAvanzado.Model.Reserva;
import LabJavaPOOAvanzado.Service.SistemaReservas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva(123, "camilo", "9 diciembre", 5);
        Reserva reserva2 = new Reserva(345, "sofia", "10 diciembre", 2);

        reserva.setCliente("Luis");

        SistemaReservas sis = new SistemaReservas();
        sis.agregarReserva(reserva);
        sis.agregarReserva(reserva2);
        sis.listarReservas();
        sis.contarReservas();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el id a eliminar: ");
        int id = scanner.nextInt();
        try {
            sis.eliminarReserva(id);
        }catch (IllegalArgumentException e){
            System.out.println("El id "+id+" "+e.getMessage());
        }
       sis.listarReservas();
    }
}
