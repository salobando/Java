package JavaColecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

    public static void ejemplo(){
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("fresa");
        frutas.add("sandia");

        //Añadir en una posición
        frutas.add(2,"Uva");

        //Eliminar elemento
        frutas.remove("Uva");

        //Acceder al elemento con indice
        String datoEspecifico = frutas.get(2);
        System.out.println("Indice 2: " + datoEspecifico);

        //Busqueda
        boolean tieneONo = frutas.contains("Melones");

        System.out.println("¿Hay melones? " + tieneONo);
    }

    public static void ejemplo2() {
        ArrayList<String> nombres = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa nombres, si quiere terminar es fin");
        String nombre = scanner.nextLine();
        while (!(nombre.equals("fin"))) {
            nombres.add(nombre);
        }
        System.out.println("Ingresa nombre a buscar");
        String nombreBusqueda = scanner.nextLine();
        nombreBusqueda = nombreBusqueda.toLowerCase();
        if (nombres.contains(nombreBusqueda)) {
            System.out.println("Si esta");
        } else {
            System.out.println("No esta");
        }

        //impresion
//        for (int i=0; i<nombres.length(); i++){
//            System.out.println(i);
//        }
        //foreach
        for (String name: nombres){
            System.out.println(name);
        }
    }

}
