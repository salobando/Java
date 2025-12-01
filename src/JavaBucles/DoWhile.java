package JavaBucles;

import java.util.Scanner;

public class DoWhile {
    public static void ejemplo1(){
        int intentos =1;

        do {
            System.out.println("Num intentos " + intentos);
            intentos++;
        }while (intentos <= 10);
    }

    public static void ejemplo2(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Papitas");
            System.out.println("2. Gratinadas");
            System.out.println("3. En salsa");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Elegiste papitas");
                    break;
                case 2:
                    System.out.println("Elegiste gratinadas");
                    break;
                case 3:
                    System.out.println("Elegiste en salsa");
                    break;
                case 4:
                    System.out.println("Gracias por venir");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(opcion != 4);
    }
}
