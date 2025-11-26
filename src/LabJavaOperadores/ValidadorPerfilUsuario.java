package LabJavaOperadores;

import java.util.Scanner;

public class ValidadorPerfilUsuario {

    public static void datos(){

        Scanner scanner = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        double saldoCuenta;
        boolean esPremium = true;

        System.out.println("Ingresa tu nombre: ");
        nombreUsuario = scanner.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = scanner.nextInt();
        System.out.println("Ingresa saldo de la cuenta: ");
        saldoCuenta = scanner.nextDouble();
        System.out.println("Eres Premium?:(true/false) ");
        esPremium = scanner.nextBoolean();

        System.out.println("\n**********INFORMACIÓN*********");
        //accesoExclusivo
        boolean accesoExclusivo = (edad >= 18) && esPremium;
        System.out.println("Acceso Exclusivo: " + accesoExclusivo);

        //calificaPromocion
        boolean calificaPromocion = (saldoCuenta > 1000) || (edad < 25) ;
        System.out.println("Califica a la Promociono: " + calificaPromocion);

        //perfilIncompleto
        boolean perfilIncompleto = (saldoCuenta == 0) || (!nombreUsuario.equals("invitado"));
        System.out.println("Perfil Incompleto: " + perfilIncompleto);

        //perfilActivoTotal
        boolean perfilActivoTotal = (!perfilIncompleto) && (accesoExclusivo || calificaPromocion);
        System.out.println("Perfil Activo: " +perfilActivoTotal);
    }

}
