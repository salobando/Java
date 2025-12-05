package JavaPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Persona
        Persona per = new Persona(); // instancia
        per.nombre = "Victoria";
        per.edad = 30;

        per.saludar();
        Persona per2 = new Persona("sara",28);

        //Libro
        Libros libro = new Libros("El Principito", "Antonie");

        libro.mostrarInfo();
        libro.mostrarComoLeido();

        //BANCO
        //Banco banco = new Banco();
        System.out.println("BIENVENIDO");
        Banco banco1 = new Banco("Danna",1234,5600000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor a depositar: ");
        double valor = scanner.nextDouble();
        banco1.depositar(valor);
        System.out.println("Ingrese el valor a retirar: ");
        double retirar = scanner.nextDouble();
        banco1.retirar(retirar);
    }
}
