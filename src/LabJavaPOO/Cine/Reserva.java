package LabJavaPOO.Cine;

import java.util.Scanner;

public class Reserva {
    Pelicula peli;
    Sala sala;
    String nombreCliente;

    public Reserva(){
    }
    public Reserva(Pelicula peli, Sala sala, String nombreCliente){
        this.peli = peli;
        this.sala = sala;
        this.nombreCliente = nombreCliente;
    }

    public void realizarReserva(){
        peli.mostrarInfoPeli();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas entras desea? ");
        int entradas = scanner.nextInt();
        if (entradas > 0){
            peli.venderEntrada(entradas);
            sala.ocuparAsiento(entradas);
            sala.estadoActual();
            System.out.println("La reserva fue exitosa!");
        }else {
            System.out.println("Ingrese una entrada valida");
        }
    }

    void mostrarInfo(){
        System.out.println("***Detalles Reserva***");
        System.out.println("Nombre: "+nombreCliente);
        System.out.println("Película: "+peli.titulo + " | Duración: " + peli.duracion );
        System.out.println("Sala: " +sala.id + " Tipo: " + sala.tipo );
    }
}
