package LabJavaPOO.Cine;

public class Pelicula {
    String titulo, genero;
    double duracion;
    int cantidadEntradas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, double duracion, int cantidadEntradas) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.cantidadEntradas = cantidadEntradas;
    }

    public void venderEntrada(int cant) {
        if (cant > cantidadEntradas) {
            System.out.println("Lo sentimos, la cantidad de entradas es superior a las existentes");
        } else {
            cantidadEntradas -= cant;
            System.out.println("Cantidad de Entradas compradas: " + cant);
        }
    }

    void mostrarInfoPeli(){
        System.out.println("Película: "+titulo + " | Género: "+ genero +" | Duración: " + duracion + " | Entradas Disponibles: "+cantidadEntradas);
    }

}
