package LabJavaPOO.Cine;

public class Sala {
    String tipo;
    int id, capacidadTot, cantAsientosOcupados;

    public Sala() {
    }

    public Sala(String tipo, int id, int capacidad, int cantAsientosOcupados) {
        this.tipo = tipo;
        this.id = id;
        this.capacidadTot = capacidad;
        this.cantAsientosOcupados = cantAsientosOcupados;
    }

    public void ocuparAsiento(int cant) {
        if (cant > capacidadTot) {
            System.out.println("Lo sentimos, las reservas superan la capacidad de la sala");
        } else {
            cantAsientosOcupados += cant;
            System.out.println("Cantidad de asientos comprados: " + cant);
        }
    }

    public void estadoActual() {
        System.out.println("Capacidad de la sala: " + capacidadTot);
        System.out.println("Asientos Ocupados: " + cantAsientosOcupados);
        System.out.println("Asientos Libres: " + (capacidadTot - cantAsientosOcupados));
    }
}
