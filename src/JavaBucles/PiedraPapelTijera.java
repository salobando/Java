package JavaBucles;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void juego() {
        System.out.println("BIENVENIDO");
        System.out.println("El primero en ganar 3 rondas gana el juego");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(3);
        int contUsuario = 0;
        int contPC = 0;
        // COMPARAR JUGADAS
        while (contUsuario <= 3 && contPC <= 3) {
            System.out.println("Ingresa la opcion:");
            String opcion = scanner.nextLine();

            String jugadaPC = "";

            //asignar jugada para Pc
            switch (numeroAleatorio) {
                case 1:
                    jugadaPC = "PIEDRA";
                    break;
                case 2:
                    jugadaPC = "PAPEL";
                    break;
                case 3:
                    jugadaPC = "TIJERA";
                    break;
                default:
                    break;
            }
            if (opcion.equalsIgnoreCase(jugadaPC)) {
                System.out.println("Hay empate");
            } else if (opcion.equalsIgnoreCase("PIEDRA") && jugadaPC.equalsIgnoreCase("PAPEL")) {
                System.out.println("Gana PC");
                contPC += 1;
            } else if (opcion.equalsIgnoreCase("PIEDRA") && jugadaPC.equalsIgnoreCase("TIJERA")) {
                System.out.println("Gana Usuario");
                contUsuario += 1;
            } else if (opcion.equalsIgnoreCase("PAPEL") && jugadaPC.equalsIgnoreCase("PIEDRA")) {
                System.out.println("Gana Usuario");
                contUsuario += 1;
            } else if (opcion.equalsIgnoreCase("PAPEL") && jugadaPC.equalsIgnoreCase("TIJERA")) {
                System.out.println("Gana PC");
                contPC += 1;
            } else if (opcion.equalsIgnoreCase("TIJERA") && jugadaPC.equalsIgnoreCase("PAPEL")) {
                System.out.println("Gana Usuario");
                contUsuario += 1;
            } else if (opcion.equalsIgnoreCase("TIJERA") && jugadaPC.equalsIgnoreCase("PIEDRA")) {
                System.out.println("Gana PC");
                contPC += 1;
            }
        }

    }
}
