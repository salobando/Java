package JavaBasicos;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int edad = 60;
        int temperatura = 30;

        System.out.println("la edad es: " + edad);

        System.out.println("1. tipos de enteros");
        byte mybite = 127;//hasta 127
        short miShort = 32000;
        int mynumero = 18800;
        long poblacionMundial = 8000000000L;
        double numDouble = 0.23232;
        float numFloat = 0.23232f;
        boolean esTrue = true;
        char letra ='A';
        char caracter ='@';

        System.out.println("2. Casting Conversion de datos");

        //? Casting implicito
        int num1 = 100;
        double nuevo = num1;

        //? Casting explicito
        double notaFinal = 3.5;
        int notaEntera = (int)notaFinal;
        System.out.println("Nota Entera: "+ notaEntera);

        //! inferencias
        var otro = 10;
        var otro1 = "ppppp";

        System.out.println("3. Casting Conversion de datos");
        int prueba = 20;
        int prueba1 = 5;
        System.out.println("Div correcta: "+ ((double)prueba/prueba1));

        prueba++;
        System.out.println(prueba);

        System.out.println("4. operadores de comparacion");
        boolean esMayor = prueba > prueba1;
        boolean esIgual = prueba == prueba1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        int otraedad = scanner.nextInt();
        System.out.println("Su edad es: " + otraedad);

        //!Limpiar el buffer
        scanner.nextLine();

        System.out.println("Dime tu nombre: ");
        String nomb = scanner.nextLine();
        System.out.println("Su edad es: " + otraedad);

        scanner.close();
    }
}