package JavaBucles;

import java.util.Scanner;

public class While {

    public static void ejemplo(){
        int contador = 1;
        while (contador <= 3){
            System.out.println("Iteración: " + contador);
            contador++;
        }
        System.out.println(contador);
    }

    public static void ejemplo2(){
        boolean bandera = true;
        Scanner scanner = new Scanner(System.in);
        String opcion;
        while (bandera){
            System.out.println("¿Quieres pasar el curso? si/no");
            opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("si")){
                System.out.println("Super felicitaciones");
                bandera = false;
            }else{
                System.out.println("Muy mal");
            }
        }
    }

    public static void ejemplo3(){
        final String usuario = "admin";
        final String contrasena = "1234";
        int intentos = 1;
        //3 intentos
        Scanner scanner = new Scanner(System.in);
        while (intentos <= 3){
            System.out.println("Ingresa tu usuario: ");
            String usu = scanner.nextLine();
            System.out.println("Ingresa tu contraseña: ");
            String clave = scanner.nextLine();
            if (usu.equals(usuario) && clave.equals(contrasena)){
                System.out.println("Excelente, puedes ingresar");
                intentos=4;
            }else{
                System.out.println("Ingresa de nuevo tu usuario y contraseña");
                intentos++;
                if (intentos == 4){
                    System.out.println("Ya no te quedan más intentos");
                }
            }
        }
    }

}
