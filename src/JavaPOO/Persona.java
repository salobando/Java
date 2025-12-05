package JavaPOO;

public class Persona {
    String nombre;
    int edad;

    Persona(){
        this.nombre = "";
    }

    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, "+nombre);
    }

    public static void metodoEstatico(){
        System.out.println("Hola desde metodo estatico ");
    }
}
