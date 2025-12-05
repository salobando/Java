package LabJavaPOO.Cine;

public class Main {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula("Zootopia 2", "infantil", 2.3, 20);
        Pelicula peli2 = new Pelicula("Navidad Inesperada", "familiar", 2, 40);
            Pelicula peli3 = new Pelicula("Los ilusionitas 3", "Acción", 2.5, 30);
        Sala sala1 = new Sala("2D", 2, 50, 10);
        Reserva reserva1 = new Reserva(peli1, sala1, "Danna");
        Reserva reserva2 = new Reserva(peli2, sala1, "Sofia");
        Reserva reserva3 = new Reserva(peli3, sala1, "Felipe");

        System.out.println("Detalles de las Peliculas: ");
        peli1.mostrarInfoPeli();
        peli2.mostrarInfoPeli();
        peli3.mostrarInfoPeli();

        System.out.println("\nEstado Actual Sala: ");
        sala1.estadoActual();

        System.out.println("\nDetalles Reserva 1: ");
        reserva1.mostrarInfo();

        System.out.println("\nDetalles Reserva 2: ");
        reserva2.mostrarInfo();

        System.out.println("\nDetalles Reserva 3: ");
        reserva3.mostrarInfo();
    }
}
