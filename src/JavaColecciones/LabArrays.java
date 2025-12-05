package JavaColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LabArrays {

    public static void listaTareas(){
        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Multivariado");
        tareas.add("TGS");
        tareas.add("Sistemas Distribuidos");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Agregar una tarea: ");
        String nueva = scanner.nextLine();
        tareas.add(nueva);
        System.out.println("Tareas disponibles " + tareas);

        System.out.println("Desea completar una tarea?, Cual?");
        String eliminar = scanner.nextLine();
        tareas.remove(eliminar);
        System.out.println("Tareas pendientes " + tareas);
    }

    public static void librosUnicos(){
        Set<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        libros.add("Cien Años de Soledad");
        libros.add("Ensayo sobre la ceguera");
        libros.add("Club de las 5 de la mañana");
        System.out.println("Agregar un libro: ");
        String nuevo = scanner.nextLine();
        libros.add(nuevo);
        System.out.println("Libros disponibles " + libros);
        System.out.println("Ingrese un libro a buscar: ");
        String buscar = scanner.nextLine();
        if (libros.contains(buscar)) {
            System.out.println("Si esta");
        } else {
            System.out.println("No esta");
        }
        int cont =0;
        for (int i =0; i<libros.toArray().length; i++){
            cont++;
        }
        System.out.println(cont);
    }

    public static void trabajadoreSalarios(){

    }
}
